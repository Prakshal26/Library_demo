package library.demo.services.usingservice;

import library.demo.model.Books;
import library.demo.model.Users;
import library.demo.repositories.UsersRepository;
import library.demo.services.UsersService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
@Service
@Profile("springjpa")
public class UsersSDJpaService implements UsersService {

    private final UsersRepository usersRepository;

    public UsersSDJpaService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public Set<Users> findAll() {
        Set<Users> users = new HashSet<>();
        usersRepository.findAll().forEach(users::add);

        return users;
    }

    @Override
    public Users findById(Long aLong) {
        Optional<Users> optionalOwner = usersRepository.findById(aLong);

        if(optionalOwner.isPresent()) {
            return optionalOwner.get();
        } else {
            return null;
        }
    }

    @Override
    public Users save(Users object) {
        return usersRepository.save(object);
    }

    @Override
    public void deleteByid(Long aLong) {
        usersRepository.deleteById(aLong);

    }

    @Override
    public void delete(Users object) {
        usersRepository.delete(object);

    }

    @Override
    public String Test() {
        return null;
    }
}
