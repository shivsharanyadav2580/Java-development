import java.util.Scanner;
class UnderAgeException extends Exception{
    public UnderAgeException(String msg){
        super(msg);
    }

}
class OverAgeException extends Exception{
    public OverAgeException(String msg){
        super(msg);
    }


}

class Applicant{
    private int age;
    public void input(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter you age ");
        age = sc.nextInt();

    }
    public void verify() throws UnderAgeException , OverAgeException{
        if(age >= 18 && age < 70){
            System.out.println("Proceed further with your application");
        } else if (age < 18) {
//            System.out.println("babu abhi bache ho");
            throw new UnderAgeException("babu abhi bache ho javan ho jao pahle ");

        }
        else {
//            System.out.println("Baba apki umar chali gyi ab ghar rahiye");
            throw new OverAgeException("Baba apki umar chali gyi ab ghar rahiye");
        }
    }
}
class RTO{
    public void initiate() {


        Applicant ap = new Applicant();
        try {
            ap.input();
            ap.verify();

        } catch (UnderAgeException | OverAgeException e1) {
            System.out.println(e1.getMessage());
            try {
                ap.input();
                ap.verify();

            } catch (UnderAgeException | OverAgeException e2) {
                System.out.println(e2.getMessage());
                try {
                    ap.input();
                    ap.verify();

                } catch (UnderAgeException | OverAgeException e3) {
                    System.out.println(e3.getMessage());
                }

            }


        }
    }

}

public class LaunchCustomeException {
    static void main(String[] args) {
      RTO rto1  =  new RTO();
        rto1.initiate();


    }
}
