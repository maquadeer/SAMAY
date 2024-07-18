package bfs;
import java.util.*;
public class BFS 
{
    public int v;
    public int adj[][];
    public BFS()
    {
        v = 8;
        adj = new int[][]{
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
    public void bfs(int s)
    {
        int i = s;
        Queue<Integer> q = new LinkedList<Integer>();
        int visited[] = new int[v];
        System.out.print(i + " ");
        visited[i] = 1;
        q.add(i);
        while(!q.isEmpty())
        {
           i = q.remove();
           for(int j = 0; j < v; j++)
           {
               if(adj[i][j] == 1 && visited[j] == 0)
               {
                   System.out.print(j + " ");
                   visited[j] = i;
                   q.add(j);
               }
           }
        }
    }
    public static void main(String[] args) {
       BFS b = new BFS();
       System.out.print("BFS :  ");
       b.bfs(1);
    }
}
