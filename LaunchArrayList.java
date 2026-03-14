import java.util.ArrayList;

public class LaunchArrayList {
    static void main(String[] args) {
     ArrayList al   =  new ArrayList();
     al.add(33);
        al.add(45);
        al.add(72);
        al.add(10);
        al.add(5);
        al.add(30);
        System.out.println(al); // mainatain insertion order
        al.add(2 , 100);
        System.out.println(al);
        // we can add whole collection list
        ArrayList al2 = new ArrayList();
        al2.add(200);
        al2.add(300);
//        al2.add(al);
//        System.out.println(al2); //y defauly it add last
        al2.add(2 , al);
        System.out.println(al2);


    }
}
