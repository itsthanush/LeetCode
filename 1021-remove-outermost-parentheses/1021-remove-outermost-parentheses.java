class Solution {
    public String removeOuterParentheses(String s) {
        
        String ans="";
        int bal_count=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                if(bal_count>0){
                    ans+=ch;
                }
                bal_count++;
            }
            else{
                if(ch==')'){
                    bal_count--;
                    if(bal_count>0){
                        ans+=ch;
                    }
                }
            }

        }

        return ans;

    }
}