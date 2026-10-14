class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        char ch[]=s.toCharArray();
        int c=0,l=0,r=0,n=ch.length;
        String can=null;
        while(r<n){
            if(ch[r]=='1')
                c++;        
            while(c>k){
                if(ch[l]=='1')
                    c--;
                l++;
                
            }
            if(c==k){
                while(ch[l] == '0')
                      l++;
                String beaut=s.substring(l,r+1);
                if(can ==null || beaut.length()<can.length())
                    can=beaut;
                else if(beaut.length()==can.length() && beaut.compareTo(can) < 0){
                    can=beaut;
                }
            }
            r++;
        }
        return (can==null)?"":can;


    }
}