class Solution {
    public List<Integer> getRow(int n) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>rowValues=new ArrayList<>();

        for(int i=0; i<=n; i++){
            ans.add(new ArrayList<Integer>());
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    ans.get(i).add(1);
                }else{
                    ans.get(i).add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
                }
            }
        }
        for(int i=0; i<ans.get(n).size(); i++){
            rowValues.add(ans.get(n).get(i));
        }
        return rowValues;
    }
}