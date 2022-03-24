import java.util.Scanner;

public class QuickS {

    static int Partition(int[] arr, int s , int e){
        int pivot = arr[e];
        int pIndex = s;
        for(int i = s; i < e-1; i++){

            if(arr[i]<pivot){
                int temp = arr[i];

            arr[i] = arr[pIndex];
            arr[pIndex] = temp;
            pIndex++;
            }
            }
        int temp = arr[e];
        arr[e] = arr[pIndex];
        arr[pIndex] = temp;
        return pIndex;
    }



    static void QuickSort(int[] arr, int s, int e){
        if(s<e){
            int p = Partition(arr, s, e);
            QuickSort(arr,s,(p-1));
            QuickSort(arr,(p+1),e);
        }
    }

    public static void main(String[] args) {
       int[] arr = new int[5];
       int s = 0;

        Scanner in = new Scanner(System.in);


        for(int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] +"  ");
        }

        QuickSort(arr,s,arr.length-1);
        System.out.println("sorted \n");
       for(int i = 0; i<arr.length; i++){
           System.out.print(arr[i] +"  ");
       }
    }
}
