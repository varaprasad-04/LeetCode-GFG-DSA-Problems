import java.util.Stack;
class Solution {
    void insertbottom(Stack<Integer> st,int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int top=st.pop();
        insertbottom(st,ele);
        st.push(top);
    }
    public void reverseStack(Stack<Integer> st) {
       if(st.isEmpty()){
            return;
       }
       int ele=st.pop();
       reverseStack(st);
       insertbottom(st,ele);
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        s.reverseStack(st);
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
}