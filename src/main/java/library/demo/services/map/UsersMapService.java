package library.demo.services.map;

import library.demo.model.Users;
import library.demo.services.UsersService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile("default")
public class UsersMapService extends AbstractService<Users, Long> implements UsersService {

    @Override
    public Set<Users> findAll() {
        return super.findAll();
    }

    @Override
    public Users save(Users object) {
        return super.save(object);
    }

    @Override
     public void deleteByid(Long aLong) {
        super.deleteByid(aLong);
    }

    @Override
    public Users findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
     public void delete(Users object) {
        super.delete(object);
    }

    @Override
     public String Test() {
        return super.Test();
    }
}
