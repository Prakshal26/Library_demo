package library.demo.repositories;

import library.demo.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Owner,Long>{
}
