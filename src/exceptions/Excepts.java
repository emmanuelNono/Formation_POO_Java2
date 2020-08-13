package exceptions;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Excepts {

	public static void main(String[] args) {
		int a = 10, b = 0;

		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("Erreur : division par 0 impossible");
			System.out.println("Erreur : " + e);
		} finally {
			System.out.println("Fermeture du programme");
		}

		List liste = new LinkedList();
		liste.add("bonjour");
		liste.add(1000);
		liste.add(true);
		for (int i = 0; i < liste.size(); i++) {
			System.out.println("Elem n° " + i + " : " + liste.get(i));
		}

		Iterator iList = liste.iterator();
		while (iList.hasNext())
			System.out.println(iList.next());
		
	}
}
// le finally force l'exécution de l'instruction meme si le prog plante
