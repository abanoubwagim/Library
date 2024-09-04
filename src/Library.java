import java.util.ArrayList;

public class Library {

    ArrayList <Book> books = new ArrayList<>();
    ArrayList <Author> authors = new ArrayList<>();

    public void addAuthor (Author author)
    {
        authors.add(author);
    }

    public void removeAuthor (int id )
    {
        for (Author author : authors){
            if (author.id == id){
                authors.remove(author);
                System.out.println("The user has been deleted");
                return;
            }
        }

    }

    public void printAuthor(int id){

        for (Author author : authors){
            if (author.id == id){
                System.out.println("Name : "+ author.name);
                System.out.println("Phone : "+ author.phone);
                System.out.println("Email : "+ author.email);
                System.out.println("---------------------");
                return;
            }
        }
        System.out.println("Author with id : ( "+ id + " ) is not found");

    }




    public void printAuthorBooks(int id) {

        boolean isAuthorExist = false;
        String authorName = "";
        for (Author author : authors){
            if (author.id == id){
                isAuthorExist = true;
                authorName = author.name;
                break;
            }
        }
        if (!isAuthorExist){
            System.out.printf("Author with id : ( "+ id + " ) is not found");
            return;
        }
        System.out.println("Books of author : "+ authorName );
        for (Book book : books){
            if (book.author.id == id ){
                System.out.println("- "+book.title);
            }
        }
        System.out.println("---------------------");
    }
    public void addBook(Book book){
        books.add(book);
    }

    public void removeBooks(int id){

            for (Book book : books){
            if (book.id == id){
                books.remove(book);
                System.out.println("Book with id : ( "+ id + " ) has been deleted");

                return;
            }
        }
        System.out.println("Book with id : ( "+ id + " ) is not found");

    }

    public void printBook(int id){

            for (Book book : books){
          if (book.id == id){
                System.out.println("Book : " + book.title);
                System.out.println("Author : "+ book.author.name);
                System.out.println("Version : "+ book.version);
                System.out.println("Publish : "+ book.publishingDate);
                System.out.println("---------------------");

              return;
            }
        }
        System.out.println("Book with id : ( "+ id + " ) is not found");

    }
    


}
