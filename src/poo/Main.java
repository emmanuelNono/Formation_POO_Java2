package poo;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Personnage Joker = new Personnage(); Personnage hulk = new Personnage("hulk",
		 * 100, 100); System.out.println("Je m'appelle " + hulk.getNom());
		 * hulk.etatPersonnage();
		 * 
		 * System.out.println("----------gabage collector-------------");
		 * Personnage.getInstances(); Personnage.suppressionPersonnage(hulk);
		 * Personnage.suppressionPersonnage(Joker); Personnage.getInstances();
		 * hulk.etatPersonnage();
		 * 
		 * 
		 * System.out.println("----------  Guerrier  -------------"); Guerrier spider =
		 * new Guerrier("spider", 1000, 0, 250); spider.etatPersonnage();
		 * 
		 * Guerrier superman = new Guerrier("spider", 1000, 0, 250);
		 * superman.etatPersonnage();
		 * 
		 * spider.frappe(superman); superman.etatPersonnage();
		 */

		/*
		 * System.out.println("----------  Archer contre wolverine -------------");
		 * Archer orlando = new Archer("orlando", 500, 0, 250);
		 * orlando.etatPersonnage();
		 * 
		 * Guerrier wolverine = new Guerrier("wolverine", 1000, 0, 250);
		 * wolverine.etatPersonnage();
		 * 
		 * byte i = 0; System.out.println("debut du combat"); while (wolverine.getPv() >
		 * 0 && orlando.getPv() > 0) { if (i == 0) { if (orlando.getPv() > 0) {
		 * orlando.tirer(wolverine); } if (wolverine.getPv() > 0) {
		 * wolverine.frappe(orlando); } else { System.out.print("fin du combat : ");
		 * Personnage.suppressionPersonnage(wolverine); }
		 * 
		 * }
		 * 
		 * }
		 */

		System.out.println("----------  Archer contre wolverine -------------");
		MargeBlanc p1 = new MargeBlanc("Gandalf", 10000, 500, 100, 150);
		p1.etatPersonnage();

		MargeNoir p2 = new MargeNoir("Batman", 10000, 500, 100, 150);
		p2.etatPersonnage();

		/*
		 * Archer p1 = new Archer("legolas", 1000, 0, 150); p1.etatPersonnage();
		 */

		System.out.println("debut du combat");
		System.out.println(": █");

		while (true) {
			if (p2.getPv() > 0 && p1.getPv() > 0) {
				p1.lanceSortBlanc(p2);
				System.out.println(p1.pourcentageVie(p1.getNom(), p1.pv) +" - "+p2.pourcentageVie(p2.getNom(), p2.pv));
				Thread.sleep(2000);
				// p2.soigner(p2);
				if (p2.getPv() > 0) {
					p2.lanceSortNoir(p1);
					System.out.println(p1.pourcentageVie(p1.getNom(), p1.pv) +" - "+p2.pourcentageVie(p2.getNom(), p2.pv));
					Thread.sleep(2000);
				}
			}

			if (p2.getPv() <= 0) {
				System.out.print("fin du combat : ");
				Thread.sleep(2000);
				Personnage.suppressionPersonnage(p2);
				Thread.sleep(2000);
				System.out.println("Victoire de " + p1.getNom());
				break;
			}

			if (p1.getPv() <= 0) {
				System.out.print("fin du combat : ");
				Thread.sleep(2000);
				Personnage.suppressionPersonnage(p1);
				Thread.sleep(2000);
				System.out.println("Victoire de " + p2.getNom());
				break;
			}

		}
		
		
		/*--- cree des objet et les mettre dans un arrayList
		 * choisir 2 au hazard qui combatent
		 * 
		 * 
		 * 
		 * */

		// ---------------------------- ENUM -------------------
		/*
		 * System.out.println("------------- les enum --------------"); for (Langage
		 * lang : Langage.values()) { if(Langage.CPlusPlus.equals(lang)) {
		 * System.out.println("J'aime le : " + lang); }else { System.out.println(lang);
		 * } }
		 */

		/*
		 * System.out.println("------------ separateur millier -----------------");
		 * 
		 * DecimalFormat formatter = (DecimalFormat)
		 * NumberFormat.getInstance(Locale.FRANCE); DecimalFormatSymbols symbols =
		 * formatter.getDecimalFormatSymbols(); symbols.setGroupingSeparator(' ');
		 * formatter.setDecimalFormatSymbols(symbols);
		 * 
		 * //-------------------------------------------
		 * System.out.println(formatter.format(10000000));
		 */
	}

}
