package exercice4;

import java.util.ArrayList;
import java.util.List;

class Stock implements Observable {
    private String name;
    private int quantity;
    private List<Observer> observers;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.observers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    // Méthode pour modifier la quantité et notifier les observateurs.
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
