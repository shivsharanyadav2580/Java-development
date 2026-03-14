import java.util.Scanner;


class Alpha1 implements Runnable {
    public void regestration() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your id");
        int id = sc.nextInt();
        System.out.println("Enter age ");
        int age = sc.nextInt();
        System.out.println("Id is" + id + "Age is" + age);

    }
    @Override
    public void run(){
        regestration();
    }

}




class Beta1 implements Runnable {
    public void Course() {
        System.out.println("enter course info");

    }
    @Override
    public void run(){
        Course();
    }

}
class Gamma1 implements Runnable {
    public void PrintingStar() {
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
    }
    @Override
    public void run(){
        PrintingStar();
    }


}
public class LaunchInheritance03 {
    static void main() {
        Alpha1 al = new Alpha1();
        Beta1 bl = new Beta1();
        Gamma1 gm = new Gamma1();
        Thread t1 = new Thread(al);
        Thread t2 = new Thread(bl);
        Thread t3 = new Thread(gm);
        t1.start();
        t2.start();
        t3.start();
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        System.out.println(t3.isAlive());






    }

}
