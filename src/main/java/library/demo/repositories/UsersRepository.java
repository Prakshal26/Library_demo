package library.demo.repositories;

import library.demo.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users,Long>{
}
