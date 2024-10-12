package exercice4;

class Etudiant extends Utilisateur {
	private Integer numero;
	
    public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Etudiant(String prenom, String nom) {
        super(prenom, nom);
    }

    @Override
    public String genererLogin() {
        return getPrenom().charAt(0) + getNom() + "usms.ac.ma";
    }
 }

