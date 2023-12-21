package services;

import entities.Artist;
import org.springframework.stereotype.Service;
import javax.persistence.*;

@Service
public class ArtistService {
    @PersistenceUnit
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("my-persistence-unit");
    @PersistenceContext
    EntityManager manager = factory.createEntityManager();


    public void create (Artist artist){
        manager.getTransaction().begin();
        manager.persist(artist);
        manager.getTransaction().commit();
    }

    public Artist findByID(int id){
        return manager.find(Artist.class, id);
    }
}
