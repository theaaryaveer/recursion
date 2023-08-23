public class binaryString {
    public static void printBinarystring(int n, int LastPlace, String str){
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        //work
        printBinarystring(n-1, 0, str+"0");

        if(LastPlace == 0){
             printBinarystring(n-1, 1, str+"1");
        }

    }
    public static void main(String[] args) {
        printBinarystring(5, 0, "");
    }
}
