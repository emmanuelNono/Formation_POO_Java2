package poo;

import java.util.Random;

public class Archer extends Personnage implements Soin {
	private static Random rand = new Random();

	private int tire;

	public Archer(String nom, int pv, int pm, int tire) {
		super(nom, pv, pm);
		this.tire = tire;
	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	public void etatPersonnage() {
		super.etatPersonnage();
		System.out.println("*  Tirer   : " + getTire());
	}

	public void tirer(Personnage adversaire) {
		int rand_tire = rand.nextInt(5);
		int rand_precision = rand.nextInt(5);

		if (rand_tire == 0 || rand_precision == 0) {
			System.out.println(this.getNom() + " a rate la cible");
		}else {
			if (rand_precision >= 1 && rand_precision <= 3) {
				System.out.println(adversaire.getNom() + " a été touché par une fleche et a perdu "
						+ this.tire * rand_precision + " points de vie");
				adversaire.pv -= this.tire * rand_precision;
			}else {
				if (rand_precision == 4) {
					System.out.println("Aie " + adversaire.getNom() + " a été touché par une fleche critique et empoisoinée "
							+ this.tire * rand_precision + " points");
					adversaire.pv -= this.tire * rand_precision;
				}
			}

			
		}

	}

	@Override
	public void soigner(Personnage p) {
		// TODO Auto-generated method stub
		
	}

}
