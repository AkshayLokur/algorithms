package com.lokur;

import java.util.HashMap;
import java.util.Map;

public class StringWithUniqueCharacters {

    public static void main(String[] args) {
        String s = "akshay";
        boolean flag = determineIfStringHasUniqueCharacters(s);
        if (flag) {
            System.out.println("String '" + s + "' has all unique characters!");
        } else {
            System.out.println("String '" + s + "' has non unique characters!");
        }


        s = "lokur";
        flag = determineIfStringHasUniqueCharactersWithoutDataStructure(s);
        if (flag) {
            System.out.println("String '" + s + "' has all unique characters!");
        } else {
            System.out.println("String '" + s + "' has non unique characters!");
        }
    }

    /**
     * @param s
     * @return boolean
     */
    private static boolean determineIfStringHasUniqueCharacters(String s) {
        s = s.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        for (Character c : s.toCharArray()) {
            if (map.containsKey(c))
                return false;
            else {
                map.put(c, 1);
            }
        }

        return true;
    }

    /**
     * @param s
     * @return
     */
    private static boolean determineIfStringHasUniqueCharactersWithoutDataStructure(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }
}
