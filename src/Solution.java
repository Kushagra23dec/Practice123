class Solution {
    static int numMatchingSubseq(String s, String[] words) {

        int index = 0, op = 0;

        String w = new String();

        for(int i = 0; i < words.length ; i++){

            w = words[i];
            System.out.println(w);
            for(int j = 0; j < s.length(); j++){
                System.out.println("13");
                if(s.charAt(j) == w.charAt(index)){
                    index++;
                }
                System.out.println("j: " + j);
                if(index >= w.length() - 1) {
                    op +=1;
                    System.out.println(w);
                    break;
                }
                System.out.println("t");
            }
        }
        return op;
    }

    public static void main(String[] args) {

       String s = "dsahjpjauf";
       String[] words = {"ahjpjau","ja","ahbwzgqnuk","tnmlanowax"};

        System.out.println(numMatchingSubseq(s, words));
    }
}