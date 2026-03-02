class Telusko1 implements AutoCloseable {
    @Override


    public void close() throws Exception {
        System.out.println("Resource is getting close");
    }
}

public class AutoclosableInjava {
    public static void main(String[] args) throws Exception {

        try (Telusko1 t2 = new Telusko1()) {
            System.out.println("Using resource");
        }

    }
}