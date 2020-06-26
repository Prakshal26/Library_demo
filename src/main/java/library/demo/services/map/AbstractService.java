package library.demo.services.map;

import library.demo.model.BaseEntity;

import java.util.*;

public abstract class AbstractService  <T extends BaseEntity, ID extends Long> {

    protected Map<Long,T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }
    T save(T object) {
        if (object!= null) {
            if(object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        }else {
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }
    void deleteByid(ID id) {
        map.remove(id);
    }
    void delete (T object) {
        map.entrySet().removeIf(entry->entry.getValue().equals(object));
    }

    String Test () {
        return "Prakshal";
    }

    private Long getNextId() {

        Long nextId = null;
        try {
            nextId= Collections.max(map.keySet())+1;
        } catch (NoSuchElementException e) {
            //If first ID manually we need to assign.
            nextId = 1L;
        }
        return nextId;
    }
}
