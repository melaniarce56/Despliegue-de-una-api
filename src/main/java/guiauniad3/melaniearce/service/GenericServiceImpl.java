/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiauniad3.melaniearce.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ISTA
 */

public abstract class GenericServiceImpl<T, ID extends Serializable> implements GenericService<T, ID>{
    
    public abstract CrudRepository<T, ID> getDao();

    @Override
    public T save(T Entity) {
        return getDao().save(Entity);
    }

    @Override
    public T findById(ID id) {
        Optional<T> obj = getDao().findById(id);
        if (obj.isPresent()){
            return obj.get();
        }
        return null;
    }

    @Override
    public List<T> findByAll() {
        List<T> List = new ArrayList<>();
        getDao().findAll().forEach(obj -> List.add(obj));
        return List;
    }

    @Override
    public void delete(ID id) {
        getDao().deleteById(id);
    }
    
    
    
    
    
    
    
    

   

    
    
}
