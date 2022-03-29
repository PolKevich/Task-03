package by.training.task03.booktask;
/*
Создать класс Book, спецификация которого приведена ниже. Определить конструкторы,
set- и get- методы и метод  toString(). Создать второй класс, агрегирующий массив или коллекцию типа Book,
с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.

Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */

public class BookTask {

    public static void main(String[] args) {

        Book book1 = new Book(100, "Евгений Онегин", "Александр Сергеевич Пушкин",
               "Проспект", 2021, 224, 100, "мягкая обложка");
        Book book2 = new Book(101, "Война и мир", "Лев Николаевич Толстой",
                "Эксмо", 2019, 1360, 200, "твердая обложка");
        Book book3 = new Book(102, "Мастер и Маргарита", "Михаил Афанасьевич Булгаков",
                "Альпина", 2015, 640, 150, "твердая обложка");

        AggregatingMass a = new AggregatingMass();

        a.setArr(book1);
        a.setArr(book2);
        a.setArr(book3);

        a.printAggregatingMass();
        System.out.println();

// a) список книг заданного автора;

        a.printBookOfAuthor("Александр Сергеевич Пушкин");
        System.out.println();

// b) список книг, выпущенных заданным издательством;

        a.printPublishingHouse("Альпина");
        System.out.println();

// c) список книг, выпущенных после заданного года.

        a.printPublishedSince(2016);

    }

}
