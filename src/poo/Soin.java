package poo;

public interface Soin {
	
	public abstract void soigner(Personnage p);
	//3, 4, 10 et 11 fevrier
	//27 et 30 mars.
	
	// ==> une class abstraite est une class qu'on n'instancie pas.
	// ==> une methode abstraite est une méthode qui n'a pas de contenu dans la classe mère et qui est focement implementer par les enfants
	// ==> une methode finale ne peut etre déclarer que dans une classe abstraite
	
	// ==> une interface est une classe abstraite et totalement constituer de methodes abstraites
	// NB: avec abstract, l'heritage fonctionne mais on ne peut plus créer de nvel
	// NB: les intreface peuvent etre hériter entre eux.
	// NB: si une classe abstraite implemente un interface alors tous les enfant de la classe abstraites doivent implementer les methode de l'interfaces
	
	//-------------------- Exception  ------------------
	//-------------------- collection  ------------------
	//collection est un tableau a taille dynamique auquel on peut ajouter des elts à la volée
	//les collection appartient a java.utils.
	/*
	 * ArrayList et LinkedList heritent de List.
	 * la LinkedList est une liste chaine formé par le contenu de l'elt et les liens avec les autres
	 * La linkedList est lente en lecture et très rapide en ecriture
	 * add(10)
	 * add(2, 10) insert en 3eme position et le 3eme elt devient 4eme
	 * addFirst insert en tete de liste
	 * addLast insert en fin de liste
	 * clear(vide la liste)
	 * contains(10) teste et return un booleen
	 * get(3) recupere la case en 3eme position
	 * getFirst et getLast
	 * indexOff(10) il me return l'index 1
	 * set(2,10) remplace le contenu en index 2 par 10
	 * remove(0) il supprime le bounjour ds le tableau
	 * 
	 * 
	 * 
	 * */
}
