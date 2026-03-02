package btvn.bt01;

public class Main {
    public static void main(String[] args) {
        MedicalRecordHistory history = new MedicalRecordHistory();

        history.addEdit(new EditAction("Cập nhật chẩn đoán: viêm phổi", "2026-03-02 09:15"));
        history.addEdit(new EditAction("Thêm thuốc: Amoxicillin 50000000mg", "2026-03-02 09:20"));
        history.addEdit(new EditAction("Sửa liều lượng thuốc", "2026-03-02 09:30"));

        history.displayHistory();

        System.out.println("\nChỉnh sửa gần nhất: " + history.getLatestEdit());

        EditAction undone = history.undoEdit();
        System.out.println("\nĐã undo: " + undone);

        System.out.println();
        history.displayHistory();
    }
}