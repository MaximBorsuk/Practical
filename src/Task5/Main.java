public static class Main {
    public static void main(String[] args) {
        Library.Library library = new Library.Library();

        Library.Book b1 = new Library.Book("Коти-вояки", "Ерін Гантер");

        library.addBook(b1);

        library.showBooks();

        library.checkOutBook("Коти-вояки");
        library.showBooks();

        library.returnBook("Коти-вояки");
        library.showBooks();
    }
}
}
