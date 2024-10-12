package exercice1;

import java.util.HashMap;
import java.util.Map.Entry;

public class ImprimerFacture {
	private HashMap<Produit, Integer> produits;
	public void imprimer(Facture facture) {
        double prix;
        for (Entry<Produit, Integer> mapentry : facture.getProduits().entrySet()) {
            prix = mapentry.getKey().getPrix() * mapentry.getValue();
            System.out.println(mapentry.getKey() + "\t" + mapentry.getValue() + " : " + prix);
        }
        System.out.println("Prix = " + facture.getTotal());
        System.out.println("PrixTTC = " + facture.getTotalTTC());
    }

}
