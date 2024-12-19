import java.util.HashMap;
import java.util.Scanner;

public class Data {
    HashMap<Song, String> def = new HashMap<Song, String>();
    Scanner sc = new Scanner(System.in);
    Data(){
        set();
    }
    private void set(){
        Song a = new Song("Blinding Lights", "english", 1, 10, "Week", "The Weekend");
        Song b = new Song("Espresso", "english", 1, 15, "Short and Sweet", "Sabrina Carpenter");
        Song c = new Song("Say So", "english", 2, 10, "ME", "Doja Cat");
        Song d = new Song("Juicy", "english", 2, 16, "ME", "Doja Cat");
        Song e = new Song("Plastic love", "japanese", 1, 10, "jitsu", "Mariya Takeiuchi");
        Song f = new Song("Lonliness", "japanese", 2, 10, "jitsu", "Anri");
        Song g = new Song("Loretta", "japanese", 2, 10, "kiamena", "Ginger root");
        Song h = new Song("Gilli Gilli ga", "telugu", 3, 10, "Desamudhuru", "DSP");
        Song i = new Song("upenantha", "telugu", 3, 10, "Aarya2", "DSP");
        Song j = new Song("Oorugalle", "telugu", 3, 10, "Sainikudu", "Karthik");
        Song k = new Song("Pee loon", "hindi", 1, 10, "Once upon a time in Mumbai", "Pritam");
        Song l = new Song("Pehla Nasha", "hindi", 1, 10, "Amir", "Amir Khan");
        Song m = new Song("Papa Kehtehe", "hindi", 1, 10, "Mr India", "Udit Narayan");
        def.put(a, a.language);
        def.put(b, b.language);
        def.put(c, c.language);
        def.put(d, d.language);
        def.put(e, e.language);
        def.put(f, f.language);
        def.put(g, g.language);
        def.put(h, h.language);
        def.put(i, i.language);
        def.put(j, j.language);
        def.put(k, k.language);
        def.put(l, l.language);
        def.put(m, m.language);
    }
    public HashMap<Song, String> getData(){
        return def;
    }
    public void addSong(){
        System.out.println("Enter title");
        String t = sc.next();
        System.out.println("Enter language:");
        String l = sc.next();
        Song temp = new Song(t,l);
        def.put(temp, temp.language);
    }

}
