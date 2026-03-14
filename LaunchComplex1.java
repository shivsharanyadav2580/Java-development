import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer{
    int age;
    String name;
    double avg;

    public Cricketer() {
    }

    @Override
    public String toString() {
        return "Cricketer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", avg=" + avg +
                '}';
    }

    public Cricketer(int age , String name , double avg) {
        this.age = age;
        this.name = name;
        this.avg = avg;
    }
}
class Alpha implements Comparator<Cricketer>{
    @Override
    public int compare(Cricketer c1, Cricketer c2) {  //compare method come from Comparator
        if(c1.age > c2.age)
            return 1;
        else
            return -1;
    }
}

public class LaunchComplex1 {
    static void main(String[] args) {
        ArrayList<Cricketer> list = new ArrayList(); // object type => Cricketer
//        Cricketer c1 = new Cricketer(34 , "SKY" ,56.4); // below line is same but direct object create and add
        list.add(new Cricketer(20 , "Shreyash" , 100.2));
        list.add(new Cricketer(23 , "Shivshaarn"  , 65.9));
        list.add(new Cricketer(15 , "Alok" , 85.5));
        System.out.println(list);
//        Collections.sort(list); // it give error because which  type data
        // comparable and comparator
        Alpha a = new Alpha(); // alpha is class who implements Comparator
        Collections.sort(list ,a);
        System.out.println(list);



    }
}
