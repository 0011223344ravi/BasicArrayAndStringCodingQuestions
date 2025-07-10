package org.example.basicarrayandstringcodingquestions.Hashmap;

import java.util.HashMap;

public class CharFrequency {
    public static void main(String[] args) {
        String s = "engineering";

        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // Print frequency map
        for (char ch : freq.keySet()) {
            System.out.println(ch + " → " + freq.get(ch));
        }
    }
}

