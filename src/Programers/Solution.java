package Programers;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> ans = new Stack<Integer>();
        for (int i : arr) {
            if (ans.empty()||ans.lastElement() != i) {
                ans.push(i);
            }
        }
        return ans.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        Solution tmp = new Solution();
        System.out.println(Arrays.toString(tmp.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
    }
}