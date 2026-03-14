import java.util.Scanner;

class Telusko implements Runnable{
    @Override
    public void run(){
        String threadName = Thread.currentThread().getName();
        if(threadName.equals("REG")){
            regestration();
        } else if (threadName.equals("CO")) {
            Course();

        }
        else {
            PrintingStar();
        }

    }
    public void regestration() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your id");
        int id = sc.nextInt();
        System.out.println("Enter age ");
        int age = sc.nextInt();
        System.out.println("Id is" + id + "Age is" + age);

    }
    public void Course() {
        System.out.println("enter course info");

    }
    public void PrintingStar() {
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
    }
}

public class LaunchMultiThread04 {
    static void main() {
        Telusko telusko = new Telusko();
        Thread t1 = new Thread(telusko);
        Thread t2 = new Thread(telusko);
        Thread t3 = new Thread(telusko);
        t1.setName("REG");
        t2.setName("CO");
        t3.setName("ST");
        t1.start();
        t2.start();
        t3.start();




    }
}



