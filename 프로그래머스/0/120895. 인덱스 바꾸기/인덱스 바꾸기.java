class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        char[] arr = my_string.toCharArray();
        
        
        arr[num1] = my_string.charAt(num2);
        arr[num2] = my_string.charAt(num1);
        
        // return arr;
        return String.valueOf(arr);
    }
}