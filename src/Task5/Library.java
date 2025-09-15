import java.util.ArrayList;
import java.util.List;

public class Library {
    public static class Book {
        private String title;
        private String author;
        private boolean isAvailable;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.isAvailable = true; // за замовчуванням книга доступна
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void checkOut() {
            if (isAvailable) {
                isAvailable = false;
                System.out.println(title + " Була перевірена");
            } else {
                System.out.println(title + " Не доступна");
            }
        }

        public void returnBook() {
            if (!isAvailable) {
                isAvailable = true;
                System.out.println(title + " Була повернута");
            } else {
                System.out.println(title + " Не було перевірено");
            }
        }

        public String toString() {
            return "\"" + title + "\" by " + author + " (В наявності: " + isAvailable + ")";
        }
    }

    public static class Library {
        private List<Book> books = new ArrayList<>();

        public void addBook(Book book) {
            books.add(book);
            System.out.println(book.getTitle() + " Додано в бібліотеку");
        }

        public void checkOutBook(String title) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    book.checkOut();
                    return;
                }
            }
            System.out.println("Book \"" + title + "\" Не знайдено в бібліотеці");
        }

        public void returnBook(String title) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    book.returnBook();
                    return;
                }
            }
            System.out.println("Book \"" + title + "\" Не знайдено в бібліотеці");
        }

        public void showBooks() {
            System.out.println("\nLibrary Collection:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }


    public static class Main {
        public static void main(String[] args) {
            Library library = new Library();

            Book b1 = new Book("Коти-вояки", "Ерін Гантер");

            library.addBook(b1);

            library.showBooks();

            library.checkOutBook("Коти-вояки");
            library.showBooks();

            library.returnBook("Коти-вояки");
            library.showBooks();
        }
    }
}
