import java.util.LinkedList;

public class LaunchLinkedList {
    static void main() {
      LinkedList lk =  new LinkedList();
      lk.add(25);
      lk.add(30);
      lk.add(35);
      lk.add(null);
      lk.add(null);
//      lk.add(2 , 500);
//        System.out.println(lk);
//        lk.remove(null);
//        System.out.println(lk);
        lk.remove(2);
        System.out.println(lk);

    }
}
