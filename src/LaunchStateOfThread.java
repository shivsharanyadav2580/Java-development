class Library implements Runnable{
    String Java = new String();
    String Devops = new String();
    String Aws = new String();
    @Override
    public void run(){ // running state
        String name = Thread.currentThread().getName();
        if(name.equals("NEEL")){
            try{
                System.out.println("Neel got in library");
                Thread.sleep(3000);
                synchronized (Java){
                    System.out.println("Neel get java books");
                    Thread.sleep(3000);
                    synchronized (Devops){
                        System.out.println("Neel take Devops book");
                        Thread.sleep(3000);
                        synchronized (Aws){
                            System.out.println("Neel get Aws book");
                            Thread.sleep(3000);
                        } // release the Aws
                    }// release the Devops
                } // Release the Java




            }
            catch (Exception e){
                e.printStackTrace();
            }


        }
        else {
            try{
                System.out.println("Shiv got in library");
                Thread.sleep(3000);
                synchronized (Java){
                    System.out.println("Shiv get Java books");
                    Thread.sleep(3000);
                    synchronized (Devops){
                        System.out.println("Shiv take Devops book");
                        Thread.sleep(3000);
                        synchronized (Aws){
                            System.out.println("Shiv get Aws book");
                            Thread.sleep(3000);
                        } // release the Aws
                    }// release the Devops
                } // Release the Java




            }
            catch (Exception e){
                e.printStackTrace();
            }


        }


    }

}
public class LaunchStateOfThread {
    static void main() {
        Library lib = new Library();
        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib); // new state


        t1.setName("SHIV");
        t2.setName("NEEL");

        t1.start(); // runnable state
        t2.start();

    }


}
