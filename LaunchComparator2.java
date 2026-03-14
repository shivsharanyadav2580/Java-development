//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//class Student{
//    String name;
//    int age;
//    int income;
//
//    public Student() {
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", income=" + income +
//                '}';
//    }
//
//    public Student(String name , int age , int income) {
//
//        this.name = name;
//        this.age = age;
//        this.income = income;
//    }
//
//}
//class Sort implements Comparator<Student>{
//
//    @Override
//    public int compare(Student s1, Student s2) {
//        if (s1.income > s2.income)
//            return 1;
//        else
//            return -1;
//    }
//}
//public class LaunchComparator2 {
//    static void main() {
//        ArrayList<Student> stu = new ArrayList();
//        stu.add(new Student("Shivsharan" , 23 , 40000));
//        stu.add(new Student("Neelkaran" , 24, 30000));
//        stu.add(new Student("Shreyash" , 22 , 50000));
//        stu.add(new Student("SGaurav" , 25 , 10000));
//        System.out.println(stu);
//        // first we create a Object of class which implement comparator
////  Sort s =   new Sort();
//
//        Collections.sort(stu , (Student s1 , Student s2){
//            if(s1.age> s2.age){
//                return 1 ;
//             else
//                 return -1;
//            }
//        });
//
//
//
//    }
//}
