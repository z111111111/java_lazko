public class Reader {
    protected String FIO;
    protected int number;
    protected String faculty;
    protected String date;
    protected String tel;

    public Reader(String FIO, int number, String faculty, String date, String tel) {
        this.FIO = FIO;
        this.number = number;
        this.faculty = faculty;
        this.date = date;
        this.tel = tel;
    }

    public void takeBook(int count) {
        System.out.println(FIO +" взял " + count + " книг");
    }

    public void takeBook(String bookName) {
        System.out.println(FIO +" взял книги: " + bookName);
    }

    public void takeBook(Book ... book) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < book.length; i++) {
            s.append(book[i].bookName);
            s.append(" ");
        }
            System.out.println(FIO + " взял книги: " + s);
    }


}
