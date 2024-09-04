public class Book {
    int id ;
    int version;
    String title , publishingDate;
    Author author;

    private static int idIncrementer = 1;

    public Book(String title , String publishingDate , int version ,  Author author ){
        this.id = idIncrementer;
        this.title = title;
        this.publishingDate = publishingDate ;
        this.author = author;
        this.version = version;
        idIncrementer++;
    }

}
