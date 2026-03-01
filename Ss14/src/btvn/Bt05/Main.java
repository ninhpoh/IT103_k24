package btvn.Bt05;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<Patient> patientComparator = (p1, p2) -> {
            if (p1.getSeverity() != p2.getSeverity()) {
                return Integer.compare(p1.getSeverity(), p2.getSeverity());
            } else {
                return Integer.compare(p1.getArrivalTime(), p2.getArrivalTime());
            }
        };

        TreeSet<Patient> emergencyQueue = new TreeSet<>(patientComparator);

        emergencyQueue.add(new Patient("Bệnh nhân Anh", 3, 800));
        emergencyQueue.add(new Patient("Bệnh nhân Binh", 1, 815));
        emergencyQueue.add(new Patient("Bệnh nhân Ching", 1, 805));

        System.out.println("Thứ tự xử lý cấp cứu:");
        for (Patient p : emergencyQueue) {
            System.out.println(p);
        }
    }

}
