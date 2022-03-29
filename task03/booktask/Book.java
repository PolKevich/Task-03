package by.training.task03.booktask;

public class Book {

    private int id;
    private String nameOfTheBook;
    private String author;
    private String publishingHouse;
    private int yearOfPublishing;
    private int numberOfPages;
    private int price;
    private String cover;

    public Book(int id, String nameOfTheBook, String author, String publishingHouse, int yearOfPublishing,
                int numberOfPages, int price, String cover) {
        this.id = id;
        this.nameOfTheBook = nameOfTheBook;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.cover = cover;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
    public String toString() {
        String str ="ID: " + id + ". " + "\"" + nameOfTheBook+ "\"" + ". " + author + ". " +
                "Издательство: "+ publishingHouse + ". " +
                "Год излания: " + yearOfPublishing + ". " +"Количество страниц: " + numberOfPages + ". " +
                "Цена:"+ price + ". " + "Тип переплета: " + cover;
        return str;
    }

    public void print() {
        System.out.println(toString());
    }
}
