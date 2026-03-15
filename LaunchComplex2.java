import java.util.ArrayList;
import java.util.Collections;

class Cricketer1 implements Comparable<Cricketer1>{
    int age;
    String name;
    double avg;

    public Cricketer1() {
    }

    @Override
    public String toString() {
        return "Cricketer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", avg=" + avg +
                '}';
    }
    @Override
    public int compareTo(Cricketer1 c1){
        if(this.avg > c1.avg)
            return 1;
        else
            return -1;
    }


    public Cricketer1(int age , String name , double avg) {
        this.age = age;
        this.name = name;
        this.avg = avg;
    }
}
public class LaunchComplex2 {
    static void main(String[] args) {

        ArrayList<Cricketer1> list = new ArrayList(); // object type => Cricketer
//        Cricketer c1 = new Cricketer(34 , "SKY" ,56.4); // below line is same but direct object create and add
        list.add(new Cricketer1(20 , "Shreyash" , 100.2));
        list.add(new Cricketer1(23 , "Shivshaarn"  , 65.9));
        list.add(new Cricketer1(15 , "Alok" , 85.5));
        System.out.println(list);
        Collections.sort(list); // sort based on average
        System.out.println(list);

    }
}
