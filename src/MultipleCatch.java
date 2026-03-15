import java.util.Scanner;
public class MultipleCatch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("App start");

            System.out.println("Enter the numerator you want to divided");
            int n = sc.nextInt();
            System.out.println("Enter the denominator ");
            int d = sc.nextInt();
            int res = n / d; //0 Arithmatic exception
            System.out.println(res);
            System.out.println("enter the size of array");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the position where you want to insert");
            int pos = sc.nextInt();
            System.out.println("Enter the data which you want to insert");
            int data = sc.nextInt();
            arr[pos] = data;
            System.out.println("App terminate succesfully");
        }
        catch (ArithmeticException e){
            System.out.println("Arithmatic exception");
        }
        catch (NegativeArraySizeException e2){
            System.out.println("please enter the non zero size");
        }
        catch (ArrayIndexOutOfBoundsException e3){
            System.out.println("Please be in limite ");
        }
        catch (Exception generic){
            System.out.println("some problrm in program");
        }








    }
}
