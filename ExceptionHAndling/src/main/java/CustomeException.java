import java.util.Scanner;

class invalidCustomeException extends Exception {
    // here we create a constructor of invalidCustomeException
    public invalidCustomeException(String msg) {
        super(msg);

    }

    class Atm {


        private int AdharNo = 8624;
        private int pass = 2580;
        private int AdharNumber;
        private int Password;

        public void input() {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your last 4 digit adhar no.");
            AdharNumber = sc.nextInt();
            System.out.println("Enter your password");
            Password = sc.nextInt();
        }

        public void verify() throws invalidCustomeException {
            if (AdharNumber == AdharNo && Password == pass) {
                System.out.println("User is valid , take you cash");

            } else {
//            System.out.println("Enter correct password");
                throw new invalidCustomeException("Enter correct password");
            }

        }

    }
}
class Bank{
    public void initiate(){
      Atm a1  = new Atm();
}

public class CustomeException {
    static void main(String[] args) {
        System.out.println("Program start");
    Bank b1 =  new Bank();
    b1.initiate();
        System.out.println("Program terminate");

    }
}
