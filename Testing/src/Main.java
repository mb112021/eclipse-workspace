/*public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        System.out.println("Queue size: " + queue.size());
        System.out.println("Front element: " + queue.peek());

        System.out.println("Dequeuing elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}*/


public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Top element: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " popped from stack");
        }
    }
}