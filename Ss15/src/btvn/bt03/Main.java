package btvn.bt03;

public class Main {
    public static void main(String[] args) {
        MedicationProcessChecker checker = new MedicationProcessChecker();

        String[] actions1 = {
                "PUSH: thuốcA",
                "PUSH: thuốcB",
                "POP",
                "POP"
        };
        System.out.println("Test 1 (hợp lệ): " + checker.checkProcess(actions1));
        System.out.println();

        String[] actions2 = {
                "PUSH: thuốcA",
                "POP",
                "POP"
        };
        System.out.println("Test 2 (POP khi rỗng): " + checker.checkProcess(actions2));
        System.out.println();

        String[] actions3 = {
                "PUSH: thuốcA",
                "PUSH: thuốcB"
        };
        System.out.println("Test 3 (còn PUSH chưa POP): " + checker.checkProcess(actions3));
    }

}
