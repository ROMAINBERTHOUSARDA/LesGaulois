package personnages;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public Chaudron(int quantitePotion, int forcePotion) { 
		  this.quantitePotion = quantitePotion; 
		  this.forcePotion = forcePotion; 
	} 
		 
		 
	public void remplirChaudron(int quantite, int forcePotion) {
		quantitePotion = quantite;
		this.forcePotion = forcePotion; 	}
	
	
	public int getForcePotion() {
		return forcePotion;
	}


	public boolean resterPotion() {
		if (quantitePotion > 0) {
			return true;
		}
		return false;
	}
	
	public int prendreLouche() {
		int variable = 0;
		quantitePotion = quantitePotion - 1;
		if (quantitePotion == 0) {
			variable = forcePotion;
			forcePotion = 0;
			return variable;
		}
		else {
			return forcePotion;
		}
		
	}
	
}
