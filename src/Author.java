public class Author {

    String name,phone,email;
     int id;
     private static int idIncrementer = 1; // You can change it by name of class in main class. 

     public Author(String name , String phone , String email ){  // Create Constructor
         this.id = idIncrementer;
         this.name = name;
         this.phone = phone;
         this.email = email;
         idIncrementer++;

     }

}
