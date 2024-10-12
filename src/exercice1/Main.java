package exercice1;

public class Main {

	public static void main(String[] args) {
		
		Facture facture = new Facture(1);
        Produit produit1 = new Produit();
        produit1.setLibele("Ordinateur");
        produit1.setPrix(10000);
        Produit produit2 = new Produit();
        produit2.setLibele("Imprimante");
        produit2.setPrix(2000);
        
        facture.addProduit(produit1, 2);
        facture.addProduit(produit2, 3);

        Facture.setTVA(0.2); // TVA 20%

        // Imprimer la facture
        ImprimerFacture imprimerFacture = new ImprimerFacture();
        imprimerFacture.imprimer(facture);

        // Sauvegarder la facture
        SauvegarderFacture sauvegarderFacture = new SauvegarderFacture();
        sauvegarderFacture.saveFacture(facture);

	}

}