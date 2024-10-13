package exercice5;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface IAmiFacebook {
	
	int calculerAge();
	Date getDateNaiss();
	void setDateNaiss(LocalDate d);
    int getPseudo();
    void setPseudo(String s);
    String envoyerMessage(String message,List LesDestinataires);


}
