import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        Hashmatique test = new Hashmatique();
        System.out.println(test);
    }
    public Hashmatique(){
        HashMap<String,String> trackList=new HashMap<String, String>();
        trackList.put("Mercy","Why you gotta show up lookin so good just to hurt me Why you wanna stop this whole damn world from turning");
        trackList.put("Happy","It might seem crazy what I'm 'bout to say");
        trackList.put("Drunk in Love","I've been drinkin, I've been drinkin' ");
        trackList.put("Someone You Loved","I'm going under and this time I fear there's no one to save meThis all or nothing really got a way of driving me crazy");

        System.out.println(trackList.get("Happy"));

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }
}
