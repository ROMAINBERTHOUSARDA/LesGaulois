package personnages;
import Objets.Equipement;

public class Gaulois { 
	 private String nom; 
	 //private int force; 
	 private int effetPotion = 1;
	 private Village village;
	 private int force, nb_trophees; 
	 private Equipement trophees[] = new Equipement[100];
	 
	 
	 
	 public Village getVillage() {
		return village;
	}

	 public void setVillage(Village village) {
		 this.village = village;
	 }

	 public Gaulois(String nom, int force) { 
	  this.nom = nom; 
	  this.force = force; 
	 } 
	 
	 public String getNom() { 
	  return nom; 
	 } 
	 
	 public int getEffetPotion() {
		return effetPotion;
	}
	 
	 public int getForce() {
		return force;
	}

	 public void parler(String texte) { 
	  System.out.println(prendreParole() + "\"" + texte + "\""); 
	 } 
	 
//	 private String prendreParole() { 
//	  return "Le gaulois " + nom + " : "; 
//	 } 
	 
	 @Override
	public String toString() {
		 	return nom;	
	}
	 
//	public void frapper(Romain romain) {
//		String nomRomain = romain.getNom();
//		System.out.println(nom + " envoie un grand coup dans la machoire de " + nomRomain);
//		int forceCoup = (force*effetPotion) / 3;
//		if (effetPotion >= 2) {
//			effetPotion -= 1;
//		}
//		romain.recevoirCoup(forceCoup);
//	}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
	}
	
	 public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix);

	}
	
	 public void sePresenter() {
		    if (village != null && nom.equals(village.getChef().getNom())) {
		        System.out.println("Bonjour, je m'apelle " + nom + ". Je suis le chef du village " + village.getNom() + ".");
		    } else if (village != null) {
		    	System.out.println("Bonjour, je m'apelle " + nom + ". je fait partie du village " + village.getNom() + ".");
		    } else {
		    	System.out.println("Bonjour, je m'apelle " + nom + ". Je voyage de villages en villages.");		    }
		}
	 
	 private String prendreParole() { 
		 String texte = "Le gaulois " + nom + " : "; 
		 return texte; 
	 }
	 
	 public void frapper(Romain romain) { 
		 System.out.println(nom + " envoie un grand coup dans la mâchoire de " + 
		 romain.getNom()); 
		 Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion); 
		 for (int i = 0; trophees != null && i < trophees.length; i++, 
		 nb_trophees++) { 
		 this.trophees[nb_trophees] = trophees[i]; 
		 } 
		 return; 
		 }
	 
} 

