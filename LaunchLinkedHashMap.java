import java.util.LinkedHashMap;
class PersonalINfo1{
    String name;
    int age;
    double income;

    public PersonalINfo1() {
    }

    @Override
    public String toString() {
        return "PersonalINfo1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", income=" + income +
                '}';
    }

    public PersonalINfo1(String name , int age , double income) {
        this.name = name;
        this.age = age;
        this.income = income;
    }

}

public class LaunchLinkedHashMap {
    static void main() {
        LinkedHashMap<Integer , PersonalINfo1> lkm = new LinkedHashMap<>();
        lkm.put(2 , new PersonalINfo1("Shivsharn" , 23 , 000000.0));
        lkm.put(5 , new PersonalINfo1("Bhuvneshvar" , 25 , 00000.0 ));
        lkm.put(6 , new PersonalINfo1("Shiskala" ,  30 , 0000));
        System.out.println(lkm);

    }
}
