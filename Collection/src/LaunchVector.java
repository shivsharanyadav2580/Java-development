import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class LaunchVector {
    public static void main(String[] args) {
      Vector v1 =   new Vector();
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(40);
        v1.add(50);
        Iterator irrObj = v1.iterator();
        while (irrObj.hasNext()){
            System.out.println(irrObj.next());
        }
    Enumeration enu =  v1.elements(); // it give enumerator obj
        while (enu.hasMoreElements()){
            System.out.println(enu.nextElement()); // older java
        }

    }
}
// vector has both option enum and Iterator