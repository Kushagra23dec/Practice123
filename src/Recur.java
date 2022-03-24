public class Recur {
    public static void main(String[] args) {
        Rec(456);
    }

    static int Rec(int N){

        if(N<=0){
            return 0;
        }
        System.out.print(N%10+" ");
        return   Rec(N/10) ;
    }
}
