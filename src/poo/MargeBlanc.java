package poo;

import java.util.Random;

public class MargeBlanc extends Marge {

	private static Random rand = new Random();
	private int sortGlace;

	public MargeBlanc(String nom, int pv, int pm, int sortNeutre, int sortGlace) {
		super(nom, pv, pm, sortNeutre);
		this.sortGlace = sortGlace;
	}

	public int getSortGlace() {
		return sortGlace;
	}

	public void setSortGlace(int sortGlace) {
		this.sortGlace = sortGlace;
	}

	public void etatPersonnage() {
		super.etatPersonnage();
		System.out.println("*  sort de neige  : " + getSortGlace() + "   *");
	}

	@Override
	void lanceSort() {
		// TODO Auto-generated method stub

	}

	public void lanceSortBlanc(Personnage perso) {

		int reussirAttaque = rand.nextInt(5);
		int rand_sortPuissanceGlace = rand.nextInt(5);

		if (reussirAttaque == 0 || rand_sortPuissanceGlace == 0) {
			System.out.println(this.getNom() + " a manqué la cible");
		} else {
			if (rand_sortPuissanceGlace >= 1 && rand_sortPuissanceGlace <= 3) {
				System.out.println(perso.getNom() + " a recu une quantité de neige " + this.sortGlace * rand_sortPuissanceGlace
						+ " de malediction");
				perso.pv -= this.sortGlace * rand_sortPuissanceGlace;
				System.out.println();
				//perso.setPv(perso.pv - (this.sortGlace * rand_sortPuissanceGlace));
			}else {
				if(rand_sortPuissanceGlace == 4) {
					System.out.println("Aie ! " + perso.getNom() + " a recu une quantité de neige critique " + this.sortGlace * rand_sortPuissanceGlace
							+ " de malediction");
					perso.pv -= this.sortGlace * rand_sortPuissanceGlace;
				}
			}
		}

	}

}
