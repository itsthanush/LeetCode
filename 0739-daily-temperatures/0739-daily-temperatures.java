class Solution {
    public int[] dailyTemperatures(int[] temps) {
        
        int [] result =new int[temps.length];

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<temps.length;i++){
            while(!stack.isEmpty() && temps[stack.peek()]< temps[i]){
                result[stack.peek()]=i - stack.pop();
            }
            stack.push(i);
        }
        return result;
    }
}