class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length,m=image[0].length;
        int old=image[sr][sc];
        if(old==color)return image;
        Queue<int[]> pq=new LinkedList<>();
        image[sr][sc]=color;
        pq.add(new int[]{sr,sc});
        int dr[]={-1,1,0,0};
        int dc[]={0,0,-1,1};
        while(!pq.isEmpty()){
            int curr[]=pq.poll();
            int r=curr[0];
            int c=curr[1];
            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && image[nr][nc]==old){
                    image[nr][nc]=color;
                    pq.add(new int[]{nr,nc});
                }
                    
            }
        }
        return image;
    }
}