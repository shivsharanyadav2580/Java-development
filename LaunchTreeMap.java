import java.util.TreeMap;

public class LaunchTreeMap {
    static void main() {
     TreeMap tm =    new TreeMap<>();
     tm.put(5 , "shiv");
     tm.put(2 , "golu");
     tm.put(3 , "bhuvneshvar"); // not allowed => null pointer exception
        tm.put(4 , null);

//        tm.put(null , "shiva");
        System.out.println(tm);

    }
}
