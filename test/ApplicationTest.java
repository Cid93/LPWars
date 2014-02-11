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

    /**
     * Test sur une attaque
     */
    public void donneAttaque(Gc att, Gc def, Integer pvrestant) {

        att.attaque(def);

        assertThat(def.getPv()).isEqualTo(pvrestant);
        assertThat(att.getPm()).isEqualTo(0);

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

    @Test
    public void attaque(){
        donneAttaque(new Gc(), new Gc(), 90);
    }

    @Test
    public void tour(){
        Gc.Couleur [] equipes = {
            Gc.Couleur.bleu,
            Gc.Couleur.rouge
        };
        Carte carte = new Carte(10, equipes);

        passerTour(carte, 0, Gc.Couleur.bleu);
        carte.finTour();
        passerTour(carte, 1, Gc.Couleur.rouge);
    }
}
