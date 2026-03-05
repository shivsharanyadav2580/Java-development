import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class LauncArrayList {
    public static void main(String[] args) {
//        ArrayList<String> al =   new ArrayList();
//        ArrayList  al =   new ArrayList();
//        al.add("Telusko");
//        al.add("Aws");
//        al.add("Devops");
//        al.add("Systme design");
//
//        // Accesing
////        String str = al.get(4); // here data is object and required string type and object is parent so downcasting need
//        // by using generic not need downcasting
//        String str = (String) al.get(2); // downcasting
////        String str = al.get(3);
//        System.out.println(str);
////        System.out.println(al);
////        System.out.println(al.get(3));
////
//        for(int i = 0; i < al.size() ; i++){
//            System.out.println(al.get(i));
//            al.add("Ai engineering");
//        }
//        for(Object o : al){
//            System.out.println(o);
//            al.add("AI"); // it give sout output with exception
//        }
//        Iterator itr = al.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//            al.add("Data structure course");  // fail fast means it give result with exception
//        }

       CopyOnWriteArrayList   al =   new CopyOnWriteArrayList();
        al.add("Telusko");
        al.add("Aws");
        al.add("Devops");
        al.add("Systme design");
        String str = (String) al.get(3);
//        System.out.println(str);
//         iterator
//        Iterator itr = al.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//            al.add("Data structur ecourse");  // fail safe means it give result withou adding  without exception
//        }
//        ListIterator litr = al.listIterator(al.size()); // it go from last to first
        ListIterator litr = al.listIterator(3); // it got 3 to first index

        while (litr.hasPrevious()){
            System.out.println(litr.previous()); // reverse direction

        }

    }



}
