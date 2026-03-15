class Neel{
    Neel(){
        System.out.println("Neel is here");

    }
}
class Shiv extends Neel{


//    Neel(){
//        System.out.println("Neel is here");
//
//    }  // by super()
    Shiv(){
//        super(); // by Default super() is present to call parent class constructor
        System.out.println("Shivsharan is Here ");
    }
}

public class Inheritance {
    static void main(String[] args) {
        Shiv s1  =   new Shiv();


    }




}
