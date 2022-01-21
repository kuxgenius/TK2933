package Lab7A;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;
import java.util.Queue;

//DFS Technique for undirected graph

public class TraversalDFS{ 
	int vertices;   // No. of vertices 
	ArrayList<ArrayList<Integer>> adj_list; // adjacency list declaration
	
	// Constructor: to initialize adjacency lists as per no of vertices 

	TraversalDFS(int v) { 
		vertices = v; 
		adj_list = new ArrayList<>(); 
		for (int i=0; i<v; ++i)
			adj_list.add(new ArrayList<>());
	} 

	//add an edge to the graph 
	void addEdge(int v, int w) { 
		adj_list.get(v).add(w);
		adj_list.get(w).add(v); 
	} 

    boolean getConnect(int src, int dest)
    {
   
        if (src == dest)
           return true;

        boolean[] visited = new boolean[vertices];
        for (int i = 0; i < vertices; i++)
            visited[i] = false;

        Queue<Integer> queue = new LinkedList<>();
        visited[src] = true;
        queue.add(src);

        while (!queue.isEmpty()) {
            src = queue.remove();
            for (int i=0; i<adj_list.get(src).size();i++) {
                if (adj_list.get(src).get(i) == dest)
                    return true;
                if (!visited[adj_list.get(src).get(i)]) {
                    visited[adj_list.get(src).get(i)] = true;
                    queue.add(adj_list.get(src).get(i));
                }
            }    
        }
       return false;
    }

	public static void main(String args[]) { 
		Scanner in = new Scanner(System.in);
		int v,e,a,b;
		//Input for vertices and edges
		v = in.nextInt();
		e = in.nextInt();
		
		//create a graph object and add edges to it
		TraversalDFS g = new TraversalDFS(v);
		for(int x=0;x<e;x++) {
			a = in.nextInt();
			b = in.nextInt();
			g.addEdge(a, b); 
		}
		
		int check,c,d;
		
		check = in.nextInt();
		
		for(int x=0;x<check;x++) {
			c = in.nextInt();
			d = in.nextInt();
			if (g.getConnect(c, d))
				System.out.println("Connected");
			else
				System.out.println("Not connected");
		}

	} 

}