package src;
// This class contains the format for constructing an Album object and contains the relevant information that will be returned
public class album {
    private String id;
    private String title;
    private String artist;
    private int releaseDate;

    public album(String id, String title, String artist, int releaseDate) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.releaseDate = releaseDate;
    }

    public String getTitle() { return title;}
    public String getArtist() { return artist; }
    public int getReleaseDate() { return releaseDate; }
    public String getId() { return id; }


}
