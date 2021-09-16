package com.example.petclinicdata.service.map;


import com.example.petclinicdata.model.BaseEntity;

import java.util.*;

public class AbstractMapService <T extends BaseEntity,ID extends Long>{

    protected Map<Long,T> map=new HashMap<>();

    Set<T> findall(){
        return new HashSet<>(map.values());
    }

    T findByID(ID id){
        return map.get(id);
    }
    T save(T object){
        if(object!=null){
            if(object.getId()==null){
                object.setId(object.getId());
            }
            map.put(object.getId(), object);
        }
        else {
            throw new RuntimeException("Object cant be null");
        }

        return object;
    }
    void deleteByID(ID id){
        map.remove(id);

    }
    void delete(T object)  {
        map.entrySet().removeIf(entry->entry.getValue().equals(object));
    }

    private Long getNextID(){

        return Collections.max(map.keySet())+ 1;

    }

}

