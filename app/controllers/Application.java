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
        return ok(index.render("LPWars"));
    }

}
