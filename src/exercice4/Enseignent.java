package exercice4;

class Enseignent extends Utilisateur {
    private String grade;

    public Enseignent(String prenom, String nom, String grade) {
        super(prenom, nom);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String genererLogin() {
        return getPrenom() + getNom() + getGrade() + "usms.ma";
    }
}

