import java.util.Scanner;
public class LaunchException2 {
    static void main(String[] args) {
        System.out.println("Hello");
        try{
            Thread.sleep(5000);// its checked exception on compile time


        }
        catch (Exception error){
            System.out.println("wait for some few second");

        }
        System.out.println("Hello2");


    }

}
