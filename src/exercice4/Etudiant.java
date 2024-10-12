package exercice4;

class Etudiant extends Utilisateur {
    public Etudiant(String prenom, String nom) {
        super(prenom, nom);
    }

    @Override
    public String genererLogin() {
        return getPrenom().charAt(0) + getNom() + "usms.ac.ma";
    }
 }

