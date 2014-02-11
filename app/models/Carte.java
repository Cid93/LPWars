package models;

import play.utils.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

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
	 * Variable comptant le nombre de tours de jeu
	 */
	private Integer compteur;

	private List<Gc.Couleur> equipes;
	private Iterator<Gc.Couleur> equipeActuelle;

	/**
	 * Getters and setters
	 */

	public Case getCase(Integer i, Integer j){
		return this.carte[i][j];
	}

	public Integer getCompteur(){
		return this.compteur;
	}

	public Gc.Couleur getEquipeActuelle(){
		return this.equipeActuelle.next();
	}

	public void setcase(Integer i, Integer j, Case theCase){
		this.carte[i][j] = theCase;
	}

	public Carte(){
		carte = null;
		equipes = null;
		compteur = 0;
	}

	public Carte(Integer theCote, Gc.Couleur [] theEquipes){
		carte = new Case[theCote][theCote];
		/*equipes = new LinkedList<Gc.Couleur>();
		for(Gc.Couleur newOne : theEquipes){
			equipes.add(newOne);
		}*/
	}

	public void finTour(){
		// TODO
		return;
	}

}