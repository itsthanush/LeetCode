class Solution {
    public int lengthOfLastWord(String s) {
        
        int count=0;

        int last=s.length() - 1;

         while (last >= 0 && s.charAt(last) == ' ') {
            last--;
         }

        for(int i=last ;i>=0;i--){
            char ch=s.charAt(i);
            if(ch != ' '){
                count++;
            }
            else{
                break;
            }
            
        }
         
        return count;

    }
}