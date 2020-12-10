package Programers;



import java.util.stream.LongStream;

class Solution {

    public long solution(int a, int b) {
        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }
        return LongStream.rangeClosed(a, b).sum();
    }

    public static void main(String[] args) {
        Solution ans = new Solution();
        System.out.println(ans.solution(0,3));
    }
}