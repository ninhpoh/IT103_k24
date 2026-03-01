package btvn;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Arrays;
import java.util.Set;

public class Bt01 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList(
                "Nguyễn Văn Anh – Nam Định",
                "Trần Thị Binh – Thanh Hóa",
                "Nguyễn Văn Anh – Nam Định",
                "Lê Văn Ching –  Bat tràng"
        );
        Set<String> patients = new LinkedHashSet<>(input);

        System.out.println("Danh sách gọi khám:");
        for (String name : patients) {
            System.out.println(name);
        }
    }
}