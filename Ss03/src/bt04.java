public class bt04 {
    public static void main(String[] args) {

        int[] a = {50, 13, 42, 21, 67};

        for (int s :a){
            System.out.print(s + " ");
        }
            System.out.print("\n");
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
