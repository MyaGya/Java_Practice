package Programers;


class Solution {

    class Caesar {

        public String caesar(String s, int _n) {
            return s.chars().map(c -> {
                int n = _n % 26;
                if (c >= 'a' && c <= 'z') {
                    return 'a' + (c - 'a' + n) % 26;
                } else if (c >= 'A' && c <= 'Z') {
                    return 'A' + (c - 'A' + n) % 26;
                } else {
                    return c;
                }
            }).mapToObj(c -> String.valueOf((char) c))
                .reduce((a, b) -> a + b).orElse("");
        }
    }

    public static void main(String[] args) {
        Solution tmp = new Solution();

    }
}