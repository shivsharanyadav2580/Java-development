
import java.util.Scanner;


class Alpha extends Thread {
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




class Beta extends Thread {
    public void Course() {
        System.out.println("enter course info");

    }
    @Override
    public void run(){
        Course();
    }

}
class Gamma extends Thread {
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
    public class LaunchMulti02 {
        static void main() {
            Alpha al = new Alpha();
            Beta bl = new Beta();
            Gamma gm = new Gamma();


            al.start(); // here we start thread but it will not do any task untill we override run() method in class
            bl.start();
            gm.start();
            // call the method
//            al.regestration();
//            bl.Course();
//            gm.PrintingStar();

        }
    }

