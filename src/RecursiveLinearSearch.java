import java.util.ArrayList;

public class RecursiveLinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4, 9, 9};
        int target = 9;
        //System.out.println(search(arr, target, 0));
        //ArrayList<Integer> ans = findAllIndex(arr, target, 0);
        //System.out.println(ans);
        System.out.println(findAllIndex(arr, target, 0));
    }
    static boolean search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || search(arr, target, index+1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        // this will contain answer for that function call only
        if (target == arr[index]) {
             list.add(index);
        }
        ArrayList<Integer> ansFromAboveCall = findAllIndex(arr, target, index+1);
        list.addAll(ansFromAboveCall);
        return list;
    }
}
