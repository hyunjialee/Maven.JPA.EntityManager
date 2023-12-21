import entities.Artist;
import entities.CD;
import services.ArtistService;

public class AppRunner {
    public static void main(String[] args){

        ArtistService service = new ArtistService();

        Artist artist = new Artist(1,"John");

        service.create(artist);

        System.out.println(artist);

    }
}
