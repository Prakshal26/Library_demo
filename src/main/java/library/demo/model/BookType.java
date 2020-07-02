package library.demo.model;

import javax.persistence.Entity;

@Entity
public class BookType extends BaseEntity {


    private String name;

    @Override
    public String toString() {
        return name;
    }
}
