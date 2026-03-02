package btvn.bt01;

import java.util.Stack;

public class MedicalRecordHistory {
    private Stack<EditAction> history;

    public MedicalRecordHistory() {
        this.history = new Stack<>();
    }

    public void addEdit(EditAction action) {
        if (action == null) return;
        history.push(action);
    }

    public EditAction undoEdit() {
        if (history.isEmpty()) return null;
        return history.pop();
    }

    public EditAction getLatestEdit() {
        if (history.isEmpty()) return null;
        return history.peek();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("Lịch sử chỉnh sửa trống.");
            return;
        }
        System.out.println("Lịch sử chỉnh sửa (mới nhất -> cũ nhất):");
        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i).toString());
        }
    }
}