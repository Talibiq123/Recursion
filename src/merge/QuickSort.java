package merge;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] num = {5, 4, 3, 2, 1};
//        sort(num, 0, num.length-1);
//        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
    }
    static void sort(int[] num, int low, int high) {
        if(low > high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = end - ( end - start ) / 2;
        int pivot = mid;
        while (start <= end) {
            // also a reason why if its already sorted it will not swap
            while (num[start] < pivot) {
                start++;
            }
            while (num[end] < pivot) {
                end--;
            }
            if (start <= end) {
                int temp = num[start];
                num[start] = num[end];
                num[end] = temp;
                start++;
                end--;
            }
        }
        // now my pivot is at the correct position
        sort(num, low, end);
        sort(num, start, high );
    }
}
