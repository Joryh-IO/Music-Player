import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Player {
    private int pointer=0;
    HashMap<Song, String> songs;
    Set<Song> s = new HashSet<Song>();
    int seek = 1;
    Player(HashMap<Song,String > x){
        songs = x;
    }
    public void play(){
        System.out.println("paused");
    }
    public void pause(){
        System.out.println("paused");
    }
    public Song[] execute(){
        s = songs.keySet();
        Song arr[] = new Song[s.size()];
        int i = 0;
        for (Song x : s)
        {
            arr[i++] = x;
        }
        return arr;
    }
    public void next(){
        Song Ar[] = execute();
        Song a = Ar[pointer];
        System.out.println(a);
        pointer++;
    }
    public void previous(){
        pointer--;
        Song Ar[] = execute();
        Song a = Ar[pointer];
        System.out.println(a);
    }
    public Song getCurrent(){
        Song Ar[] = execute();
        Song a = Ar[pointer];
        return a;
    }

    public int getPointer() {
        return pointer;
    }
}
