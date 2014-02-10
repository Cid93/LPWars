package models;

import play.utils.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

/**
 * Classe gerant le plateau de jeu
 */
public class Carte{

	/**
	 * Tableau de case faisant office du plateau
	 * @see Case
	 */
    private Case [][] carte;

	/**
	 * Getters and setters
	 */

	public Case getCase(Integer i, Integer j){
		return this.carte[i][j];
	}

	public void setcase(Integer i, Integer j, Case theCase){
		this.carte[i][j] = theCase;
	}

	public Carte(){
		carte = null;
	}

	public Carte(Integer theCote){
		carte = new Case[theCote][theCote];
	}

}