package library.demo.model;

import javax.persistence.*;

@Entity
public class Users extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;

    private String password;

   // @OneToOne
    //private Books books;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //public Books getBooks() {
      //  return books;
    //}

    //public void setBooks(Books books) {
       // this.books = books;
    //}
}
