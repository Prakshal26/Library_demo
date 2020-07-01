package library.demo.command;

import library.demo.model.Users;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class BookCommand {

    private Long price;
    private String bookName;
   // private Users users;

}
