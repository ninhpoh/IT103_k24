public class bt03 {
    public static void main(String[] args) {

        String[] names = {
                "Conan",
                "Web Design",
                "Java Basic",
                "Doraemon",
                "Data Structure"

        };

        int[] quantities = {50, 50, 20, 5, 20};

        int max = quantities[0];
        int min = quantities[0];

        // Tìm max và min
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > max) max = quantities[i];
            if (quantities[i] < min) min = quantities[i];
        }

        System.out.println("Sách có số lượng nhiều nhất (" + max + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.println("- " + names[i]);
            }
        }

        System.out.println("------------------");
        System.out.println("Sách có số lượng ít nhất (" + min + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println("- " + names[i]);
            }
        }
    }
}
