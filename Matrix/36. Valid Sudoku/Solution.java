class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row=new HashSet[9];
        HashSet<Character>[] col=new HashSet[9];
        HashSet<Character>[] box=new HashSet[9];
        int n=board.length;
        for(int i=0;i<n;i++){
            row[i]=new HashSet<>();
            col[i]=new HashSet<>();
            box[i]=new HashSet<>();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                char ch=board[i][j];
                if(ch=='.')continue;
                int ind=(i/3)*3+(j/3);
                if(row[i].contains(ch)  ||
                    col[j].contains(ch)   ||
                    box[ind].contains(ch)
                )return false;
                row[i].add(ch);
                col[j].add(ch);
                box[ind].add(ch);
            }
          
        }
        return true;
    }
}