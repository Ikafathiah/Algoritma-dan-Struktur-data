/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author ikafa
 */
public class graphMain {
 public static void main(String[] args) throws Exception {
 Scanner sc = new Scanner(System.in);
 Graph graph = new Graph(6);
 System.out.print("Input Graph type (0=directed, 1=undirected): ");
 int pill = sc.nextInt();
 System.out.println(graph.graphType(pill));
 graph.addEdge(0, 1);
 graph.addEdge(0, 4);
 graph.addEdge(1, 2);
 graph.addEdge(1, 3);
 graph.addEdge(1, 4);
 graph.addEdge(2, 3);
 graph.addEdge(3, 4);
 graph.addEdge(3, 0);
 graph.printGraph();
 graph.degree(2);
 graph.removeEdge(1, 2);
 graph.printGraph();
 String pil;
 do {
 System.out.println("Input : <source> <destination>");
 int source = sc.nextInt();
 int destination = sc.nextInt();
 graph.addEdge(source, destination);
 do {
 System.out.print("Another one (y/n) : ");
 pil = sc.next();
 if (!pil.equalsIgnoreCase("y") && !pil.equalsIgnoreCase("n")) {

 System.out.println("Input False");
 }
 } while (!pil.equalsIgnoreCase("y") && !pil.equalsIgnoreCase("n"));
 } while (pil.equalsIgnoreCase("y"));
 graph.printGraph();
 }
   
}
