
public class Queue00 {

    public static void main(String[] args) {

        Queue01 queue = new Queue01();

        for (int i = 0; i < 20; i++) {
            queue.enqueue(i + 1);
        }
        int queueSize = queue.getSize();
        System.out.println("");
        System.out.println("Queue are ");
        System.out.println("");
        
        for (int j = 0; j < queueSize; j++) {
            System.out.println("Queue = " + queue.getqueue(j));
        }
        System.out.println("");
        
        queue.dequeue();
        queueSize = queue.getSize();
        System.out.println("Dequeue are ");
        System.out.println("");

        for (int j = 0; j < queueSize; j++) {
            System.out.println("Queue = " + queue.getqueue(j));
        }  
    }

    private void enqueue(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
