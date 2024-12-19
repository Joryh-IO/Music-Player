import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Data defaultData = new Data();
        Player p = new Player(defaultData.getData());
        ArrayList<User> users = new ArrayList<User>();

        User guest = new User("Guest");
        users.add(guest);

        boolean run = true;
        boolean megaTrue = true;
        while(megaTrue) {


            System.out.println("Select users: ");
            User arr[] = new User[users.size()];
            int i = 0;
            for (User x : users) {
                arr[i++] = x;
            }
            for (User x : arr) System.out.println("- " + x);
            System.out.println("Enter user no: ");
            int userno = sc.nextInt();
            User currentUser = arr[userno - 1];
            System.out.println("-------------------Music Player-------------------");
            while (run) {
                System.out.println("""
                        1. Start
                        2. Users
                        3. Import Music
                        4. Exit
                        """);
                int ch = sc.nextInt();
                sc.nextLine();
                switch (ch) {
                    case 1: {
                        boolean mini = true;
                        while (mini) {
                            p.next();
                            System.out.println("     ⏮️             ⏯️          ⏭️     ");
                            System.out.println("1.previous |   2.Play 3.Pause |  4.Next  |  5.add to Playlist");
                            int minichoice = sc.nextInt();
                            switch (minichoice) {
                                case 1:
                                    if (p.getPointer() != 0) {
                                        p.next();
                                        System.out.println("     ⏮️             ⏯️          ⏭️     ");
                                        System.out.println("1.previous |   2.Play 3.Pause |  4.Next  |  5.add to Playlist");
                                        break;
                                    }
                                case 2: {
                                    p.play();
                                    break;
                                }
                                case 3: {
                                    p.pause();
                                    break;
                                }
                                case 4:{
                                    p.next();
                                    break;
                                }
                                case 5: {
                                    Song a = p.getCurrent();
                                    currentUser.addToPlaylist(a);
                                    break;
                                }
                                default: {
                                    mini = false;
                                    break;
                                }
                            }
                        }
                    }
                    case 2: {
                        for (User x : arr) {
                            System.out.println(x);
                            System.out.println(x.getProperty());
                        }
                        break;
                    }
                    case 3: {
                        defaultData.addSong();
                        break;
                    }
                    case 4: {
                        run = false;
                        break;
                    }
                }
            }

        }
    }
}