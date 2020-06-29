package library.demo.services.map;

import library.demo.model.Issue;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class IssueMapService extends AbstractService<Issue,Long> {

    @Override
    Set<Issue> findAll() {
        return super.findAll();
    }

    @Override
    Issue save(Issue object) {
        return super.save(object);
    }

    @Override
    void deleteByid(Long aLong) {
        super.deleteByid(aLong);
    }

    @Override
    void delete(Issue object) {
        super.delete(object);
    }



    @Override
    String Test() {
        return super.Test();
    }
}
