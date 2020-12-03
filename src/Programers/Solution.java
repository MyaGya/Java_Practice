package Programers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantList = new HashMap<String, Integer>();
        Map<String, Integer> compliteList = new HashMap<String, Integer>();
        for (String s : participant) {
            if (participantList.containsKey(s)) {
                participantList.put(s, participantList.get(s)+1);
            } else {
                participantList.put(s, 1);
            }
        }
        for (String s : completion) {
            if (compliteList.containsKey(s)) {
                compliteList.put(s, compliteList.get(s)+1);
            } else {
                compliteList.put(s, 1);
            }
        }
        Iterator iter = Arrays.stream(participant).iterator();
        while(iter.hasNext()){
            String runner = (String) iter.next();
            if(!participantList.get(runner).equals(compliteList.get(runner))){
                return runner;
            }
        }

        return "ERROR";
    }

    public static void main(String[] args) {

        Solution tmp = new Solution();
        System.out.println(
            tmp.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "mislav", "ana"}));
    }
}