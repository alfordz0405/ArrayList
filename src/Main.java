import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        //Open a file using FileReader

        //Read line by line
        //Perform Parsing in each line
        //Find the unique integer values to identify the total number of vertices in the given graph

        //---------AdjacencyList-----------------------------
        Graph g = new Graph(5);

        // insert edges
        // Read the file again line by line to get the edges
        //then call add_edges Method

        g.add_edges(0,1);
        g.add_edges(0,3);
        g.add_edges(1,2);
        g.add_edges(2,3);
        g.add_edges(1,4);
        g.add_edges(2,4);

        g.print_graph();

    //--------------ArrayList Example------------------------------------------------------
        //ArrayList<Integer> al = new ArrayList<>();

        //System.out.println(al.size());
       // al.add(10);
       // System.out.println(al.size());
       //al.add(20);
       // System.out.println(al.size());
       // al.add(30);
       // System.out.println(al.size());
       // al.add(40);
       // System.out.println(al.size());
       // al.add(50);
       // System.out.println(al.size());

        // print the entire list
       // System.out.println(al);
        //access the first item
       // System.out.println(al.get(0));
        //access the last item
       // System.out.println(al.get(al.size()-1));

        //Iterate through the list items
       // for(int i = 0; i<=al.size()-1; i++){
       //     System.out.println(al.get(i));
        }
    }
