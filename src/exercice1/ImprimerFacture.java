package exercice1;

import java.util.Map.Entry;

public class ImprimerFacture {
	
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
