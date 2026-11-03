class Solution {
    void bfs(char grid[][],boolean visited[][],int i,int j){
        int n=grid.length,m=grid[0].length;
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{i,j});
        visited[i][j]=true;
        int row[]={-1,1,0,0};
        int col[]={0,0,-1,1};
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int r=curr[0];
            int c=curr[1];

            for(int k=0;k<4;k++){
                int nr=r+row[k];
                int nc=c+col[k];
                if(nr>=0 && nr<n && nc>=0 && nc<m && !visited[nr][nc] && grid[nr][nc]=='1'){
                    q.add(new int[]{nr,nc});
                    visited[nr][nc]=true;
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
       int c=0,n=grid.length,m=grid[0].length;
       boolean visited[][]=new boolean[n][m];
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(!visited[i][j] && grid[i][j]=='1'){
                bfs(grid,visited,i,j);
                c++;
            }
        }   
       }
       return c;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        char[][] grid1 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
        };
        char[][] grid2 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '1', '1'},
        };
        System.out.println(sol.numIslands(grid1)); // Output: 2
        System.out.println(sol.numIslands(grid2)); // Output: 1
    }
}


class Solution {
    void bfs(char grid[][],boolean visited[][],int i,int j){
        int n=grid.length,m=grid[0].length;
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{i,j});
        visited[i][j]=true;
        int row[]={-1,1,0,0};
        int col[]={0,0,-1,1};
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int r=curr[0];
            int c=curr[1];

            for(int k=-1;k<=1;k++){
                for(int k2=-1;k2<=1;k2++){
                     int nr=r+k;
                    int nc=c+k2;
                    if(nr>=0 && nr<n && nc>=0 && nc<m && !visited[nr][nc] && grid[nr][nc]=='1'){
                     q.add(new int[]{nr,nc});
                     visited[nr][nc]=true;
                 }
                }
               
            }
        }
    }
    public int numIslands(char[][] grid) {
       int c=0,n=grid.length,m=grid[0].length;
       boolean visited[][]=new boolean[n][m];
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(!visited[i][j] && grid[i][j]=='1'){
                bfs(grid,visited,i,j);
                c++;
            }
        }   
       }
       return c;
    }
}
//the above is for the 8-directional islands, if you want to count only 4-directional islands, use the first bfs method.

