package library.demo.services;

import java.util.Set;

public interface CurdService <T , ID> {

    Set<T> findAll();
    T save(T object);
    void deleteByid(ID id);
    void delete(T object);
    String Test ();
}
