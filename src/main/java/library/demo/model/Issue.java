package library.demo.model;

import java.util.Date;

public class Issue extends BaseEntity{

    private Books books;

    private Date Issuedate;
    private Long fine;

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
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
