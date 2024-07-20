import java.util.*;


public class MyGraph<Vertex> {

    private Vertex source;
    private Vertex dest;
    private Double weight;
    private Map<Vertex, List<Vertex>> list;


    public MyGraph<Vertex> {
        list = new HashMap<>();
    }

    public void addVertex(Vertex vertex){
        list.put(vertex, new ArrayList<>());
    }


    public void addVertex(Vertex vertex) {
        list.put(vertex, new ArrayList());
    }



    public void addEdge(Vertex source, Vertex destination) {
        checkVertex(source);
        checkVertex(destination);
        list.get(source).add(destination);
        list.get(destination).add(source);
    }


    private void checkVertex(Vertex vertex) {
        if (!list.containsKey(vertex)) 
            throw new IndexOutOfBoundsException("Vertex does not exist");
    }

    public boolean hasEdge(Vertex source, Vertex destination){
        checkVertex(source);
        checkVertex(destination);
        List<Vertex> neighbors = getNeighbors.contains(destination);
        return neighbors != null && neighbors.contains(destination);
    }



    public void printGraph(){
        for(Vertex vertex : list.keySet()) {
            System.out.println("Vertex"  + vertex  + "connected to" + getNeighbors(vertex));
    }

    public void removeEdge(Vertex source, Vertex destination){

        checkVertex(source);
        checkVertex(destination);

        list.get(source).remove(destination);
        list.get(destination).remove(source);
    }
    }

    
}
