package homeWork12;

public class Book {
    private Author author;
    private int yearOfPublication;
    public Book(int yearOfPublication, Author author) {
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
