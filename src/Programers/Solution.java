package Programers;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).sorted().filter(x -> x % divisor == 0).toArray();
        if (answer.length == 0) { return new int[]{-1};}
        return answer;
    }

}