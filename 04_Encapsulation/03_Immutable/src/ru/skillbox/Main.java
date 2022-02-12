package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Собачье сердце", "М.А. Булгаков", 300, 5);
        book.getNameBook();
        book.getNameAuthor();
        book.getPageCount();
        book.getNumberISBN();

        Product product = new Product("Книга", 6_666666_66);
        product.setPrice(450);
        product.getName();
        product.getPrice();
        product.getBarCode();
    }
}
