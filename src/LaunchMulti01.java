public class LaunchMulti01 {
    static void main() throws InterruptedException {
        System.out.println("Thread start here ");
//        Thread.sleep(5000);

        Thread t1 = Thread.currentThread();
//        System.out.println(t1.getName());
        t1.setName("Shivsharan");
        System.out.println(t1.getName());
//        System.out.println(t1.getPriority());
        System.out.println("Thred end here");
        t1.setPriority(2);
        System.out.println(t1.getPriority());
    }
}
