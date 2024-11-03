package exercice4;

class DailyStockReport implements Observer {
    @Override
    public void update(Stock stock) {
        System.out.println("Rapport quotidien : Changement de stock pour " + stock.getName() + " - Nouvelle quantité : " + stock.getQuantity());
    }
}