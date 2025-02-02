package entities;

import javax.persistence.*;

@Entity
@Table(name = "artist")
public class Artist {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    public Artist(){
    }

    public Artist(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Artist(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
