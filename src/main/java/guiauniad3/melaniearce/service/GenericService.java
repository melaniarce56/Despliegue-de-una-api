/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package guiauniad3.melaniearce.service;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author ISTA
 */
public interface GenericService<T, ID extends Serializable> {

    public T save(T Entity);

    public T findById(ID id);

    public List<T> findByAll();

    public void delete(ID id);

}
