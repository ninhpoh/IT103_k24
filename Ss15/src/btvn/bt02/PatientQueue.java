package btvn.bt02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class PatientQueue {
    private Queue<Patient> queue;

    public PatientQueue() {
        this.queue = new LinkedList<>();
    }

    public void addPatient(Patient p) {
        if (p == null) return;
        queue.offer(p);
    }

    public Patient callNextPatient() {
        return queue.poll();
    }

    public Patient peekNextPatient() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Không có bệnh nhân đang chờ.");
            return;
        }
        System.out.println("Danh sách bệnh nhân chờ (đầu hàng -> cuối hàng):");
        int pos = 1;
        for (Patient p : queue) {
            System.out.println(pos + ". " + p.toString());
            pos++;
        }
    }
}
