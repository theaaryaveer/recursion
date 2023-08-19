public class lastOccurence {
    public static int lastoccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastoccurence(arr, key, i+1);
        if(isFound == -1 &&  arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,3,8,9,5,3,7,8,5};
        System.out.println(lastoccurence(arr, 5, 0));
    }
}
