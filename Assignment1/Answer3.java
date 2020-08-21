
//Q3 (a) ->

import java.io.*;
import java.util.*;

public class Answer3{

    public static void main(String[] args) {
        int Vertices,Edges;
        Scanner scan = new Scanner(System.in);
            System.out.print("Enter the number of Vertices in the graph : ");
            Vertices = scan.nextInt();
            System.out.print("Enter the number of edges in the graph : ");
            Edges = scan.nextInt();

            int graph[][]=new int[Edges][3];
            System.out.println("Enter the edges as <startingVertex endingVertex weigthOfTheEdge> : ");
            for (int i = 0; i < Edges; i++)
                for (int j = 0; j < 3; j++)
                    graph[i][j] = scan.nextInt();


        int source=0;
        int []distance = new int[Vertices];
        for (int i = 0; i < Vertices; i++)
            distance[i] = Integer.MAX_VALUE;

        distance[source] = 0;
        for (int i = 0; i < Vertices - 1; i++)
        {

            for (int j = 0; j < Edges; j++)
            {
                if (distance[graph[j][0]] + graph[j][2] <
                        distance[graph[j][1]])
                    distance[graph[j][1]] =
                            distance[graph[j][0]] + graph[j][2];
            }
        }
        boolean check=false;
        for (int i = 0; i < Edges; i++)
        {
            int temp1 = graph[i][0];
            int temp2 = graph[i][1];
            int weight = graph[i][2];
            if (distance[temp1] != Integer.MAX_VALUE &&
                    distance[temp1] + weight < distance[temp2]){
                System.out.println("Negative cycles exist.");
                check=true;
            }
        }
        if(check==false){
            System.out.println("Distance of other vertices from Source(0): ");
            for (int i = 0; i < Vertices; i++)
                System.out.println("for vertex "+i + "-> " + distance[i]);
        }
    }
}

//Q3(b) ->
// NO, the above implementation of bellman ford algorithm cannot be extended to find all possible paths between any two nodes.
