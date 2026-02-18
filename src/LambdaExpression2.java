interface FI {
    int lengthOfWord(String name);

}
//class Fiimpl implements FI{
//    public int lengthOfWord(String name){
//        return name.length();
//    }
//}
// 1 method
//public class LambdaExpression2 {
//    static void main(String[] args) {
//        Fiimpl len = new Fiimpl();
//        System.out.println(len.lengthOfWord("Shivsharan"));
//
//    }
//
//}
// opt 2 Anonymus function
//public class LambdaExpression2 {
//    static void main(String[] args) {
//        FI f2 = new FI(){
//            public int lengthOfWord(String name){
//                return name.length();
//            }
//
//
//
//        };
//        System.out.println(f2.lengthOfWord("Shivsharan Yadav"));
//
//    }
//}
