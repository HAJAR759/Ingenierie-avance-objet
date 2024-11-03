package exercice5;

public abstract class Document implements Cloneable {
	
    protected String title;
    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

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
