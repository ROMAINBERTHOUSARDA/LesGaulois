package personnages;
import objets.Equipement;

public class Gaulois { 
	 private String nom; 
	 private int effetPotion = 1;
	 private Village village;
	 private int force;
	 private int  nbTrophees; 
	 private Equipement[] trophees = new Equipement[100];
	 private String presentation = "Bonjour, je m'apelle";
	 
	 
	 
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
	 

	 @Override
	public String toString() {
		 	return nom;	
	}
	 

	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
	}
	
	 public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix);

	}
	
	 public void sePresenter() {
		    if (village != null && nom.equals(village.getChef().getNom())) {
		        System.out.println(presentation + nom + ". Je suis le chef du village " + village.getNom() + ".");
		    } else if (village != null) {
		    	System.out.println(presentation + nom + ". je fait partie du village " + village.getNom() + ".");
		    } else {
		    	System.out.println(presentation + nom + ". Je voyage de villages en villages.");		    }
		}
	 
	 private String prendreParole() { 
		 return "Le gaulois " + nom + " : "; 
	 }
	 
	 public void frapper(Romain romain) { 
		 System.out.println(nom + " envoie un grand coup dans la mchoire de " + 
		 romain.getNom()); 
		 Equipement[] lestrophees = romain.recevoirCoup((force / 3) * effetPotion); 
		 for (int i = 0; lestrophees != null && i < lestrophees.length; i++, 
		 nbTrophees++) { 
		 this.trophees[nbTrophees] = lestrophees[i]; 
		 } 
		 }
	 
} 

