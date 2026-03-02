package btvn.bt05;

import java.util.Stack;

public class EmergencyCase {
    private Patient patient;
    private Stack<TreatmentStep> steps;

    public EmergencyCase(Patient patient) {
        this.patient = patient;
        this.steps = new Stack<>();
    }

    public Patient getPatient() { return patient; }

    public void addStep(TreatmentStep step) {
        if (step == null) return;
        steps.push(step);
        System.out.println("Đã thêm bước cho " + patient.getName() + ": " + step);
    }

    public TreatmentStep undoStep() {
        if (steps.isEmpty()) {
            System.out.println("Không thể undo: không có bước xử lý nào cho " + patient.getName());
            return null;
        }
        TreatmentStep undone = steps.pop();
        System.out.println("Đã undo cho " + patient.getName() + ": " + undone);
        return undone;
    }

    public void displaySteps() {
        if (steps.isEmpty()) {
            System.out.println("Không có bước xử lý cho " + patient.getName());
            return;
        }
        System.out.println("Các bước xử lý cho " + patient.getName() + " (mới nhất -> cũ nhất):");
        for (int i = steps.size() - 1; i >= 0; i--) {
            System.out.println("  - " + steps.get(i));
        }
    }

    public boolean hasPendingSteps() {
        return !steps.isEmpty();
    }
}