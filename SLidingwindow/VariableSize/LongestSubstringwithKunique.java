package SLidingwindow.VariableSize;

import java.util.HashMap;

public class LongestSubstringwithKunique {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, max = 0;

        while (j < s.length()) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

            if (map.size() < k) {
                j++;
            } else if (map.size() == k) {
                max = Math.max(max, j - i + 1);
                j++;
            } else {
                while (map.size() > k) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }
                    i++;
                }

                // Double-check again after shrinking
                if (map.size() == k) {
                    max = Math.max(max, j - i + 1);
                }

                j++; 
            }
        }

        System.out.println(max);
    }
}
 