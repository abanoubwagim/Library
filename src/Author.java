public class Author {

    String name,phone,email;
     int id;
     private static int idIncrementer = 1;

     public Author(String name , String phone , String email ){  // Create Constructor
         this.id = idIncrementer;
         this.name = name;
         this.phone = phone;
         this.email = email;
         idIncrementer++;

     }

}
