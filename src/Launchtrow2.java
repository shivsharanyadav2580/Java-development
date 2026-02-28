import java.util.Scanner;

class  Alpha {
    public void demo() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Program start");

            System.out.println("Enter the numerator you want to divided");
            int n = sc.nextInt();
            System.out.println("Enter the denominator ");
            int d = sc.nextInt();
            int result = n / d;
            System.out.println(result);
            System.out.println("Program terminated");

        } catch (Exception mye) {
            System.out.println("Exception handle in demo method my class ");  // here controle not go to caller of method because here itself handle
        throw mye; // here we throw ref of exception
        }
        finally{
            System.out.println("alpha app terminated");
            sc.close();
        }
    }
}
public class Launchtrow2 {
    static void main(String[] args) {

        try {
            Alpha a = new Alpha();

            a.demo();
        }
        catch (ArithmeticException e){
            System.out.println("Exception handle in main ");
        }
        System.out.println("Program succesfully execute in main  ");


    }
}




