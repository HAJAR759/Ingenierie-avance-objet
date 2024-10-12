package exercice4;

class CompteUniversitaire {
    private Utilisateur utilisateur;
    private String login;

    public CompteUniversitaire(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
        genererLogin();
    }

    public void genererLogin() {
        login = utilisateur.genererLogin(); // Appel à la méthode spécifique
    }

    public String getLogin() {
        return login;
    }
}