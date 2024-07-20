import java.util.ArrayList;

public class Graph {
    private ArrayList<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected;


    public Graph(boolean inputIsWeighted, boolean inputIsDirected) {
        this.vertices = new ArrayList<Vertex>();
        this.isWeighted = inputIsWeighted;
        this.isDirected = inputIsDirected;
    }



    public Vertex addVertex(String data) {
        Vertex newVertex = new Vertex(data);
        this.vertices.add(newVertex);
        return newVertex;
    }


    public void addEdge(Vertex vert1, Vertex vert2, Integer weight) {
        if (!this.isWeighted) {
            weight = null;
        }

        vertex1.addEdge(vertex2, weight);
        if(!this.isDirected) {
            vertex2.addEdge(vertex1, weight);
        }


        public void removeEdge(Vertex vert1) {
            vert1.removeEdge(vert2);


            if(!this.isDirected) {
                vert2.removeEdge(vert1);
            }
        }

        public void removeVertex(Vertex vertex) {
            this.vertices.remove(vertex);
        }


        public ArrayList<Vertex> getVertices(){
            return this.isWeighted;
    }



        public boolean isWeighted() {
            return this.isWeighted;
        }


        public boolean isDirected() {
            return this.isDirected;
        }


        public Vertex getVertexByValue(String value) {
            for(Vertex v: this.vertices) {
                if(v.getData() == value) {
                    return v;
                }
            }

            return null;
        }


        public void print() {
            for(Vertex v: this.vertices) {
                v.print(isWeighted);
            }
        }

    }