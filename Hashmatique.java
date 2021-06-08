import java.util.Set;
import java.util.HashMap;
public class Hashmatique{
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("little cats", "there are little cats");
        trackList.put("evil cats", "there are evil cats");
        trackList.put("big cats", "there are big cats");
        trackList.put("nice cats", "there are nice cats");

        String track1 = trackList.get("nice cats");
        System.out.println(track1);

        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.println("Track " +key+" "+ trackList.get(key));
        }
    }
}