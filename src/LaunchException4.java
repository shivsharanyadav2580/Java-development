import java.util.Scanner;

class Thinking{
    public void solve(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the problem in int formate ");
        int p = sc.nextInt();
        System.out.println("Enter the divide method in int formate ");
       try {
           int d = sc.nextInt();
           int solution = p / d; // posiibility of exception // here is mo handle so it go to caller mrthod of solve method and find catch if not available then it throw to jvm for handle
           System.out.println("Here is your solution  = " + solution);
       }
       catch (ArithmeticException e1){
           System.out.println("Pleas enter positive non zero  number");
       }



    }
}
public class LaunchException4 {
    static void main(String[] args) {
    Thinking t1  = new Thinking();
    t1.solve();
        System.out.println("succesfully run ");

    }
}
