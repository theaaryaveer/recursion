public class removeDuplicates {
    public static void removeduplicates(String str, int index, StringBuilder newStr, boolean map[]){
        //base case
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }
        //work
        char currChar = str.charAt(index);
        if(map[currChar-'a']==true){
            //duplicate
            removeduplicates(str, index+1, newStr, map);
        }
        else{
            map[currChar-'a'] = true;
            removeduplicates(str, index+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "yogeshkumarshah";
        removeduplicates(str,0, new StringBuilder(""), new boolean[26]);
    }
}
