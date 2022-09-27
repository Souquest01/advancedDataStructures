
package com.mycompany.advanceddatastructures;
 
import java.util.List;
/**
 *
 * @author FranksLP
 */


/* 
 * Abstraction of Graph, there will be two different ways of storing one in memory,
 * either as an adjacency matrix or a list of adjacency, we will not work with a list of
 * edges.
 * 
 * In this abstract class we will provide the methods, general for any graph such as,
 * but not limited to, 
 * create graph, add/delete node and add/delete edge. This will also help as we will be
 * able to call a variable Graph and store one of the more concrete objets, matrix or list,
 * knowing that they will behave in the same way having the same methods.
 * 
 * 
 */

abstract public class Graph
{

/* Constructor method  */
 Graph()
    {
    
    }    

/* Adds a node to the graph passed as parametre and returns the graph with it included.*/
 abstract public Graph addNode(Node a, Graph instanceOfGraph);
 

/* Adds an edge to the graph passed as parametre and returns the graph with it included */
 abstract public Graph addEdge(Node one, Node two, int weightOfEdge, Graph instanceOfGraph);
  

/* Deletes a node from the graph passed as parametre nad returns the graph without it. */ 

 abstract public Graph deleteNode(Node one, Node two, Graph instanceOfGraph);


/* Deletes an edge from the graph passed as parametre and returns the graph without it.  */
 abstract public Graph deleteEdge(Node one, Node two, Graph instanceOfGraph);


/* Checks whether the two nodes passed as parametres are adjacents */
 abstract public boolean isAdjacent(Node one, Node two, Graph instanceOfGraph);


/* Returns a list with the nodes adjacents to the node passed as parametre. */
 abstract public List listOfAdjacents(Node one, Node two, Graph instanceOfGraph);

/* Returns the weight of the edge linking the nodes passed as parametres. */
 public abstract int labelOfEdge(Node one, Node two, Graph instanceOfGraph);
 
}

