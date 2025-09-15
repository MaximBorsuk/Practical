package Task6;

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