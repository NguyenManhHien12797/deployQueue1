import codegym.Queue;
import codegym.Solution;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.setRear(null);
        q.setFront(q.getRear());

        Solution.enQueue(q,14);
        Solution.enQueue(q,22);
        Solution.enQueue(q,6);

        Solution.displayQueue(q);

        System.out.printf("Deleted value= %d \n", Solution.deQueue(q));
        System.out.printf("Deleted value= %d \n", Solution.deQueue(q));

        Solution.displayQueue(q);

        Solution.enQueue(q,9);
        Solution.enQueue(q,20);
        Solution.displayQueue(q);
    }
}
