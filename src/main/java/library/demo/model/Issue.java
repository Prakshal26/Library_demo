package library.demo.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;

@Entity
public class Issue extends BaseEntity{


    private Date Issuedate;
    private Long fine;


    @OneToMany(mappedBy = "issue")
    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getIssuedate() {
        return Issuedate;
    }

    public void setIssuedate(Date issuedate) {
        Issuedate = issuedate;
    }

    public Long getFine() {
        return fine;
    }

    public void setFine(Long fine) {
        this.fine = fine;
    }
}
