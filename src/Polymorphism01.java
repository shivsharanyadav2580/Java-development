class Aeroplane{
    public void takeoff(){
        System.out.println("Aeroplane is taking off");
    }
    public void fly(){
        System.out.println("Aeroplane is fly");
    }
}

class CargoPlane extends Aeroplane{
    public void takeoff(){
        System.out.println("Cargo plane is taking high length runway");
    }
    public void fly(){
        System.out.println("Cargoplane is fly mid level sky");
    }
}
class FighterPlane extends Aeroplane{
    public void takeoff(){
        System.out.println("Fighter  plane is taking low  length runway");
    }
    public void fly(){
        System.out.println("Cargoplane is fly high level sky");
    }

}
class AirIndia extends Aeroplane{
    public void takeoff(){
        System.out.println("Airindia is low grade air services");
    }
    public void fly(){
        System.out.println("Airindia plane always some issue");
    }

}
class Airport{
    public void permit(Aeroplane aero){
        aero.takeoff();
        aero.fly();
    }
}
public class Polymorphism01 {
    static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        FighterPlane fp = new FighterPlane();
      AirIndia Ai =    new AirIndia();

        Airport a = new Airport();
        a.permit(cp);
        a.permit(fp);
        a.permit(Ai);



    }




}
