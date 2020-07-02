package library.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Owner extends BaseEntity {


    private String firstName;
    private String lastName;
    private String address;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    private Set<Book> books = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    private Set<Visit> visits =new HashSet<>();

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
