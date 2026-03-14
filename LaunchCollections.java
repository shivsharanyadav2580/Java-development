import java.util.ArrayList;
import java.util.Collections;

public class LaunchCollections {
    static void main(String[] args) {
       ArrayList<String> ar =  new ArrayList();
       ar.add("Shiv");
       ar.add("Golu");
       ar.add("Neel");
       ar.add("Shreyash");
       ar.add("Priya");
//        Collections.sort(ar);
//        Collections.shuffle(ar);
//        System.out.println( Collections.frequency(ar , "Shiv"));
         Collections.reverse(ar);
        System.out.println(ar);

    }
}
