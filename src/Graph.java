import java.util.ArrayList;
public class Graph {

    private int vertices;


    //Array List that will hold individual arraylist at each index
    private ArrayList<ArrayList<Integer>> al;


    Graph(int vertices_no){
        this.vertices = vertices_no;
        this.al = new ArrayList<>();


        for(int i = 0; i < vertices_no; i++){
            al.add(new ArrayList<>());
        }
       // al.add(new ArrayList<>());
    }
    public void add_edges(int from, int to){
        al.get(from).add(to);
        al.get(to).add(from);
    }

    public void print_graph() {
        System.out.println(this.al);
    }
}
