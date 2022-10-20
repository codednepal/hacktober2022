import java.util.Iterator;
import java.util.LinkedList;

class Graph {
  
  private int noOfVertices;
  private LinkedList<Integer> adj[];
  Graph(int v) {
    noOfVertices = v;
    adj = new LinkedList[v];
    for (int i = 0; i < v; ++i)
      adj[i] = new LinkedList();
  }
  void addEdge(int v, int w) {
    adj[v].add(w);
  }
  void BFS(int s) {

    boolean visited[] = new boolean[noOfVertices];

    LinkedList<Integer> queue = new LinkedList<Integer>();

    visited[s] = true;
    queue.add(s);

    while (queue.size() != 0) {
      s = queue.poll();
      System.out.print(s + " ");

      Iterator<Integer> i = adj[s].listIterator();
      while (i.hasNext()) {
        int n = i.next();
        if (!visited[n]) {
          visited[n] = true;
          queue.add(n);
        }
      }
    }
  }

  public static void main(String args[]) {
    Graph graph = new Graph(4);

    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 2);
    graph.addEdge(2, 0);
    graph.addEdge(2, 3);
    graph.addEdge(3, 3);

    System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

    graph.BFS(2);
  }
}
