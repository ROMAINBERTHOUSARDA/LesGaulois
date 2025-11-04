package personnages;

public class Village {
	
	private String nom;
	private int nbVillageois = 0;
	private int nbMax;
	private Gaulois chef;
	private Gaulois [] villageois;
	
	public Village(String nom, int nbMax, Gaulois chef) {
		super();
		this.nom = nom;
		this.nbMax = nbMax;
		this.chef = chef;
		this.villageois = new Gaulois[nbMax];
		chef.setVillage(this); 

		
	}

	public String getNom() {
		return nom;
	}
	
	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois( Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
        gaulois.setVillage(this);
		nbVillageois ++;
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois < nbVillageois) {
			System.out.print("Il n'y a pas autant d'habitants dans notre village !");
			return null;
		}
		else {
			return villageois[numVillageois-1];
		}
	}
	
	public void afficherVillageois(Village village) {
		System.out.println("Dans le village " + village.getNom() + " du chef " + village.chef + " vivent les légendaires gaulois :");
		for (Gaulois chaine :village.villageois) {
			if (chaine != null) {
				System.out.println("- " + chaine);
			}
		}
		
		
	}
	public static void main(String[] args) {
		
	}
	
}
