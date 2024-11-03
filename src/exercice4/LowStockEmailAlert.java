package exercice4;

class LowStockEmailAlert implements Observer {
    @Override
    public void update(Stock stock) {
        if (stock.getQuantity() < 10) { // Seuil de stock bas
            System.out.println("Alerte Email : Le stock de " + stock.getName() + " est bas. Quantité restante : " + stock.getQuantity());
        }
    }
}
