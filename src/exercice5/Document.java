package exercice5;

public abstract class Document implements Cloneable {
	
    protected String title;
    protected String author;
    protected String content;

    public Document(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    // Méthode de clonage
    @Override
    public Document clone() {
        try {
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Affichage des informations du document (à surcharger dans les sous-classes)
    public abstract void displayInfo();
}
