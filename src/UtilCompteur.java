package src;

public class UtilCompteur {

	public static void main(String[] args) {
		Compteur cpt;
		cpt = new Compteur();
		cpt.initialisation(10, 100);
		while (cpt.depassement() == false) {
			cpt.afficher();
			cpt.incrementer();
		}
		cpt.raz();
		cpt.afficher();
	}

}
