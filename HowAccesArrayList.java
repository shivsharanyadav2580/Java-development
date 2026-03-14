import java.util.ArrayList;
import java.util.Iterator;

public class HowAccesArrayList {
    static void main(String[] args) {
    ArrayList al  =  new ArrayList();
    al.add("Telusko");

        al.add("Ai");
        al.add("Devops");
        al.add("System design");
//        System.out.println(al);
//
//        String str1 = (String) al.get(2);
//        System.out.println(str1);

//        for(int i = 0 ; i < al.size() ; i++){
//            System.out.println(al.get(i));
//            al.add("Data structure"); // infinite loop
//
//
//        }
//
//        for(Object obj : al){
//            System.out.println(obj);
//            al.add("Data structure");
//
//        }
        Iterator itr = al.iterator(); // here we are iterate on al
       while (itr.hasNext()){
           System.out.println(itr.next());
           al.add("Data structure");
       }
    }
}
