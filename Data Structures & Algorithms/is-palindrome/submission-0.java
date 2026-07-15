class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        char[] convertS = (s.toLowerCase()).toCharArray();
        int left = 0;
        int right = convertS.length - 1;
        for(int i = 0; i < convertS.length; i++){
            if(left >= right){
                break;
            }

            if(convertS[left] == convertS[right]){
                left++;
                right--;
            }
            else{
                return false;
            }
        }

        return true;
    }
}




