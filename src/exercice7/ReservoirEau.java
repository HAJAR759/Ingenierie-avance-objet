package exercice7;

//package metier
public class ReservoirEau {
    private Alerte alerte;

    public ReservoirEau(Alerte alerte) {
        this.alerte = alerte;
    }

    public void alerter() {
        alerte.envoyerAlerte("Seuil atteint");
    }
}

