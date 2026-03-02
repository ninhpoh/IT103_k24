package btth.demo;

import java.util.PriorityQueue;
import java.util.Queue;

public class DemoQueue {
    Queue<String> demo = new PriorityQueue<>();

    // them nhung ko an toan di day
//    public void add(String element) {
//        demo.offer(element);
//    }

// an toan hon
    public void add(String element) {
        demo.offer(element);
    }

    // xoa
//    public String remove() {
//        return demo.remove();
//    }

    public String remove() {
        return demo.poll();
    }


}
