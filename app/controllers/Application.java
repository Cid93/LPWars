package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import models.Carte;
import models.Case;
import models.Gc;

public class Application extends Controller {

    public static Result index() {
    	Carte carte = new Carte();
    	Case mycase = new Case();
    	Gc gc = new Gc();
        return ok(index.render("LPWars"));
    }

}
