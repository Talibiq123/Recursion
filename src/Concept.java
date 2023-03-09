public class Concept {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n +" ");
        //fun(n--);
        fun(--n);
        //n-- (wrong) vs --n(right)
    }
}
