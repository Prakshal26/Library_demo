package library.demo.services;

import library.demo.model.Users;

import java.util.Set;

public interface UsersService extends CurdService<Users,Long>{

    @Override
    Set<Users> findAll();

    @Override
    Users findById(Long aLong);

    @Override
    Users save(Users object);

    @Override
    void deleteByid(Long aLong);

    @Override
    void delete(Users object);

    @Override
    String Test();
}
