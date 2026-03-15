import java.util.Scanner;


public class Exception01 {


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator");
        int n = sc.nextInt();
        System.out.println("Enter number by which you want to devide");
        int d = sc.nextInt();
        try{
            int res = n / d ;
            System.out.println("the result is " + res);

        }
        catch (Exception e){
            try{
                int res = n / d ;
                System.out.println("the result is " + res);
            }
            catch (Exception e2){
                System.out.println("Enter a non zero number");
            }
            System.out.println("Please enter a non zero number");
        }


    }

}
