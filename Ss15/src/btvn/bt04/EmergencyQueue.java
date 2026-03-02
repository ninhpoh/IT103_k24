package btvn.bt04;

import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class EmergencyQueue {
    private PriorityQueue<EmergencyPatient> pq;
    private AtomicLong counter;

    public EmergencyQueue() {
        counter = new AtomicLong(0);
        Comparator<EmergencyPatient> cmp = (a, b) -> {
            int c = Integer.compare(a.getPriority(), b.getPriority());
            if (c != 0) return c;
            return Long.compare(a.getArrivalOrder(), b.getArrivalOrder());
        };
        pq = new PriorityQueue<>(cmp);
    }

    public void addPatient(EmergencyPatient p) {
        if (p == null) return;
        p.setArrivalOrder(counter.getAndIncrement());
        pq.offer(p);
    }

    public EmergencyPatient callNextPatient() {
        return pq.poll();
    }

    public void displayQueue() {
        if (pq.isEmpty()) {
            System.out.println("Hàng chờ trống.");
            return;
        }
        List<EmergencyPatient> snapshot = new ArrayList<>(pq);
        snapshot.sort((a, b) -> {
            int c = Integer.compare(a.getPriority(), b.getPriority());
            if (c != 0) return c;
            return Long.compare(a.getArrivalOrder(), b.getArrivalOrder());
        });
        System.out.println("Danh sách chờ (ưu tiên cao -> thấp, cùng mức FIFO):");
        int pos = 1;
        for (EmergencyPatient p : snapshot) {
            System.out.println(pos + ". " + p);
            pos++;
        }
    }

    public boolean isEmpty() {
        return pq.isEmpty();
    }
}
