package dfs;

public class DFS {

    public int v;
    public int adjMat[][];
    public int visited[];

    public DFS() {
        v = 8;
        visited = new int[v];
        adjMat = new int[][]{
            {0, 1, 1, 0, 0, 0, 0, 0},
            {1, 0, 0, 1, 1, 0, 0, 0},
            {1, 0, 0, 0, 0, 1, 1, 0},
            {0, 1, 0, 0, 0, 0, 0, 1},
            {0, 1, 0, 0, 0, 0, 0, 1},
            {0, 0, 1, 0, 0, 0, 0, 1},
            {0, 0, 1, 0, 0, 0, 0, 1},
            {0, 0, 0, 1, 1, 1, 1, 0}
        };
    }

    public void dfs(int s) {
        if (visited[s] == 0) {
            System.out.print(s + "  ");
            visited[s] = 1;
            for (int j = 0; j < v; j++) {
                if (adjMat[s][j] == 1 && visited[j] == 0) {
                    dfs(j);
                }
            }
        }
    }

    public static void main(String[] args) {
        DFS d = new DFS();
        System.out.print("DFS : ");
        d.dfs(0);
    }
}
