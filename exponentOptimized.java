public class exponentOptimized {
    public static int optimizedExponent(int x, int n){
        if(n == 0){
            return 1;
        }
        // is n is even
        int halfPower = optimizedExponent(x, n/2);
        int halfPowerSquare = halfPower * halfPower;

        // if n is odd
        if(n%2 != 0 ){
            halfPowerSquare = x * halfPowerSquare;
        }
        return halfPowerSquare;
    }
    public static void main(String[] args) {
        int x =2;
        int n = 5;
        System.out.println(optimizedExponent(x, n));
    }
}
