package services;

import javax.persistence.*;
import java.util.List;

public interface ServiceCRUD<T> {

    @PersistenceUnit
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("my-persistence-unit");
    @PersistenceContext
    EntityManager manager = factory.createEntityManager();


    public T findById(int id);
    public List findAll();
    public T update(T dto);
    public T create(T dto);
    public void delete(int id);

}
