package Programers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution {

    public int[] solution(int[] numbers) {
        HashSet<Integer> ans = new HashSet<Integer>();
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                ans.add(numbers[i] + numbers[j]);
            }
        }
        int[] ans2 = new int[ans.size()];
        int i =0;
        for (int number:ans){
            ans2[i++] = number;
        }
        Arrays.sort(ans2);
        return ans2;
    }

    public static void main(String[] args) {
        Solution tmp = new Solution();
        System.out.println(tmp.solution(new int[] {2,1,3,4,1}));
    }
}