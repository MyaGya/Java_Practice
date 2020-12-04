package Programers;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {

    public int[] solution(int[] array, int[][] commands) {
        //int [] answer = new int[commands.length];
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int[] command : commands) {
            int[] waitingSortData = new int[command[1] - command[0] + 1];
            int waitingSortDataCount = 0;
            for (int i = command[0] - 1; i <= command[1] - 1; i++) {
                waitingSortData[waitingSortDataCount++] = array[i];
            }
            Arrays.sort(waitingSortData);
            answer.add(waitingSortData[command[2]-1]);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Solution tmp = new Solution();
        System.out.println(tmp.solution(new int[]{1, 5, 2, 6, 3, 7, 4},new int[][]{{2, 5, 3},{4, 4, 1},{1, 7, 3}}));
    }
}