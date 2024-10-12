package exercice2;


public class Test {
    public static void main(String[] args) {
        // Création de comptes
        Compte compteCourant = new CompteCourant("12345", "10/10/2024");
        Compte compteEpargne = new CompteEpargne("67890", "15/09/2024");

        // Création d'opérations pour le compte courant
        Operation depotCourant = new Operation(5000, TypeOperation.Debit);
        Operation retraitCourant = new Operation(2000, TypeOperation.Credit);

        // Création d'opérations pour le compte épargne
        Operation depotEpargne = new Operation(3000, TypeOperation.Debit);
        Operation retraitEpargne = new Operation(500, TypeOperation.Credit);

        // Ajout des opérations au compte courant
        System.out.println("Ajout d'un dépôt de 5000 dans le compte courant : " + compteCourant.addOperation(depotCourant));
        System.out.println("Ajout d'un retrait de 2000 dans le compte courant : " + compteCourant.addOperation(retraitCourant));

        // Afficher le montant restant dans le compte courant
        System.out.println("Montant final dans le compte courant : " + compteCourant.montant);

        // Ajout des opérations au compte épargne
        System.out.println("Ajout d'un dépôt de 3000 dans le compte épargne : " + compteEpargne.addOperation(depotEpargne));
        System.out.println("Ajout d'un retrait de 500 dans le compte épargne : " + compteEpargne.addOperation(retraitEpargne));

        // Afficher le montant restant dans le compte épargne
        System.out.println("Montant final dans le compte épargne : " + compteEpargne.montant);
    }
}

