package ru.skillbox;

public class Book {

    private final String nameBook;
    private final String nameAuthor;
    private final int pageCount;
    private final int numberISBN;

    public Book(String nameBook, String nameAuthor, int pageCount, int numberISBN) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.pageCount = pageCount;
        this.numberISBN = numberISBN;
    }

    public String getNameBook() {
        System.out.println("Книга: " + nameBook);
        return nameBook;
    }

    public String getNameAuthor() {
        System.out.println("Автор: " + nameAuthor);
        return nameAuthor;
    }

    public int getPageCount() {
        System.out.println("Страниц: " + pageCount + " стр");
        return pageCount;
    }

    public int getNumberISBN() {
        System.out.println("ISBN: " + numberISBN + "\n");
        return numberISBN;
    }
}

/*
Задание 1
Что нужно сделать

Создайте иммутабельный (неизменяемый) класс Book для хранения информации о книге, содержащий поля:

название,
автор,
количество страниц,
номер ISBN.
* */
