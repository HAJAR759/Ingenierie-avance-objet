package exercice4;

public abstract class Utilisateur {
    private String prenom;
    private String nom;

    public Utilisateur(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    // Méthode abstraite pour générer le login
    public abstract String genererLogin();
}
