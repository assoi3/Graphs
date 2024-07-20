public class Main {
    public static void main(String[] args) {
        WeightedGraph<String> weightedGraph = new WeightedGraph<>(true);
        fillWithWeights(weightedGraph);


        System.out.println("Djikstra");
        Search<String> djk = new DjkstraSearch<>(weightedGraph, "Almaty");
        outputPath(djk, "Kyzlyorda");


        System.out.println("---------------");
        MyGraph<String> graph = new MyGraph<>(true);

        fillWithWeights(graph);

        System.out.println("DFS");
        Search<String> dfs = new DepthFirstSearch<>(graph, "Almaty");
        outputPath(dfs, "Kyzylorda");


        System.out.println("--------------------------");

        System.out.println("BFS:");
        Search<String> bfs = new BreadthFirstSearch<>(graph, "Almaty");
        outputPath(dfs,"Kyzylorda");

        System.out.println("BFS:");
        Search<String> bfs = new BreadthFirstSearch<>(graph, "Almaty");



        System.out.println("BFS:");
        Search<String> bfs = new BreadthFirstSearch<>(graph, "Almaty");
        outputPath(bfs, "Kyzylorda");
    }




    public static void fillWithoutWeights(MyGraph<String> graph) {
        graph.addEdge("Almaty", "Astana", 2.1);
        graph.addEdge("Shymkent", "Atyrau",7.8);
        graph.addEdge("Astana", "Kostanay" ,7.1);
        graph.addEdge("Shymkent", "Kyzylorda", 3.9);
      //  graph.addEdge()
    } 


    public static void outputPath(Search<String> search, String key){
        for(String v : search.pathTo(key)) {
            System.out.print(v + " -> ");
        }



        System.out.println();
    }
}