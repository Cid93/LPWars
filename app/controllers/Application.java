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
        return ok(plateau.render("LPWars", carte));
    }

    public static Result info(Integer i, Integer j) {
    	Gc.Couleur [] equipes = {Gc.Couleur.bleu, Gc.Couleur.rouge};
    	Carte carte = new Carte(10, equipes);
        return ok(plateau.render("LPWars", carte));
    }

}
