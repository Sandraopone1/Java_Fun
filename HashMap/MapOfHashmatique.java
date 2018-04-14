// import java.util.HashMap;
// HashMap<String, String> userMap = new HashMap<>();

// userMap.put("nninja@codingdojo.com", "Nancy Ninja");
// userMap.put("ssamurai@codingdojo.com", "Sam Samurai");

// String name = userMap.get("nninja@codingdojo.com");

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class MapOfHashmatique {
    public static void main(String[] args) {
    MapOfHashmatique.trackList();
    }

public static void trackList(){
HashMap<String, String> trackList = new HashMap<>();

trackList.put("Praise", "Its all about Jesus");
trackList.put("Shout", "Hallelujah");
trackList.put("I am yours", "I give my all to you");
trackList.put("Glory", "My praise belongs to you");

 String track1 = trackList.get("I am yours");
	System.out.println(track1);

    Iterator it = trackList.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        System.out.println(pair.getKey() + " = " + pair.getValue());
        // it.remove(); // avoids a ConcurrentModificationException
    
}

}
}
