package models;

import play.utils.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

/**
 * Classe gerant les groupes de combats
 */
public class Gc{

	/**
	 * Point de vie du GC
	 * en pourcent
	 */
	private Integer pv;

	/**
	 * Point d'attaque du GC
	 */
	private Integer pa;

	/**
	 * Point de mouvement
	 */
	private Integer pm;

	/**
	 * Equipe du GC
	 */
	public enum Couleur{bleu, rouge};
	private Couleur equipe;

	/**
	 * Getters and setters
	 */
	public Integer getPv(){
		return this.pv;
	}

	public Integer getPa(){
		return this.pa;
	}

	public Integer getPm(){
		return this.pm;
	}

	public Couleur getEquipe(){
		return this.equipe;
	}

	public void setPv(Integer thePv){
		this.pv = thePv;
	}

	public void setPa(Integer thePa){
		this.pa = thePa;
	}

	public void setPm(Integer thePm){
		this.pm = thePm;
	}

	public void setEquipe(Couleur theEquipe){
		this.equipe = theEquipe;
	}

	public Gc(){
		pv = 100;
		pa = 10;
		pm = 2;
		equipe = Couleur.bleu;
	}

	public Boolean estMort(){
		return (pv <= 0);
	}

	public void attaque(Gc gcDef){
		gcDef.setPv(gcDef.getPv() - this.pa);
	}
}