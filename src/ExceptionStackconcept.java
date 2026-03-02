import java.util.Scanner;

class myClass{
    public void demo(){
     Scanner sc   =  new Scanner(System.in);
//     try{
         System.out.println("Program start");

         System.out.println("Enter the numerator you want to divided");
         int n = sc.nextInt();
         System.out.println("Enter the denominator ");
         int d = sc.nextInt();
         int result = n / d;
         System.out.println(result);
         System.out.println("Program terminated");

//     }
//     catch (Exception mye){
//         System.out.println("Exception handle in demo method my class ");  // here controle not go to caller of method because here itself handle
//     }





    }
}
class demo2{
    public void disp(){

//        try {
            myClass m1 = new myClass();

            m1.demo();
//        }
//        catch (Exception e){
//            System.out.println("Exception handle in demo 2");
//        }
        System.out.println("program complete");


    }


}

public class ExceptionStackconcept {
    static void main(String[] args) {

        demo2 d2 = new demo2();
        d2.disp();
        System.out.println("succesfull execution in  ");





    }
}
