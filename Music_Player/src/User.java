import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class User {
    private String name;
    static ArrayList<Song> playlist = new ArrayList<Song>();
    //static HashMap<Song,String> playlist = new HashMap<Song,String>();
    ArrayList<String> as = new ArrayList<String>();
    User(String name){
        this.name = name;
    }
    public void addToPlaylist(Song a){

        playlist.add(a);
    }
    public void removeFromPlaylist(Song a){
        playlist.remove(a);
    }
    private void traverse(){
        for(Song x:playlist)System.out.println(x);
//        Set<Song> a = new HashSet<Song>();
//        a = playlist.keySet();
//        for(Song x:a){
//            System.out.println(x);
//        }

    }
    @Override
    public String toString(){
        return name;
    }

    public void printAll(){
        System.out.println("Name: "+name+"\nlist: \n");
        traverse();
    }
    public ArrayList<Song> getProperty(){
        return playlist;
    }


}
