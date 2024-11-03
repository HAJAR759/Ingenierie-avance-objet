package exercice5;

public class TestEx5 {

	public static void main(String[] args) {
        // Utilisation de la DocumentFactory pour créer des documents
        Document report = DocumentFactory.createDocument("report", "Annual Report", "Alice", "Yearly financials");
        Document contract = DocumentFactory.createDocument("contract", "Client Contract", "Bob", "Terms of service");
        Document invoice = DocumentFactory.createDocument("invoice", "Invoice #123", "Charlie", "Billing details");

        // Affichage des informations des documents créés
        System.out.println("Documents créés :");
        report.displayInfo();
        contract.displayInfo();
        invoice.displayInfo();

        // Clonage des documents
        Document clonedReport = report.clone();
        Document clonedContract = contract.clone();

        // Modification du clone pour vérifier l'indépendance des instances
        clonedReport.setTitle("Cloned Annual Report");
        clonedContract.setTitle("Cloned Client Contract");

        // Affichage pour vérifier le clonage
        System.out.println("\nDocuments clonés :");
        clonedReport.displayInfo();
        clonedContract.displayInfo();

        // Vérification que les documents originaux n'ont pas été modifiés
        System.out.println("\nDocuments originaux après clonage :");
        report.displayInfo();
        contract.displayInfo();
    }

}
