import java.util.ArrayList;
import java.util.Collections;

class Student1 implements Comparable<Student1>{
    String name;
    int age;
    int avg;

    public Student1() {
    }

    public Student1(String name , int age , int avg) {
        this.name = name;
        this.age = age;
        this.avg = avg;
    }

    @Override
    public int compareTo(Student1 s1) {
        if(this.avg > s1.avg){
            return 1;

        }
        else
            return -1;

    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", avg=" + avg +
                '}';
    }

}

public class LaunchComparable2 {
    static void main(String[] args) {
        ArrayList<Student1> stu = new ArrayList<>();
        stu.add(new Student1("Shiv" , 23 , 68));
        stu.add(new Student1("neel" , 24 , 85));
        stu.add(new Student1("Shreyash" , 20 , 56));
        System.out.println(stu);
        Collections.sort(stu);
        System.out.println(stu);


    }
}
