package es.altran.curso;

public class Book extends Product {
	
	//	public int NumPag=455;
		
		String author;
		String title;
		
		public Book(int numberID, double price, String name, String author, String title) {
			super(numberID,price,name);
			this.author = author;
			this.title = title;
		}

		public String getAuthor() { 
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}

		@Override
		public String toString() {
			return super.toString() + "Book [author=" + author + ", title=" + title + "]";
		}
	
}