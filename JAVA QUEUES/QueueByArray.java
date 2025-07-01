public class QueueByArray {
    static class Queue {
        int[] a;  // Array to store queue elements
        int size; // Maximum size of the queue
        int rear; // Index of the rear element

        // Constructor to initialize the queue
        Queue(int n) {
            a = new int[n];
            size = n;
            rear = -1;
        }

        // Check if the queue is empty
        public boolean isEmpty() {
            return rear == -1;
        }

        // Add an element to the queue
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            a[rear] = data;
        }

        // Remove an element from the queue
        public int remove() { //O(n)-Drawback 
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = a[0];
            // Shift all elements to the left
            for (int i = 0; i < rear; i++) {
                a[i] = a[i + 1];
            }
            rear--;
            return front;
        }

        // Peek at the front element of the queue
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return a[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
