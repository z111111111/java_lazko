public class Main {


    public static void main(String[] args) {

        Reader reader1;
        Reader reader2;
        Reader reader0;
        Book book0;
        Book book1;

        System.out.println("Hello world!");

        Reader[] readers = new Reader [3];

        reader0 = new Reader("Петров МВ", 11111, "физика", "01.01.1991", "+79165430000");

        reader1 = new Reader("Сидоров МВ", 22222, "математика", "02.01.1991", "+79175431111");

        reader2 = new Reader("Иванов МВ", 33333, "физика", "03.01.1991", "+79165437777");

        book0 = new Book("ESENIN", "STIHI");

        book1 = new Book("Pushkin", "Eugeny Onegin");


        readers[0] = reader0;
        readers[1] = reader1;
        readers[2] = reader2;
        readers[0].takeBook(7);
        readers[1].takeBook(book0, book1, book0);
        readers[2].takeBook("KRZHMELIK I VAHMURKA, 18 CACHESTV");
    }
}