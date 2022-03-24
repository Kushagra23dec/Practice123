package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 0, t = 0;
        int a[] = new int[5];
        Scanner s = new Scanner(System.in);

        while(i<5){
            a[i] = s.nextInt();
            i++;
        }
        System.out.println("Index: ");
        int index = s.nextInt();
        for(i = 0; i < 5; i++){
            for (int j = i+1 ; j<5; j++){

                if(a[j] > a[i]){
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println(a[index]);

            System.out.print(Arrays.toString(a));

    }
}
