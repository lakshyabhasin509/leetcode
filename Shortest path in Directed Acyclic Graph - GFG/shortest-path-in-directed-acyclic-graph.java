//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edge = new int[m][3];
			for (int i = 0; i < m; i++) {
				edge[i][0] = sc.nextInt();
				edge[i][1] = sc.nextInt();
				edge[i][2] = sc.nextInt();
			}
			Solution obj = new Solution();
			int res[] = obj.shortestPath(n, m,edge);
			for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    
    class Pair{
        int node,dis;
        
        Pair(int n,int d){
            node=n;
            dis=d;
        }
    }
	public int[] shortestPath(int N,int M, int[][] edges) {
	    Queue<Pair> q=new ArrayDeque<>();
	    ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
	    int []dis=new int[N];
	    Arrays.fill(dis,Integer.MAX_VALUE);
	    for(int i=0;i<N;i++){
	        adj.add(new ArrayList<>());
	    }
	    
	    for(int i=0;i<M;i++){
	        adj.get(edges[i][0]).add(new Pair(edges[i][1],edges[i][2]));
	    }
	    
	    
	    q.add(new Pair(0,0));
	    
	    
	    while(!q.isEmpty()){
	        Pair p=q.remove();
	        int node=p.node;
	        if(dis[node]>p.dis)dis[node]=p.dis;
	        
	        for(Pair i:adj.get(node)){
	            q.add(new Pair(i.node,dis[node]+i.dis));
	        }
	    }
	    
	    for(int i=0;i<N;i++){
	        if(dis[i]==Integer.MAX_VALUE)dis[i]=-1;
	    }
	    
	    return dis;
	}
}