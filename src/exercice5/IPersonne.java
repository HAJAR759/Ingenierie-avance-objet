package exercice5;


import java.util.Date;

public interface IPersonne extends IAnniversaire{
    String getNom();
    Date getDateNaiss();
    int calculerAge();
}
