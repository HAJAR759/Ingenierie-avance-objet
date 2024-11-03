package exercice5;

class Contract extends Document {
    public Contract(String title, String author, String content) {
        super(title, author, content);
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: Contract");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
    }
    
    @Override
    public Document clone() {
        return new Contract(getTitle(), getAuthor(), getContent());
    }
}
