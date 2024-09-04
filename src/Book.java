public class Book {
    int id ;
    int version;
    String title , publishingDate;
    Author author;

    private static int idIncrementer = 1;  // You can change it by name of class in main class.

    public Book(String title , String publishingDate , int version ,  Author author ){ // Create Constructor
        this.id = idIncrementer;
        this.title = title;
        this.publishingDate = publishingDate ;
        this.author = author;
        this.version = version;
        idIncrementer++;
    }

}
