class Solution {
    public boolean checkValidString(String s) {
        if(s.length()==1 && s.charAt(0)=='*')return true;
        if(s.length()==1)return false;
        int min=0,max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                min=min+1;
                max=max+1;
            }
            else if(ch==')'){
                max=max-1;
                min=min-1;
            }
            else{
                min=min-1;
                max=max+1;
            }
            if(min<0)min=0;
            if(max<0)return false;
        }
        return min==0;
    }
}