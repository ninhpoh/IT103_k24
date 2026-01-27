public class bt06 {
    public static void main(String[] args) {

        int[] arrayFirst  = {1, 3, 5, 7, 9};
        int[] arraySecond = {2, 3, 5, 6, 8, 9, 10};

        System.out.print("Kho cũ: [ ");
        for (int x : arrayFirst) {
            System.out.print(x + " ");
        }
        System.out.println("]");

        System.out.print("Lô mới: [ ");
        for (int x : arraySecond) {
            System.out.print(x + " ");
        }
        System.out.println("]");

        int[] temp = new int[arrayFirst.length + arraySecond.length];

        int i = 0, j = 0, k = 0;

        while (i < arrayFirst.length && j < arraySecond.length) {
            if (arrayFirst[i] < arraySecond[j]) {
                temp[k++] = arrayFirst[i++];
            } else if (arrayFirst[i] > arraySecond[j]) {
                temp[k++] = arraySecond[j++];
            } else {
                temp[k++] = arrayFirst[i];
                i++;
                j++;
            }
        }

        while (i < arrayFirst.length) {
            temp[k++] = arrayFirst[i++];
        }

        while (j < arraySecond.length) {
            temp[k++] = arraySecond[j++];
        }

        System.out.print("Kho tổng (đã gộp & lọc trùng): [ ");
        for (int x = 0; x < k; x++) {
            System.out.print(temp[x] + " ");
        }
        System.out.println("]");
    }
}
