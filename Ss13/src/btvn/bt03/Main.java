package btvn.bt03;

import java.util.ArrayList;
import java.util.List;

public class Main extends FindCommonPatients{
    public static void main(String[] args) {
        List<Integer> idList1 = new ArrayList<>();
        idList1.add(101);
        idList1.add(102);
        idList1.add(105);

        List<Integer> idList2 = new ArrayList<>();
        idList2.add(102);
        idList2.add(105);
        idList2.add(108);

        List<Integer> commonIds = findCommonPatients(idList1, idList2);
        System.out.println("Test Case 1 Output: " + commonIds);

        List<String> codeList1 = new ArrayList<>();
        codeList1.add("DN01");
        codeList1.add("DN02");
        codeList1.add("DN03");

        List<String> codeList2 = new ArrayList<>();
        codeList2.add("DN02");
        codeList2.add("DN04");

        List<String> commonCodes = findCommonPatients(codeList1, codeList2);
        System.out.println("Test Case 2 Output: " + commonCodes);
    }
}
