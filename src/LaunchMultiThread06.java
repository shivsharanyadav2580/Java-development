
class Car1 implements Runnable{
    @Override
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName() + " has enterde into parking");
            Thread.sleep(5000);
            synchronized (this) {


                System.out.println(Thread.currentThread().getName() + "has enter into driving seart");
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + "has start the driving");
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + "has came back  and parked thr car");
            }

        }
        catch ( Exception e){
            e.printStackTrace();
        }
    }
}
public class LaunchMultiThread06 {
    static void main() {
        Car1 myCar = new Car1();
        Thread t1 = new Thread(myCar);
        Thread t2 = new Thread(myCar);
        Thread t3 = new Thread(myCar);
        t1.setName("Shiv");
        t2.setName("Neel");
        t3.setName("Shreyash");
        t1.start();
        t2.start();
        t3.start();

    }
}
