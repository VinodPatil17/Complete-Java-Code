import java.util.*;

//BFS FOR COMPLETE SINGLE CYCLE
public class vp_88Apna_GraphBFS {

    static class Edge {
        int src;  //starting pt
        int dst;  //destination
      //  int wgh;  //weight

        public Edge(int s, int d){
            this.src = s;
            this.dst = d;
           //this.wgh = w;
        }
    }

    public static void createLink(ArrayList<Edge> graph[]){
        //this for loop allows to create empty arraylist before it contains null
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));

    }

    public static void BSf(ArrayList<Edge> Graph[], int v){
            Queue<Integer> Q = new LinkedList<>();
            boolean[] vis = new boolean[v];
            Q.add(0);

            while(!Q.isEmpty()){
                int curr = Q.remove();
                if(vis[curr] == false){
                    System.out.println(curr + " ");
                    vis[curr] = true;

                    for(int i = 0; i < Graph[curr].size(); i++){
                        Edge e = Graph[curr].get(i);
                        Q.add(e.dst);
                    }
                }
            }
    }
    public static void main(String[] args){
        int v = 7;

        ArrayList<Edge>[] Graph = new ArrayList[v];
        createLink(Graph);
        BSf(Graph, v);
    }
}
