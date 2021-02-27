import java.util.HashMap;
import java.util.Map;

public class testHackrank {
    public static String baitoan(String s, int k) {
        if (testnow(s) == 0) return "Not found!";
        Map<Integer, String> mapTest = new HashMap<>();
        int max = 0;
        int length = s.length();
        for (int i =0; i< length;i++) {
            if ((i* k) < s.length() && (i* k + k) < s.length()) {
                String check = s.substring(i * k, k + i * k);
                mapTest.put(testnow(check), check);
            }
        }
        for (Integer elm : mapTest.keySet()) {
            if (elm > max) max = elm;
        }

        return mapTest.get(max);
    }

    public static Integer testnow(String s) {
        String[] vowels = {"a","e","i","o","u"};
        int count = 0;
        for (String el : vowels) {
            if (s.indexOf(el) != -1) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String result = baitoan("mlaiocvfioauekdjhaihgioeuiuaf", 7);
        System.out.println(result);
    }
}
