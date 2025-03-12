public class LibraryManagement {
    public static class Book {
        static String libraryName = "City Library"; // Static variable shared across all books
        String title;
        String author;
        final String isbn; // Final variable to ensure unique identifier

        // Constructor using 'this' to initialize attributes
        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        // Static method to display the library name
        public static void displayLibraryName() {
            System.out.println("Library Name: " + libraryName);
        }

        // Method to display book details (uses instanceof for validation)
        public void displayBookInfo() {
            if (this instanceof Book) {
                System.out.println("Title: " + title);
                System.out.println("Author: " + author);
                System.out.println("ISBN: " + isbn);
            } else {
                System.out.println("Invalid object.");
            }
        }
    }
        public static void main(String[] args) {
            // Display library name
            Book.displayLibraryName();

            System.out.println();

            // Creating book instances
            Book book1 = new Book("A Song of Ice and Fire", "George R. R. Martin", "978-0553103540");
            book1.displayBookInfo();

            System.out.println();

            Book book2 = new Book("The Alchemist", "Paulo Coelho", "978-0061122415");
            book2.displayBookInfo();
        }

}
