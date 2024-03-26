package org.example.SOLID.Interface_Segragation_Principle.service;

import org.example.SOLID.Interface_Segragation_Principle.entity.Entity;
import org.example.SOLID.Interface_Segragation_Principle.entity.User;

import java.util.List;

public interface PersistenceService<T extends Entity> {

    public void save(T entity);

    public void delete(T entity);

    public T findById(Long id);


}
