class Solution {
    public int[] shuffle(int[] arr, int n) {
        ArrayList<Integer>ans=new ArrayList<>();
        int i=0;
        while(ans.size()!=arr.length){
            ans.add(arr[i]);
            ans.add(arr[n+i]);
            i++;
        }
        for(i=0; i<ans.size(); i++){
            arr[i]=ans.get(i);
        }    
        return arr;
    }
}