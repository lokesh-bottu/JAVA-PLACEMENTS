public class Fibonacci {
    public static int fib(int value) {
        if(value==1)
            return 0;
        if(value==2)
            return 1;
        return fib(value-1)+fib(value-2);
    }
    public static void main(String args[]) {
        System.out.println(fib(5));
    }
}
