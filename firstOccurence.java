public class firstOccurence {
    public static int firstoccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstoccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,3,8,9,5,3,7,8,5};
        System.out.println(firstoccurence(arr, 8, 0));
    }
}
