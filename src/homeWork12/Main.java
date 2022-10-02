package homeWork12;

public class Main {
    public static void main(String[] args) {
        Author alexanderPushkin = new Author("Alexander", "Pushkin");
        Author sergeyYesenin = new Author("Sergey", "Yesenin");

        Book warAndPeace = new Book(1863, alexanderPushkin);
        Book rowanFire = new Book(1924, sergeyYesenin);

        rowanFire.setYearOfPublication(1968);
    }
}