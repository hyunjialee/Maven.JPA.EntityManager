package services;

import entities.Artist;
import org.springframework.stereotype.Service;
import javax.persistence.*;
import java.util.List;

@Service
public class ArtistService {

    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("my-persistence-unit");
    private EntityManager manager = factory.createEntityManager();
    private EntityTransaction transaction = manager.getTransaction();


    public void create (Artist artist){
        transaction.begin();
        manager.persist(artist);
        transaction.commit();
    }

    public Artist findByID(int id){
        return manager.find(Artist.class, id);
    }

    public void update(Artist arist){
        if (findByID(arist.getId()) != null){
            transaction.begin();;
            manager.merge(arist);
            transaction.commit();
        }
    }

    public List<Artist> findAll(){
        Query query = manager.createQuery("Select * FROM artist", Artist.class);
        return query.getResultList();
    }


    //delete
}
