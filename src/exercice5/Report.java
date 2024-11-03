package exercice5;

class Report extends Document {
	public Report(String title, String author, String content) {
		super(title, author, content);
	}

	@Override
	public void displayInfo() {
		System.out.println("Type: Report");
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Content: " + content);
	}
}