import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Practice1 {



    static int Solution(String S, String[] words){
    int c = 0;
    HashMap<Character, Queue<String>> map = new HashMap<>();
    for(int i = 0; i <S.length(); i++){
        map.putIfAbsent(S.charAt(i), new LinkedList<>());
    }
        System.out.println("*: map: " + map);
       for(String word : words){
           char startChar = word.charAt(0);
           if(map.containsKey(startChar)){
               map.get(startChar).offer(word);
           }
       }
        System.out.println("**: map: " + map);

       for(int i = 0; i <S.length(); i++){
           char startChar = S.charAt(i);
           Queue<String> q = map.get(startChar);
           int size = q.size();
           for(int k = 0; k < size; k++){
               String str = q.poll();
              // System.out.println("*3*: map: " + map);

               //System.out.println("str: "+str);
               if(str.substring(1).length() == 0){
                    c++;
               }
               else {
                   if(map.containsKey(str.charAt(1))){
                       System.out.println("7***: map: " + map +" c: " + c);
                       map.get(str.charAt(1)).add(str.substring(1));
                      System.out.println("8***: map: " + map +" c: " + c);

                   }
               }

           }
       }


        //System.out.println("**: map: " + map);

        return c;
    }


    public static void main(String[] args) {
        String s = "asdfljkalerefadlk";
        String[] words = {"ask","kak", "dad", "dfld", "kdke", "eieyw","aoytttreranito", "oyanito" };

        System.out.println(Solution(s,words));

    }
}
