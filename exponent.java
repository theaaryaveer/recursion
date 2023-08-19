public class exponent {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = xnm1 * x;
        return xn;

        // the whole above 3 lines can also be written in a single line:

        // return x * power(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
