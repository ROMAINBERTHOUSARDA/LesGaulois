package personnages;
import objets.Equipement;

public class Romain {
    private String nom;
    private int force;
    private Equipement[] equipements = new Equipement[2];
    private int nbEquipement = 0;
    private String soldat = "Le soldat ";
     


    public Romain(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }

    private String prendreParole() {
        return "Le romain " + nom + " : ";
    }
    
    public Equipement[] recevoirCoup(int forceCoup) { 
    	  Equipement[] equipementEjecte = null; 
    	 
    	  forceCoup = calculResistanceEquipement(forceCoup); 
    	 
    	  force -= forceCoup; 
    	  if (force == 0) { 
    	   parler("Aie"); 
    	  }
    	  else {
    	   equipementEjecte = ejecterEquipement(); 
    	   parler("J'abandonne..."); 
    	  } 
    	  return equipementEjecte; 
    } 
    
    private int calculResistanceEquipement(int forceCoup) {
       String texte; 
    	  texte = "Ma force est  de " + this.force + ", et la force du coup est de " + forceCoup; 
    	  int resistanceEquipement = 0; 
    	  if (nbEquipement != 0) { 
    	   texte += " mais heureusement, grace a mon equipement sa force est diminue de "; 
    	   for (int i = 0; i < nbEquipement;i++) { 
    	    if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) { 
    	     resistanceEquipement += 8; 
    	    } else { 
    	     System.out.println("Equipement casque"); 
    	     resistanceEquipement += 5; 
    	    } 
    	     
    	   } 
    	   texte += resistanceEquipement + "!"; 
    	  } 
    	  parler(texte); 
    	  forceCoup -= resistanceEquipement; 
    	  return forceCoup; 
    	 } 
    	 
    	 private Equipement[] ejecterEquipement() { 
    	  Equipement[] equipementEjecte = new Equipement[nbEquipement]; 
    	  System.out.println("L'équipement de " + nom + " s'envole sous la force du coup."); 
    	  int nbEquipementEjecte = 0; 
    	  for (int i = 0; i < nbEquipement; i++) { 
    	   if (equipements[i] != null) { 
    	    equipementEjecte[nbEquipementEjecte] = equipements[i]; 
    	    nbEquipementEjecte++; 
    	    equipements[i] = null; 
    	   } 
    	  } 
    	  return equipementEjecte; 
    	 } 
    	 
    public void sEquiper(Equipement equipement) {
        switch (nbEquipement) {
            case 0:
                ajouterEquipement(equipement);
                break;

            case 1:
                if (equipements[0] == equipement) {
                    System.out.println(soldat + nom + " possede deja un " + equipement + " !");
                } else {
                    ajouterEquipement(equipement);
                }
                break;

            case 2:
                System.out.println(soldat + nom + " est deja bien protege !");
                break;
            default :
            	break;
        }
    }
    
    private void ajouterEquipement(Equipement equipement) {
        equipements[nbEquipement] = equipement;
        nbEquipement++;
        System.out.println(soldat + nom + " s'equipe avec un " + equipement + ".");
    }
    
    
    
    public int getForce() {
		return force;
	}

	public static void main(String[] args) {
    	Romain minus = new Romain("Minus", 6);

        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.BOUCLIER);
        minus.sEquiper(Equipement.CASQUE);
	}
}

