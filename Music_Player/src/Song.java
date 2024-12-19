import java.util.Scanner;

public class Song {
    Scanner sc = new Scanner(System.in);
    private String title;
    private String artist;
    private String album;
    public String language;
    private int m, s;

    Song(String title, String language){
        this.title = title;
        this.language =language;
    }
    Song(String title, String language, int m, int s){
        this(title,language);
        this.m = m;
        this.s = s;
    }
    Song(String title, String language, int m, int s, String album, String artist){
        this(title, language, m, s);
        this.album = album;
        this.artist = artist;
    }
    public void setDuration(){
        System.out.println("Enter minutes: ");
        m = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter seconds: ");
        s = sc.nextInt();
    }
    public String toString(){
        return "--------------------------------------" +
                "\nTitle: "+title+
                "\nArtist: " + artist+
                "\nAlbum: " + album+
                "\nLanguage: " + language+
                "\nDuration: " + m+":"+s+
                "\n--------------------------------------";
    }
}
