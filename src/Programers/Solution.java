package Programers;

import java.util.regex.Pattern;

class Solution {
    public boolean solution(String s) {
        String solutionPattern = "[0-9]{4}|[0-9]{6}";
        return Pattern.matches(solutionPattern,s);
    }

    public static void main(String[] args) {
        Solution ans = new Solution();
        String parameter = "1234";
        System.out.println(ans.solution("123456"));
    }
}