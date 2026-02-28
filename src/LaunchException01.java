import java.util.Scanner;
public class LaunchException01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator you want to divided");
        int n = sc.nextInt();
        System.out.println("ENter the denominator ");
        int d = sc.nextInt();
        try {
            int res = n / d; // Arithmatic exception here exception come into the picture
            System.out.println(res);

        }
        catch (Exception e){ // catch block only execute when exception come in try block
            System.out.println("Please Enter non zero number ");
        }


    }
}
