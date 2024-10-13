package exercice5;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


public class Personne implements IPersonne{
	
	private String nom;
	private String prenom;
	private Date dateNaiss;
	private String email;
	private int telMobile;
	
	
	public void envoyerEmail(String msg,List <String> dest) {
		
	}
    public void envoyerSMS(String msg,int tel) {
		
	}
   
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaiss() {
		return dateNaiss;
	}
	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}
	@Override
	public int calculerAge() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setDateNaiss(LocalDate d) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String envoyerMessage(String message, List LesDestinataires) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
