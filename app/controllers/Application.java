package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import models.Carte;
import models.Case;
import models.Gc;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("LPWars"));
    }

    public static Result plateau() {
        Gc.Couleur [] equipes = {Gc.Couleur.bleu, Gc.Couleur.rouge};
        Carte carte = new Carte(10, equipes);
        return ok(plateau.render("LPWars", carte, null, null));
    }

    public static Result fin() {
        Gc.Couleur [] equipes = {Gc.Couleur.bleu, Gc.Couleur.rouge};
        Carte carte = new Carte(10, equipes);
        carte.finTour();
        return ok(plateau.render("LPWars", carte, null, null));
    }

    public static Result info(Integer i, Integer j) {
        Gc.Couleur [] equipes = {Gc.Couleur.bleu, Gc.Couleur.rouge};
        Carte carte = new Carte(10, equipes);
        return ok(plateau.render("LPWars", carte, i, j));
    }

    public static Result sedeplacer(Integer i, Integer j,
    		Integer thei, Integer thej) {
        Gc.Couleur [] equipes = {Gc.Couleur.bleu, Gc.Couleur.rouge};
        Carte carte = new Carte(10, equipes);
        carte.getCase(i, j).getGc().mouvement(carte.getCarte(), thei, thej);
        return ok(plateau.render("LPWars", carte, thei, thej));
    }
    
    public static Result attaquer() {
        Gc.Couleur [] equipes = {Gc.Couleur.bleu, Gc.Couleur.rouge};
        Carte carte = new Carte(10, equipes);
        return ok(plateau.render("LPWars", carte, null, null));
    }

}
