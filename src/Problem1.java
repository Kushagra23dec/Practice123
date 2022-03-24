public class Problem1 {

    public static int solve(int[] a1, int[] a2, int n){

        int s = 0;
        if(n==0){
            return -1;
        }
        if(n==1){
            return a1[0]*a2[0];
        }

        for(int i = 0; i<n; i++){

            s += a1[i] * a2[n-i-1];

        }
//                22,7,1,-5,5,-2
//                4,-1,21,12,10,-3


        return s;
    }


    public static void main(String[] args) {
        int[] a1 =  {22,7,1,-5,5,-2};
        int[] a2 = {4,-1,21,12,10,-3};
        int n = a2.length;


        System.out.println(" Solution:  " + solve(a1,a2,n));
    }
}
