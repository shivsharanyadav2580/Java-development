import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchCopyOnWrite {
    static void main(String[] args) {
        CopyOnWriteArrayList al = new CopyOnWriteArrayList();
        al.add("Telusko");

        al.add("Ai");
        al.add("Devops");
        al.add("System design");
        Iterator itr = al.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

        // List Iterator

//    ListIterator itr2 = al.listIterator();  //it start from index 2
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//
//        }
        ListIterator litr = al.listIterator(3); // it got 3 to first index

        while (litr.hasPrevious()){
            System.out.println(litr.previous()); // reverse direction

        }




    }
}
