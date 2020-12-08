package Programers;

class Solution {

    public int solution(int n) {
        String ternaryNotation = "";
        int answer = 0;
        while (n > 0) {
            ternaryNotation += n % 3;
            n /= 3;
        }
        ternaryNotation = Long.toString(Long.parseLong(ternaryNotation));
        int powValue = ternaryNotation.length()-1;
        for(int i=0;i<ternaryNotation.length();i++){
            answer += Integer.parseInt(ternaryNotation.substring(i,i+1)) * Math.pow(3,powValue--);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution tmp = new Solution();
        System.out.println(tmp.solution(100000000));
    }
}