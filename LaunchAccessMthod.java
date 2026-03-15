import java.lang.classfile.Interfaces;
import java.util.Map;
import java.util.*;
import java.util.*;

interface Lal {
    interface Shiv{
        static  void income(){
            System.out.println("static method of Lal");
        }
    }
}
public class LaunchAccessMthod {
    static void main(String[] args) {
        // How to Acess key
        HashMap<Integer , String> hm1 = new HashMap<>();
        hm1.put(1 , "Shiv");
        hm1.put(2 , "Bhuv");
        hm1.put(3 , "Lal");
        hm1.put(4 , "Lalsa");
        hm1.put(5 , "Bhola");

        System.out.println(hm1);

//
//        Set key = hm1.keySet(); // here we are store key of collection in set refrece as key
//        System.out.println(key);

        // Using Iterator
//        Iterator<Integer> itr = key.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }


// Values of Collection
//        Collection col = hm1.values();
//        Iterator<String> itr3 = col.iterator();
//        while (itr3.hasNext()){
//            System.out.println(itr3.next());
//        }
 // key value pair using keyset
//        Set myEntry = hm1.entrySet();
//        Iterator itr3 = myEntry.iterator();
//        while (itr3.hasNext()){
//            System.out.println(itr3.next());
//        }

        Set entry = hm1.entrySet();
        Iterator itr4 = entry.iterator();
        while (itr4.hasNext()){
       Map.Entry pair  =   (Map.Entry) itr4.next();
            System.out.println("Key:" + pair.getKey() + " & "  + "Values :" + pair.getValue() );


        }

    }
}
