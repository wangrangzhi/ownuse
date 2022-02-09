package io.github.wangrangzhi.testAndOkhttp.Solution;


import java.util.HashMap;
import java.util.Map;

public class Solution0013 {

    public static void main(String[] args) {
        Solution0013 solution = new Solution0013();
        System.out.println(solution.romanToInt("DCXXI"));// 621
        System.out.println(solution.romanToInt("CCCXLVIII"));// 348
    }

    public int romanToInt(String s) {

        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);


        String[] all = s.split("");
        int len = all.length;
        String c = all[all.length - 1];
        int sum = map.get(c);

        for (int i = all.length - 2; i >= 0; i--) {
            if (map.get(all[i]) < map.get(all[i + 1])) {
                sum -= map.get(all[i]);
            } else {
                sum += map.get(all[i]);
            }
        }


        return sum;

    }
}

