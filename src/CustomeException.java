import java.util.Scanner;
class InvalidCustomerException extends Exception{ // here this custome exception inherit  Exception
    public InvalidCustomerException(String msg){
        super(msg);

    }
}
// when you create a custome exception child of any  Exception


class Atm{
    private int acc_num = 9971;
    private int pass = 2005;
    private int ac ;
    private int pa;

   public void input(){
      Scanner sc  =  new Scanner(System.in);
       System.out.println("Enter the account number");
      ac = sc.nextInt();
       System.out.println("Enter the password");
       pa = sc.nextInt();

    }
   public void verify() throws InvalidCustomerException{
       if(ac == acc_num && pa == pass) {
           System.out.println("You are Real user please take you cash");
       }
       else {
//           System.out.println("  ");
//           input();
//           verify();
//           InvalidCustomerException ice = new InvalidCustomerException();
//           throw ice;
           throw new InvalidCustomerException("seems You are not real user");
       }
   }
}
class Bank {
    public void initiate(){
        Atm bank1   =  new Atm();
       try {
           bank1.input();

           bank1.verify();
       }
       catch (InvalidCustomerException i1){
           System.out.println(i1.getMessage());
           try {
               bank1.input();

               bank1.verify();
           }
           catch (InvalidCustomerException i2){
               System.out.println(i2.getMessage());
               try {
                   bank1.input();

                   bank1.verify();
               }
               catch (InvalidCustomerException i3){
                   System.out.println(i3.getMessage());
                   System.out.println("Hey Thief , can i call police");
               }

           }


       }

    }



}
public class CustomeException {
    static void main(String[] args) {
        System.out.println("bank app started ");
     Bank b1  =  new Bank();
     b1.initiate();
        System.out.println("Bank app terminated ");




    }
}
