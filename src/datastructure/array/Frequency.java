package datastructure.array;

import java.util.ArrayList;

public class Frequency {
    public static void main(String[] args) {

        int[] arr={1,2,2,6,7,0,7,5,8,9,6,5,78,9,65,4,57,8,654,45,678,7,98,65,7,8,65,4,7,8,56,5};
        ArrayList<Integer>unique=new ArrayList<>();
        for (int e :arr) {
            if (!unique.contains(e))
                unique.add(e);
        }
        for (int i=0;i< unique.size();i++){
            System.out.println(unique.get(i)+" : "+countFrequency(arr, unique.get(i)));
        }
    }
    public static int countFrequency(int[] elements, int num){
        int count = 0;
        for (int e : elements){
            if(e==num){
                count++;
            }
        }
        return count;
    }
}
