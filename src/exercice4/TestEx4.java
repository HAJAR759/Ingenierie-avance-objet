package exercice4;

public class TestEx4 {

	public static void main(String[] args) {
        // Création d'un produit
        Stock stock = new Stock("Produit A", 15);

        // Création des observateurs
        Observer emailAlert = new LowStockEmailAlert();
        Observer uiUpdater = new UIStockUpdater();
        Observer dailyReport = new DailyStockReport();

        // Ajout des observateurs au stock
        stock.addObserver(emailAlert);
        stock.addObserver(uiUpdater);
        stock.addObserver(dailyReport);

        // Changement de la quantité de stock
        stock.setQuantity(12); // Mise à jour normale
        stock.setQuantity(8);  // Stock bas, déclenchera l'alerte email
    }

}
