package library.demo.model;

public class Books extends BaseEntity {


    private Long price;
    private String bookName;
    //private Genre genre;



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
}
