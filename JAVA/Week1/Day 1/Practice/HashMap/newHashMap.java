import java.util.HashMap;

public class newHashMap{
    public static void main(String[]args){
        HashMap<String,String> trackList=new HashMap<>();

        trackList.put("asap rocky","i praise the lord n break the law");
        trackList.put("ktyb","yo welo maysirech chy mmeli kabrouh w gelo melo o meli dej mokhou hachihelo ");
        trackList.put("drake","aabed f tarkina hama gattaa b sakina");
        trackList.put("samara","ourourou");

        // String lyrics = trackList.get("drake");
    
        //     System.out.println("Lyrics for 'drake': " + lyrics);

            for (String track : trackList.keySet()) {
            String lyrics = trackList.get(track);
            System.out.println("Track: " + track + ", Lyrics: " + lyrics);
        }
    }
}
