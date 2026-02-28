import java.util.Scanner;

class Thinking2{
    public void solve() {
        Scanner sc = new Scanner(System.in);


        try {
            System.out.println("Enter the problem in int formate ");
            int p = sc.nextInt();
            System.out.println("Enter the divide method in int formate ");
            int d = sc.nextInt();
            int solution = p / d;
            System.out.println("Here is your solution  = " + solution);
        }
        catch (ArithmeticException e){
            System.out.println("Exception handle in itself");
        }
    }
    }








class Thinking3{
    public void disp(){
        try{
            Thinking2 t1  = new Thinking2();
        t1.solve();

        }
        catch (ArithmeticException e){
            System.out.println("xception handle in Thinkimg 3");
        }

    }

}
public class ExampleException3 {
    static void main(String[] args) {
       Thinking3 t3  =  new Thinking3();
       t3.disp();

//        System.out.println("succesfully run ");

    }
}
