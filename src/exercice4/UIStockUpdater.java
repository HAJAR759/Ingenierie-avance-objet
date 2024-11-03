package exercice4;

class UIStockUpdater implements Observer {
    @Override
    public void update(Stock stock) {
        System.out.println("Mise à jour de l'interface utilisateur : Stock mis à jour pour " + stock.getName() + " - Quantité : " + stock.getQuantity());
    }
}