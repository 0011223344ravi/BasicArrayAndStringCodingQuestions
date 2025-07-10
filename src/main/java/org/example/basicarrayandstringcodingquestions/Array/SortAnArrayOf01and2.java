package org.example.basicarrayandstringcodingquestions.Array;

public class SortAnArrayOf01and2 {
    public static void sort012(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;

        // Count occurrences
        for (int num : arr) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else count2++;
        }

        // Overwrite the array
        int index = 0;
        while (count0-- > 0) arr[index++] = 0;
        while (count1-- > 0) arr[index++] = 1;
        while (count2-- > 0) arr[index++] = 2;
    }

    public static void main(String[] args) {
        int arr [] = {2,2,2,0,1,2,0,2,1,1,1,0,2,1,0};
         sort012(arr);
         for (int n : arr){
             System.out.println(n);
         }
    }
}
