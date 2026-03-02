package btvn.bt05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    private static String now() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public static void main(String[] args) {
        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        Patient p1 = new Patient("E001", "Nguyễn Văn A", 65);
        Patient p2 = new Patient("E002", "Trần Thị B", 50);
        queue.addCase(new EmergencyCase(p1));
        queue.addCase(new EmergencyCase(p2));

        queue.displayQueue();

        EmergencyCase current = queue.getNextCase();
        if (current != null) {
            current.addStep(new TreatmentStep("Tiếp nhận và đo dấu hiệu sinh tồn", now()));
            current.addStep(new TreatmentStep("Xét nghiệm máu nhanh", now()));
            current.displaySteps();

            current.undoStep();
            current.displaySteps();
        }
    }

}
