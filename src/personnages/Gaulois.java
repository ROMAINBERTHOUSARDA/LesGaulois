package personnages;

public class Gaulois { 
	 private String nom; 
	 private int force; 
	 private int effetPotion = 1;
	 private Village village;
	 
	 
	 
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
	 
	 private String prendreParole() { 
	  return "Le gaulois " + nom + " : "; 
	 } 
	 
	 @Override
	public String toString() {
		 	return nom;	
	}
	 
	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la machoire de " + nomRomain);
		int forceCoup = (force*effetPotion) / 3;
		if (effetPotion >= 2) {
			effetPotion -= 1;
		}
		romain.recevoirCoup(forceCoup);
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
		        System.out.println("Bonjour, je m'apelle " + nom + ". Je suis le chef du village " + village.getNom() + ".");
		    } else if (village != null) {
		    	System.out.println("Bonjour, je m'apelle " + nom + ". je fait partie du village " + village.getNom() + ".");
		    } else {
		    	System.out.println("Bonjour, je m'apelle " + nom + ". Je voyage de villages en villages.");		    }
		}
	 
} 

