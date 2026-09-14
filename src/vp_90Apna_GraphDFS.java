import java.util.ArrayList;
public class vp_90Apna_GraphDFS {

    static class Edge{
        int src;
        int dst;

        public Edge(int s, int d){
            this.src = s;
            this.dst = d;
        }
    }

    public static void createLink(ArrayList<Edge>[] Graph){
        for(int i = 0; i < Graph.length; i++){
            Graph[i] = new ArrayList<Edge>();
        }
        Graph[0].add(new Edge(0,2));
        Graph[0].add(new Edge(0,1));

        Graph[1].add(new Edge(1,3));

        Graph[2].add(new Edge(2,4));

        Graph[3].add(new Edge(3,1));
        Graph[3].add(new Edge(3,4));
        Graph[3].add(new Edge(3,5));

        Graph[4].add(new Edge(4,2));
        Graph[4].add(new Edge(4,3));
        Graph[4].add(new Edge(4,5));

        Graph[5].add(new Edge(5,3));
        Graph[5].add(new Edge(5,4));
        Graph[5].add(new Edge(5,6));

        Graph[6].add(new Edge(6,5));
    }

    public static void DFS(ArrayList<Edge>[] Graph,boolean[] vis, int curr){
        System.out.println(curr + " ");
        vis[curr] = true;

        for(int  i = 0; i < Graph[curr].size(); i++){
            Edge e = Graph[curr].get(i);
            if(vis[e.dst] == false){

                DFS(Graph, vis, e.dst);
            }
        }
    }
    public static void main(String[] args){
        int v = 7;

        ArrayList<Edge>[] Graph = new ArrayList[v];
        createLink(Graph);
        boolean[] vis = new boolean[v];
        DFS(Graph, vis, 0);
    }
}
