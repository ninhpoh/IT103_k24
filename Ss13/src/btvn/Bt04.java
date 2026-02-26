package btvn;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Bt04 {
    private LinkedList<String> queue = new LinkedList<>();
    private Set<String> emergencySet = new HashSet<>();

    public void patientCheckIn(String name) {
        queue.addLast(name);
    }

    public void emergencyCheckIn(String name) {
        queue.addFirst(name);
        emergencySet.add(name);
    }

    public void treatPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không còn bệnh nhân.");
            return;
        }
        String name = queue.removeFirst();
        if (emergencySet.contains(name)) {
            System.out.println("Đang cấp cứu: " + name);
            emergencySet.remove(name);
        } else {
            System.out.println("Đang khám: " + name);
        }
    }

    public static void main(String[] args) {
        Bt04 er = new Bt04();

        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.emergencyCheckIn("C");

        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}