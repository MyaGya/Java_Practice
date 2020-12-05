package Programers;

class Solution {

    public int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n + 2];

        for (int i = 0; i < student.length; i++) {
            student[i] = 1;
        }
        for (int lostStudent : lost) {
            student[lostStudent] -= 1;
        }
        for (int reserveEnableStudent : reserve) {
            student[reserveEnableStudent] += 1;
        }
        for (int i = 1; i < student.length - 1; i++) {
            if (student[i] == 0) {
                if (student[i - 1] == 2) {  // 앞에서 빌리는 경우
                    student[i - 1] = 1;
                    continue;
                }
                if (student[i + 1] == 2) {  // 뒤에서 빌리는 경우
                    student[i + 1] = 1;
                    continue;
                }
                n -= 1;                     // 빌리지 못하는 경우
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Solution tmp = new Solution();
        System.out.println(tmp.solution(5, new int[]{1, 2, 3, 4, 5}, new int[]{1}));
    }
}