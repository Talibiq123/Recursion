public class NumberExampleRecursion {
    public static void main(String[] args) {
        // write a function that takes a number and print it
        // print first 5 numbers: 1, 2, 3, 4, 5
        print(1);
    }
    static void print(int n) {
        if(n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        // this is called tail recursion
        // this is the last function call
        print(n + 1);
    }
}
