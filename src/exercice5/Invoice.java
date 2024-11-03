package exercice5;

class Invoice extends Document {
    public Invoice(String title, String author, String content) {
        super(title, author, content);
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: Invoice");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
    }

}
