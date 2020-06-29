package library.demo.services.map;

import library.demo.model.Books;
import library.demo.services.BooksService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BooksMapService extends AbstractService<Books,Long> implements BooksService {

    @Override
    public Set<Books> findAll() {
        return super.findAll();
    }

    @Override
    public Books save(Books object) {
        return super.save(object);
    }

    @Override
    public Books findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public void deleteByid(Long aLong) {
        super.deleteByid(aLong);
    }

    @Override
    public void delete(Books object) {
        super.delete(object);
    }

    @Override
    public String Test() {
       return super.Test();
    }
}
