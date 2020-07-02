package library.demo.model;

import javax.persistence.*;

@Entity
public class Book extends BaseEntity {

    private Long price;
    private String bookName;
    //private Genre genre;

    @ManyToOne
    private Owner owner;

    @ManyToOne
    private BookType bookType;

    @ManyToOne
    private Issue issue;


    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
