import java.util.ArrayDeque;

public class ArryaDeque {
    public static void main(String[] args) {
        ArrayDeque dq = new ArrayDeque();
        dq.add(100);
        dq.add(200);
        dq.add(300);

        dq.addFirst(400);
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.offer(500);
        System.out.println(dq);
        dq.offerFirst(600);
        System.out.println(dq);
    }
}
