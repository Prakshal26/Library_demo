/*
1. Model
    i. Books:
    ii.BaseEntity
    We have created BaseEntity because it has the ID. We can give @ID in individual classes like in books
    etc etc. But we have created a base class which can be inherited and all other classes can use
    it for the id.
    Now all the Model table will have one column namely id which will be the primary key for all the
    models.
    If we need primary key suppose roll no then seperately we can define the data member roll no in that class
    and give @Id.

2. Repositories: Will be used by JPA based Service, discussed in point 2.b.
    i)BooksRepository : It will implement Crud Repository which will have the methods to save delete etc.
     CurdRepository saves inside the table also that we have created in Model and is visible in h2-console.
3. Services.
    a). Map Based
        i. AbstractMapService - HEre we have given common implementation of save,delete etc so that
        all the other services can just extend it and save it's object.
        ii. BooksMapService- We will pass Books object to AbstractMapService method so that it
        can store save etc etc.
    b). JPA BASED will use CurdRepository- Map Based Service will save the object and we can
        get the values by using System.out.println. But it will not store the data inside the table
        which we have created using @Entity in the model and hence data will not be visible in h2 console.
        For this we have created Repository(point2).
           i)BooksSDJpaService; It will also save store like Map service but this time it will
           also store in h2 database as it has functionality of CurdRepository.
 4. BootStrap
    i)DataLoader: It will create object of Books class and will store name password etc.
    Then it will use BookService (Depend on active profile that which book service it will use
    Jpa based or MapBased) to store the object.

5. Controller.
It controllers the webpage i.e any web page will come to controller based on RequestMapping and then
it will send the data accordingly.
 */

package library.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

}
