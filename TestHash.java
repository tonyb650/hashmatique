// package java_stack.fundamentals.Hashmatique;
import java.util.HashMap;
import java.util.Set;

public class TestHash {
    public static void main(String[] args){
        HashMap<String,String> songList = new HashMap<String,String>();
        songList.put("Knights of Cydonia", "Come ride with me, Through the veins of history, I'll show you how God, Falls asleep on the job");
        songList.put("Hysteria", "Different lyrics, Through the veins of history, I'll show you how God, Falls asleep on the job");
        songList.put("Citizen Erased", "More Different lyrics, Through the veins of history, I'll show you how God, Falls asleep on the job");
        songList.put("Uprising", "Still more different lyrics, Through the veins of history, I'll show you how God, Falls asleep on the job");

        System.out.println("<-------Get one song by title-------->");
        String lyrics = songList.get("Uprising");
        System.out.println(lyrics);
        
        System.out.println("\n<-------Print out all songs -------->");
        Set<String> titles = songList.keySet();
        for(String title : titles){
            System.out.printf("%s : %s\n", title, songList.get(title));
        }

    }
}
