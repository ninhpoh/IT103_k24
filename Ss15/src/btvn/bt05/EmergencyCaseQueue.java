package btvn.bt05;

import java.util.Queue;
import java.util.LinkedList;

public class EmergencyCaseQueue {
    private Queue<EmergencyCase> cases;

    public EmergencyCaseQueue() {
        this.cases = new LinkedList<>();
    }

    public void addCase(EmergencyCase c) {
        if (c == null) return;
        cases.offer(c);
        System.out.println("Thêm ca: " + c.getPatient());
    }

    public EmergencyCase getNextCase() {
        EmergencyCase next = cases.poll();
        if (next != null) {
            System.out.println("Lấy ca tiếp theo: " + next.getPatient());
        } else {
            System.out.println("Không còn ca chờ.");
        }
        return next;
    }

    public void displayQueue() {
        if (cases.isEmpty()) {
            System.out.println("Hàng chờ cấp cứu trống.");
            return;
        }
        System.out.println("Danh sách ca chờ (đầu hàng -> cuối hàng):");
        int pos = 1;
        for (EmergencyCase ec : cases) {
            System.out.println(pos + ". " + ec.getPatient());
            pos++;
        }
    }

    public boolean isEmpty() {
        return cases.isEmpty();
    }
}