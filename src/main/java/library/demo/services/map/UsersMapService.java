package library.demo.services.map;

import library.demo.model.Owner;
import library.demo.services.UsersService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile("default")
public class UsersMapService extends AbstractService<Owner, Long> implements UsersService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
     public void deleteByid(Long aLong) {
        super.deleteByid(aLong);
    }

    @Override
    public Owner findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
     public void delete(Owner object) {
        super.delete(object);
    }

    @Override
     public String Test() {
        return super.Test();
    }
}
