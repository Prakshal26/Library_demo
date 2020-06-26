package library.demo.services.map;

import library.demo.model.Users;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UsersMapService extends AbstractService<Users, Long>{

    @Override
    Set<Users> findAll() {
        return super.findAll();
    }

    @Override
    Users save(Users object) {
        return super.save(object);
    }

    @Override
    void deleteByid(Long aLong) {
        super.deleteByid(aLong);
    }

    @Override
    void delete(Users object) {
        super.delete(object);
    }

    @Override
    String Test() {
        return super.Test();
    }
}
