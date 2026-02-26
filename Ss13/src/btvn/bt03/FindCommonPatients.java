package btvn.bt03;

import java.util.ArrayList;
import java.util.List;

public class FindCommonPatients {
    public static <T> List<T> findCommonPatients(List<T> list1, List<T> list2) {
        List<T> commonPatients = new ArrayList<>();
        for (T patient : list1) {
            if (list2.contains(patient)) {
                commonPatients.add(patient);
            }
        }
        return commonPatients;
    }
}
