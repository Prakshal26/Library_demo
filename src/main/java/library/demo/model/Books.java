package library.demo.model;

import javax.persistence.*;

@Entity
public class Books extends BaseEntity {

    private Long price;
    private String bookName;
    //private Genre genre;

    @ManyToOne
    private Users users;



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

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
