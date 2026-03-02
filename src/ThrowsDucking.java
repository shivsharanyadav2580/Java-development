

public class ThrowsDucking {
    static void main(String[] args) throws Exception  {
        System.out.println("Hello Shivsharan");
        Thread.sleep(5000); // here it is checked exception so we need to ducking means alerrt the caller
        System.out.println("You are java developer");

    }
}
