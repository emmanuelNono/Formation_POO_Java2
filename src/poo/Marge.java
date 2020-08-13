package poo;

import java.util.Random;

public abstract class Marge extends Personnage {
	
	private static Random rand = new Random();	
	
	private int forceNeutre;
	
	public Marge(String nom, int pv, int pm, int forceNeutre) {
		super(nom, pv, pm);
		this.forceNeutre=forceNeutre;
		
	}
	
	
	
	public int getForceNeutre() {
		return forceNeutre;
	}



	public void setForceNeutre(int forceNeutre) {
		this.forceNeutre = forceNeutre;
	}
	abstract void lanceSort();

}
