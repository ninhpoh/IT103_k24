package btvn.bt03;

import java.util.Stack;

public class MedicationProcessChecker {
    private Stack<String> stack;

    public MedicationProcessChecker() {
        this.stack = new Stack<>();
    }

    public boolean checkProcess(String[] actions) {
        reset();

        if (actions == null) {
            System.out.println("Không có thao tác để kiểm tra.");
            return true;
        }

        for (int i = 0; i < actions.length; i++) {
            String raw = actions[i];
            if (raw == null) continue;
            String action = raw.trim();

            if (action.equalsIgnoreCase("POP")) {
                if (stack.isEmpty()) {
                    System.out.println("Lỗi tại bước " + (i + 1) + ": POP khi stack rỗng. Không thể hoàn tất phát thuốc vì không có thao tác đang chờ.");
                    return false;
                } else {
                    String popped = stack.pop();
                    System.out.println("Bước " + (i + 1) + ": POP -> hoàn tất " + popped);
                }
            } else if (action.toUpperCase().startsWith("PUSH")) {
                stack.push(action);
                System.out.println("Bước " + (i + 1) + ": PUSH -> thêm " + action);
            } else {
                System.out.println("Cảnh báo tại bước " + (i + 1) + ": thao tác không hợp lệ '" + action + "'. Bỏ qua.");
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Lỗi: Kết thúc ca trực nhưng còn " + stack.size() + " thao tác PUSH chưa được POP. Các mục còn lại:");
            for (int i = stack.size() - 1; i >= 0; i--) {
                System.out.println("  - " + stack.get(i));
            }
            return false;
        }

        System.out.println("Quy trình hợp lệ: tất cả PUSH đã được POP và không có POP khi rỗng.");
        return true;
    }

    public void reset() {
        stack.clear();
    }
}