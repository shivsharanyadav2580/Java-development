import java.util.Scanner;
class Shiv{
    public void divide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number which you want to divide");
        int n = sc.nextInt();
        System.out.println("enter the number by which you want to divide");
        int d = sc.nextInt();
        try{
            int res = n / d;
            System.out.println(res);

        }
        catch (Exception e){
            System.out.println("Please enter non zero number");
            throw e;
        }


    }
}


public class Exception02 {
    static void main(String[] args) {
        try{
            System.out.println("App started");
            Shiv s1 =  new Shiv();
            s1.divide();

        }
        catch (Exception e){
            System.out.println("Exception handle in Main method");
        }

        System.out.println("app terminated");

    }
}
