package poo;

import java.util.Random;

public abstract class Personnage {
	// NB: avec abstract, l'heritage fonctionne mais on ne peut plus créer de nvel
	// class

	public static byte instances = 0; // cet var est defini au démarrage du prog. avec byte on a 128 personnage au
										// meme moment
	private static String tabDie[] = { "est hors jeu", "est décédé", "est K. O.   !", "est mort accidentellement" };
	// Math.random()*10;
	private static Random ran = new Random();
	// Random ran = new Random();

	String nom;
	int pv;
	int pm;

	// le nom sera modifie et écraser si les attribut sont public
	public Personnage() {
		pv = 100;
		pm = 100;
		System.out.println("Personnage anonyme crée !");
		instances++;
	}

	public Personnage(String nom, int pv, int pm) {
		if (pv < 100) {
			pv = 100;
		} else if (pv > 1000) {
			pv = 1000;
		}
		this.pv = pv;
		this.pm = pm;
		this.nom = nom;
		System.out.println("Personnage " + nom + " créé avec " + pv + " pv et " + pm + " PM !");
		pourcentageVie(getNom(), this.pv);
		instances++;
	}

	public static void getInstances() {
		System.out.println("il y'a " + Personnage.instances + " personnage(s)");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		if (pv < 100) {
			pv = 100;
		} else if (pv > 1000) {
			pv = 1000;
		}
		this.pv = pv;
	}

	public int getPm() {
		return pm;
	}

	public void setPm(int pm) {
		this.pm = pm;
	}

	public void etatPersonnage() {
		System.out.println("****************************");
		System.out.println("*  nom : " + getNom() + "    ");
		if (getPv() > 0) {
			System.out.println("*  pv  : " + getPv() + "     ");
		} else {
			System.out.println(getNom() + " " + tabDie[ran.nextInt(tabDie.length)]);
		}
		System.out.println("*  pm  : " + getPm() + "     ");
		// System.out.println("****************************");
	}

	public static void suppressionPersonnage(Personnage perso) {

		System.out.println();
		if (perso.getNom() == null) {

			// on decremente le nbre d'instances
			instances--;
			System.out.println("Le personnage" + " " + tabDie[ran.nextInt(tabDie.length)]);
			perso = null;
		} else {
			instances--;
			System.out.println(perso.getNom() + " " + tabDie[ran.nextInt(tabDie.length)]);
			perso = null;
		}
	}

	public String pourcentageVie(String nom, int pourcenPv) {
		String life = "", pourcent = "";
		for (int i = (pourcenPv) / 100; i > 0; i--) {
			life += "█";
		}
		if ((pourcenPv / 10) > 0){
			pourcent = " " + pourcenPv / 100 + " %";	
		}else {
			pourcent = " 0 %";
		}
		return nom +" " + life + pourcent;
	}

}
