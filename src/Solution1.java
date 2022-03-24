import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Solution1 {

    static int numMatchingSubseq(String s, String [] words){
        Map<Character, Queue<String>> map = new HashMap<>();

        int ans = 0;
        for(int i = 0; i <s.length(); i++){
            map.putIfAbsent(s.charAt(i), new LinkedList<>());
        }

        for(String word : words){
            char starChar = word.charAt(0);
            if(map.containsKey(starChar)){
                map.get(starChar).offer(word);   // offer ?
            }
        }
        for(int i = 0; i < s.length(); i++){
            char startChar = s.charAt(i);
            Queue<String> q = map.get(startChar);
            int size = q.size();
            for(int k = 0; k <size; k++){
                String str = q.poll();
                if(str.substring(1).length() == 0){
                    ans++;
                }
                else{
                    if(map.containsKey(str.charAt(1))){
                        map.get(str.charAt(1)).add(str.substring(1));
                    }
                }
            }

        }

        return ans;
    }




    public static void main(String[] args) {
        String s = "dsahjpjauf";
        String[] words = {"ahjpjau","ja","ahbwzgqnuk","dsa","tnmlanowax"};

        System.out.println(numMatchingSubseq(s, words));
    }
}
