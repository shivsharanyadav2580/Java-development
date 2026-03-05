@FunctionalInterface
interface shop3{
    void revenues(); // it is functional interface because have only one abstract method
}

// 1 here is method immidiete implementation
//public class LambdaExpression {
//    static void main(String[] args) {
//        shop3 s1 = new shop3(){
//            public void revenues(){
//                System.out.println("shop revenue is 5 lakh");
//            }
//
//        };
//        s1.revenues();
//        }
//    }

// 2 usimg lambda expression

public class LambdaExpression {
    static void main(String[] args) {

        shop3 s3 = ()-> System.out.println("The shop 3 revenue is 8 lakh"); // here is only single statement so no {} need
        s3.revenues();

    }
}












