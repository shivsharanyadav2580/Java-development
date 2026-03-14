import java.util.HashMap;
import java.util.Map;
class PersonalINfo{
    String name;
    int age;
    double income;

    public PersonalINfo() {
    }

    @Override
    public String toString() {
        return "PersonalINfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", income=" + income +
                '}';
    }

    public PersonalINfo(String name , int age , double income) {
        this.name = name;
        this.age = age;
        this.income = income;
    }

}

public class LaunchMap {
    static void main() {

//     Map<Integer , String> m1 =   new  HashMap(2 , 5); // with generics
//        HashMap hm1 = new HashMap();
        HashMap<Integer , PersonalINfo> hm1 = new HashMap<>();
    hm1.put(1 , new PersonalINfo("shivsharan" , 23 , 000000.0));
        hm1.put(2 ,null);
        hm1.put(null , new PersonalINfo("Lalbahadur" , 50 , 5000000.0)); // null allowed

        System.out.println(hm1);


    }
}
