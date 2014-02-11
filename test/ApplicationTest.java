import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.*;

import static org.junit.Assert.*;

import play.mvc.*;
import play.test.*;
import play.data.DynamicForm;
import play.data.validation.ValidationError;
import play.data.validation.Constraints.RequiredValidator;
import play.i18n.Lang;
import play.libs.F;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

import models.*;


/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest {

    public Carte carte;

    public Gc infanterieB;
    public Gc infanterieR;

    public ApplicationTest(){
        Gc.Couleur [] equipes = {
            Gc.Couleur.bleu,
            Gc.Couleur.rouge
        };

        carte = new Carte(10, equipes);

        infanterieB = new Gc(Gc.Couleur.bleu, 0, 0);
        infanterieR = new Gc(Gc.Couleur.rouge, 9, 9);
    }

    /**
     * Test sur une attaque
     */
    public void donneAttaque(Gc att, Gc def, Integer pvrestant) {

        Boolean effectuer = att.attaque(def);

        assertThat(def.getPv()).isEqualTo(pvrestant);
        
        if(effectuer) assertThat(att.getPm()).isEqualTo(0);
        else assertThat(att.getPm()).isEqualTo(2);

        if(pvrestant > 0){
            assertThat(def.estMort()).isEqualTo(Boolean.FALSE);
        } else {
            assertThat(def.estMort()).isEqualTo(Boolean.TRUE);
        }
    }

    public void passerTour(Carte theCarte,
            Integer theNbTour,
            Gc.Couleur theCouleur){
        assertThat(theCarte.getCompteur()).isEqualTo(theNbTour);
        assertThat(theCarte.getEquipeActuelle()).isEqualTo(theCouleur);
    }

    public void verifCase(Case theCase, Gc theGc){
        if(theGc != null){
            assertThat(theCase.estVide()).isEqualTo(Boolean.FALSE);
            assertThat(theCase.getGc().getEquipe()).isEqualTo(theGc.getEquipe());
        } else {
            assertThat(theCase.estVide()).isEqualTo(Boolean.TRUE);
        }
    }

    @Test
    public void initialisation(){

        verifCase(carte.getCase(0, 0), infanterieB);
        verifCase(carte.getCase(9, 9), infanterieR);

    }

    @Test
    public void tour(){

        passerTour(carte, 0, Gc.Couleur.bleu);
        carte.finTour();
        passerTour(carte, 1, Gc.Couleur.rouge);

    }

    @Test
    public void mouvement(){

        infanterieB.mouvement(carte.getCarte(), 0, 4);

        verifCase(carte.getCase(0, 0), infanterieB);
        verifCase(carte.getCase(0, 4), null);

        infanterieB.mouvement(carte.getCarte(), 0, 2);

        verifCase(carte.getCase(0, 2), infanterieB);
        verifCase(carte.getCase(0, 0), null);

        infanterieB.mouvement(carte.getCarte(), 0, 1);

        verifCase(carte.getCase(0, 2), infanterieB);
        verifCase(carte.getCase(0, 1), null);
    }

    @Test
    public void attaque(){
        donneAttaque(infanterieB, infanterieR, 100);
        Gc infanterieR2 = new Gc(Gc.Couleur.rouge, 1, 0);
        donneAttaque(infanterieB, infanterieR2, 90);
    }

}
