package btvn;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Bt02 {
    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("Paracetamol");
        input.add("Ibuprofen");
        input.add("Panadol");
        input.add("Paracetamol");
        input.add("Aspirin");
        input.add("Ibuprofen");

        System.out.println("Danh sách ban đầu: " + input);

        List<String> result = new ArrayList<>();
        for (String name : input) {
            if (!result.contains(name)) {
                result.add(name);
            }
        }

        Collections.sort(result);

        System.out.println("Danh sách sau khi loại trùng và sắp xếp: " + result);

    }
}
