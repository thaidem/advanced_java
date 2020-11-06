package collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();
    queue.offer("Zaur");
    queue.offer("Dem");
    queue.offer("Oleg");
    queue.offer("Elena");
    queue.offer("Ivan");
    System.out.println(queue);
    System.out.println(queue.remove("Oleg"));
    System.out.println(queue);
//    System.out.println(queue.poll());
//    System.out.println(queue.peek());
//    System.out.println(queue.poll());
//    System.out.println(queue.peek());
//    System.out.println(queue.poll());
//    System.out.println(queue.peek());
//    System.out.println(queue.poll());
//    System.out.println(queue.peek());
//    System.out.println(queue.poll());
//    System.out.println(queue.peek());
//    System.out.println(queue);
  }
}
