import java.util.Arrays;
import java.util.Scanner;

public class MultiDigit {
    public static void main(String[] args) {
        int[] repeatD = new int[10];
        Scanner in = new Scanner(System.in);
        int discount = 0;
        long orderId = in.nextLong();
int i = 0;
        for(long x = orderId; x>0;x=x/10) {
            repeatD[(int) (x % 10)] += 1;
        }
        for(int dc : repeatD){
            discount += dc/2;
        }
        System.out.println(discount);

    }
}
