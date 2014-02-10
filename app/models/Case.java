package models;

import play.utils.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

/**
 * Classe gerant le contenu d'une case
 */
public class Case{

	/**
	 * pointeur vers le GC
	 * @see Gc
	 */
    private Gc gc;

	/**
	 * Getters and setters
	 */
	public Gc getGc(){
		return this.gc;
	}

	public void setGc(Gc theGc){
		this.gc = theGc;
	}

	public Case(){
		gc = null;
	}

	public Case(Gc theGc){
		this.gc = theGc;
	}

}