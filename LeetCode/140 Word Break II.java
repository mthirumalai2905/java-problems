class Solution {
    List<String> ans;
    public List<String> wordBreak(String s, List<String> wordDict) {
        ans=new ArrayList<>();
        sol(s,wordDict,new StringBuilder());
        return ans;
    }
    public void sol(String s,List<String> list,StringBuilder x){
        int n=s.length();
        for(int i=1;i<=n;i++){
            String t=s.substring(0,i);
            if(list.contains(t)){
                if(i==n){
                    x.append(t);
                    ans.add(x.toString());
                    return ;
                }
                int z=x.length();
                x.append(t);
                x.append(" ");
                sol(s.substring(i),list,x);
                x.setLength(z);
            }
        }
    }
}
