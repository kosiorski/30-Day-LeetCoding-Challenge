package Week1;

import java.util.*;

public class Day6_GroupAnagrams {
    public static void main(String[] args) {
        /*
        Given an array of strings, group anagrams together.
        */

        String[] array = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams(array);

        lists.forEach(System.out::println);
    }


    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        String s;
        char[] c;
        String key;

        for (String str : strs) {
            s = str;
            c = s.toCharArray();
            Arrays.sort(c);
            key = new String(c);
            if (map.containsKey(key)) {
                map.get(key).add(s);
            } else {
                List<String> glist = new ArrayList<>();
                glist.add(s);
                map.put(key, glist);
            }
        }

        return new ArrayList<>(map.values());
    }
}
