package poo;

import java.util.Random;

public class Guerrier extends Personnage implements Soin {
	private static Random rand = new Random();
	int force;

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		if (force < 50) {
			force = 50;
		} else if (pv > 500) {
			force = 500;
		}
		this.force = force;
	}

	public Guerrier(String nom, int pv, int pm, int force) {
		super(nom, pv, pm);
		this.force = force;
	}

	public void etatPersonnage() {
		super.etatPersonnage();
		System.out.println("*  force  : " + getForce() + "   *");

	}

	public void frappe(Personnage adversaire) {
		int rand_frappe = rand.nextInt(5);
		int rand_precision = rand.nextInt(5);

		if (rand_frappe == 0 || rand_precision == 0) {
			System.out.println(this.getNom() + " a rate la cible");
		}else {
			if (rand_precision >= 1 && rand_precision <= 3) {
				System.out.println(adversaire.getNom() + " a été touché par " + this.getNom() + " et a perdu " 
						+ this.force * rand_precision + " points de vie");
				adversaire.pv -= this.force * rand_precision;
			}else {
				if (rand_precision == 4) {
					System.out.println("Aie " + adversaire.getNom() + " a été touché par un coup critique "
							+ this.force * rand_precision + " points");
					adversaire.pv -= this.force * rand_precision;
				}
			}
		}
	}

	@Override
	public void soigner(Personnage p) {
		p.pv += 100;
		System.out.println(p.getNom() + " a recu des soin. ses pv sont de " + p.getPv());
	}

}
