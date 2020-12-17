package Programers;


class Solution {

    public long solution(long n) {
        if (Math.pow((int) Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution tmp = new Solution();
        System.out.println(tmp.solution(121));
    }
}