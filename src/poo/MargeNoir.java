package poo;

import java.util.Random;

public class MargeNoir extends Marge implements Soin {

	private static Random rand = new Random();
	private int sortMalediction;

	public MargeNoir(String nom, int pv, int pm, int sortNeutre, int sortMalediction) {
		super(nom, pv, pm, sortNeutre);
		this.sortMalediction = sortMalediction;
	}

	public int getSortMalediction() {
		return sortMalediction;
	}

	public void setSortMalediction(int sortMalediction) {
		this.sortMalediction = sortMalediction;
	}

	public void etatPersonnage() {
		super.etatPersonnage();
		System.out.println("*  sort Obscur  : " + getSortMalediction() + "   *");
	}

	@Override
	void lanceSort() {
		// TODO Auto-generated method stub
	}

	public void lanceSortNoir(Personnage perso) {
		int reussirAttaque = rand.nextInt(5);
		int rand_sortPuissanceMalediction = rand.nextInt(5);

		if (reussirAttaque == 0 || rand_sortPuissanceMalediction == 0) {
			System.out.println(this.getNom() + " a rate son coup");
		} else {
			if (rand_sortPuissanceMalediction >= 1 && rand_sortPuissanceMalediction <= 3) {
				System.out.println(perso.getNom() + " a recu un sort " + this.sortMalediction * rand_sortPuissanceMalediction
						+ " de malediction");
				perso.pv -= this.sortMalediction * rand_sortPuissanceMalediction;
			} else {
				if (rand_sortPuissanceMalediction == 4) {
					// perso.setPv(perso.getPv()- (this.sortMalediction * rand_sortPuissanceNoir));
					System.out.println("Aie " + perso.getNom() + " a recu une malédiction critique de "
							+ (this.sortMalediction * rand_sortPuissanceMalediction) + " de malediction");
					perso.pv -= this.sortMalediction * rand_sortPuissanceMalediction;
				}
			}

		}

	}

	@Override
	public void soigner(Personnage p) {
		p.pv += 50;
		System.out.println(p.getNom() + " a recu des soin. ses pv sont de " + p.getPv());

	}

}
