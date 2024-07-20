import java.util.ArrayList;


class AdjacencyListGraph<E extends Comparable<E>> {
    ArrayList<Vertex> vertices;


    AdjacencyListGraph(){

        vertices = new ArrayList<>();
    }


    private class Vertex {
        E data;

        ArrayList<Vertex> adjacentVertices;


        Vertex(E data) {
            adjacentVertices = new ArrayList<>();
            this.data = data;
        }

        public boolean addAdjacentVertex(Vertex to) {
            //.....
        }


        public boolean removeAdjacentVertex(E to) {}

        public boolean removeEdge(E from, E to) {}

        public boolean addEdge(E from, E to) {}


        @Override
        public String toString() {}


        public final class Graphs{}

        
    }
}