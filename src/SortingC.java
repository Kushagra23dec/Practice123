import java.util.Arrays;

public class SortingC {
    public static void main(String[] args) {
        int[] a = {45,64,7,78,712,6487,44,7,2,4784,421,6,87};

        System.out.println(Arrays.toString(a));

//        sort(a);

        sortbyrange(a,4, 8);
        System.out.println(Arrays.toString(a));





    }

    static void sort(int[] ar){

        for(int i =0;i<ar.length; i++){
            for(int j = i+1; j<ar.length; j++){
                if(ar[i] > ar[j]){
                    int t = ar[i];
                    ar[i] = ar[j];
                    ar[j] = t;
                }
            }
        }
    }

    static void sortbyrange(int[] arr, int s, int e){

        for(int i = s;i<=e;i++){

            for(int j = i+1; j<=e; j++){
                if(arr[i] > arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
}
