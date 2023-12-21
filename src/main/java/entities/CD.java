package entities;

public class CD {
    private int id;
    private String title;
    private Artist name;


    public CD(){
    }

    public CD(int id, String title, Artist name) {
        this.id = id;
        this.title = title;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getName() {
        return name;
    }

    public void setName(Artist name) {
        this.name = name;
    }
}
