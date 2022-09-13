class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
                
        for(int i=0; i<n; i++) {
            if(visited[i] == false) {
                visited[i] = true;
                count++;
                dfs(isConnected, visited, i);
            }
        }
        return count;
    }
    
    public void dfs(int[][] M, boolean[] visited, int i) {
        for(int j=0; j<M.length; j++) {
            if(!visited[j] && M[i][j] == 1) {
                visited[j] = true;
                dfs(M, visited, j);
            }
        }
    }
}