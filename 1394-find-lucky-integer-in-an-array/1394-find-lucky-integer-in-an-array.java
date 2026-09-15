class Solution {
    public int findLucky(int[] arr) {

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        int x=0;
        int max=-1;
        
        for(int key:map.keySet()){
            if(map.get(key)==key){
                max=key;
            }
        }
        return max;
        
    }
}