package datastructure.array;

import java.util.ArrayList;

public class Duplicates {
    public static void main(String[] args) {
        int[] elements = {1,2,2,4,4,3,5,5,6};
       ArrayList<Integer> uniqueArray=new ArrayList<>();

        for (int i=0;i<elements.length;i++){
            System.out.print(elements[i]);
            if (i<elements.length-1)
                    System.out.print(" , ");
        }
        System.out.println();
        for (int e : elements) {
            if (!uniqueArray.contains(e)) {
                uniqueArray.add(e);
            }
        }
        System.out.println(uniqueArray);
    }
}
