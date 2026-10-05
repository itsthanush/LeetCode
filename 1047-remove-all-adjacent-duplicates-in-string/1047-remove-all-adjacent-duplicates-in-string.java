class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character>stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(!stack.isEmpty() && stack.peek() == s.charAt(i)){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }

        String res="";
        for(char ch:stack){
            res+=ch;
        }
        
        return res;
    }
}