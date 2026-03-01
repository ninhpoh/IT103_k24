package btvn;

import java.util.HashSet;
import java.util.Set;

public class Bt03 {
    public static void main(String[] args) {
        Set<String> drugComponents = new HashSet<>();
        drugComponents.add("Aspirin");
        drugComponents.add("Caffeine");
        drugComponents.add("Paracetamol");

        Set<String> allergies = new HashSet<>();
        allergies.add("Penicillin");
        allergies.add("Aspirin");
        allergies.add("Pollen");

        Set<String> warnings = new HashSet<>(drugComponents);
        warnings.retainAll(allergies);

        Set<String> safeComponents = new HashSet<>(drugComponents);
        safeComponents.removeAll(allergies);

        System.out.println("Cảnh báo dị ứng: " + warnings);
        System.out.println("Thành phần an toàn: " + safeComponents);
    }
}