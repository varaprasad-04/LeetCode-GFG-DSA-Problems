import java.util.*;
class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer>s1=new HashMap<>();
        int n=s.length(),m=t.length();
        for(int i=0;i<m;i++){
            s1.put(t.charAt(i),s1.getOrDefault(t.charAt(i),0)+1);
        }
        int l=0,minlen=Integer.MAX_VALUE,c=0,ind=-1;
        for(int r=0;r<n;r++){
            if(s1.containsKey(s.charAt(r))){
                if(s1.get(s.charAt(r))>0){
                    c++;
                    s1.put(s.charAt(r),s1.get(s.charAt(r))-1);
                }  
                else s1.put(s.charAt(r),s1.get(s.charAt(r))-1);
            }
            else s1.put(s.charAt(r),-1);
            while(c==m){
                if(r-l+1 < minlen){
                    minlen=r-l+1;
                    ind=l;
                }
                s1.put(s.charAt(l),s1.get(s.charAt(l))+1);
                if(s1.get(s.charAt(l))>0)
                    c--;
                l++;      
            }
           
        }
        return minlen==Integer.MAX_VALUE?"":s.substring(ind,ind+minlen);
    }
}