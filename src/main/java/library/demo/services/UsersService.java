package library.demo.services;

import library.demo.model.Owner;

import java.util.Set;

public interface UsersService extends CurdService<Owner,Long>{

    @Override
    Set<Owner> findAll();

    @Override
    Owner findById(Long aLong);

    @Override
    Owner save(Owner object);

    @Override
    void deleteByid(Long aLong);

    @Override
    void delete(Owner object);

    @Override
    String Test();
}
