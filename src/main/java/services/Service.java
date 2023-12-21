package services;


import javax.persistence.Entity;
import javax.persistence.EntityManager;
import java.util.List;

@Entity
public class Service implements ServiceCRUD {


    @Override
    public Object findById(int id) {
        return null;
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public Object update(Object dto) {
        return null;
    }

    @Override
    public Object create(Object dto) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
