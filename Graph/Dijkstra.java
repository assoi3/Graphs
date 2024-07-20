package Graph;

public static Dictionary[] dijkstra (Graph g, Vertex startingVertex){
    Dictionary<String, Integer> distances = new Hashtable<>();
    Dictionary<String, Vertex> previous = new Hashtable<>();
    PriorityQueue<QueueObject> queue = PriorityQueue<QueueObject>();


    distances.put(startingVertex.getData(), 0);
    queue.add(new QueueObject(startingVertex, 0));


    for(Vertex v: g.getVertices()) {
        if(v != startingVertex) {
            distances.put(v.getData(), Integer.MAX_VALUE);
        }

        previous.put(v.getData(), new Vertex("Null"));
    }


    while(queue.size() != 0) {
        Vertex current = queue.poll().vertex;
        for(Edge e: current.getEdges()) {
            Integer alternate = distances.get(current.getData()) + e.getWeight();
            String neighborValue = e.getEnd().getData();
            if(alternate < distances.get(neighborValue)){
                distances.put(neighborValue, alternate);
                previous.put(neighborValue, current);
                queue.add(new QueueObject(e.getEnd(), distance.get(neighborValue)));
                }

            }

        }
        return new Dictionary[]{distances, previous};


    }






    

