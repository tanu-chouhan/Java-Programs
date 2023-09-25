package datastructure.array;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] number = new int[size];

        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
            System.out.println(number[i]);
        }
        int max = number[0];
        int min = number[0];

        for (int i=0;i<size;i++){
            if (number[i]>max){
                max=number[i];
            }

            if (number[i]<min){
                min=number[i];
            }
        }

        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
