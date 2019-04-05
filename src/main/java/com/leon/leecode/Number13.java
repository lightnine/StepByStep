package com.leon.leecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * url: https://leetcode.com/problems/roman-to-integer/
 *
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 *
 */
public class Number13 {
    public int romanToInt(String s) {
//        Map<Character, Integer> char2int = new HashMap<>(8);
//        char2int.put('I', 1);
//        char2int.put('V', 5);
//        char2int.put('X', 10);
//        char2int.put('L', 50);
//        char2int.put('C', 100);
//        char2int.put('D', 500);
//        char2int.put('M', 1000);
        if (s.length() == 1) {
            return getIntByRoman(s.charAt(0));
        }

        int[] intArr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            intArr[i] = getIntByRoman(s.charAt(i));
        }
        int result = intArr[intArr.length - 1];
        for (int i = 0; i < intArr.length - 1; i++) {
            if (intArr[i] < intArr[i+1]) {
                result -= intArr[i];
            } else {
                result += intArr[i];
            }
        }
        return result;
    }
    private int getIntByRoman(char roman) {
        switch (roman) {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }

    public static void main(String[] args) {

    }
}