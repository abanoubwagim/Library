public class Main {
    public static void main(String[] args) {

        Author author1 = new Author(" Kathy Sierra " , "+96684297456", " kathysierra@gmail.com");
        Author author2 = new Author("Brett Spell" , "+9664021833", "brettspell@outlook.com");
        Author author3 = new Author(" Robert Lafore " , "+9631249392", " robertlafore@yahoo.com");

        Book book1 = new Book(" Head First Java " , "2003",2 , author1);
        Book book2 = new Book(" OCP Java SE 8 Programmer " , "2018",7 , author1);
        Book book3 = new Book(" Pro Java Programming " , "2005",5 , author2);
        Book book4 = new Book(" Data Structures and Algorithms in Java " , "1997",2 , author3);

        Library library = new Library();

        library.addAuthor(author1);
        library.addAuthor(author2);
        library.addAuthor(author3);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);


        library.printAuthor(1);
        library.printAuthor(2);
        library.printAuthor(3);
        library.printAuthor(4);

        library.printAuthorBooks(1);
        library.printAuthorBooks(2);
        library.printAuthorBooks(3);

        library.printBook(1);
        library.printBook(3);
        library.printBook(6);

        library.removeBooks(2);
        library.removeAuthor(2);
        library.printAuthor(2);
        library.printAuthorBooks(2);



    }
}