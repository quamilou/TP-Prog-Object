public class Compteur {
	private int limite;
	private boolean lampe;
	private int valeur;
	
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

	public void initialisation(int valDebut, int valLimite) {//Donne les valeurs en entrée
		
		valeur = valDebut;
		limite = valLimite;
		lampe = false;
		
		System.out.println();
	}
	
	public void incrementer() {//Incrementation
		if (valeur+1>limite) {
			lampe=true;
			
		}else{
			valeur+=1;
		}	
	}
	
	public boolean depassement() {// Def la limite du compteur
		return lampe;
	}
	
	public void raz() {// Met le compteur à 0
		lampe = false;
		valeur = 0;
	}
	
	public void afficher() {
		
		System.out.println(valeur);
	}
}
