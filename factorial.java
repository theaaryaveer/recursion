public class factorial {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        // assume fnm1 as factorail n minus one 
        int fnm1 = fact(n-1);
         int fn = n * fact(n-1);
         return fn;
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println(fact(8));
    }
}
