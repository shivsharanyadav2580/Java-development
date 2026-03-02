class Mul{



    int mul(int a , int b){
        try{
            System.out.println("multiple of two number");

            return a * b; // in normal program after thr return statement no statement is excecute but in case of finally finally dominate return statement

        }
        finally {
            System.out.println("multiple done");
        }

    }



}

public class LaunchFinally {
    static void main(String[] args) {
   Mul m1   =   new Mul();
        System.out.println(m1.mul(5,4));


    }
}
