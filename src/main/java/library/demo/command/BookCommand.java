package library.demo.command;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class BookCommand {

    private Long id;
    private Long price;
    private String bookName;
   // private Users users;

}
