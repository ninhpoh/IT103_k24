package btvn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bt01 {
    public static void main(String[] args) {
        List<Double> temps = new ArrayList<>();

        temps.add(36.5);
        temps.add(37.0);
        temps.add(38.2);
        temps.add(40.2);
        temps.add(37.0);
        temps.add(12.5);

        System.out.println("Danh sách ban đầu:" + temps);

        Iterator<Double> it = temps.iterator();
        while (it.hasNext()) {
            Double temp = it.next();
            if (temp < 34.0 || temp > 42.0) {
                it.remove();
            }
        }

        System.out.println("Danh sách sau khi lọc: " + temps);

        double sum = 0.0;
        for (Double t : temps) sum += t;
        double avg = sum / temps.size();
        System.out.println("Nhiệt độ trung bình: " + avg);
    }
}