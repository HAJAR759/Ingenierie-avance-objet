package exercice5;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface IAnniversaire {

	void setDateNaiss(LocalDate d);  
    Date getDateNaiss();
    int calculerAge();
    String envoyerMessage(String message, List LesDestinataires);
}
