/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.advanceddatastructures;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author FranksLP
 * Evaluate the shortest path,
 * 
 * Construction: without parameters
 * 
 * ****Public operations*****
 * 
 * void addEdge( String v, String w, double (int for our case)  cvw)
 *                            -> adds an additional edge
 * void printPath( String w ) -> Prints path after running algorithm
 * void unweighted( String s )-> Unique Origin *unweighted
 * void dijkstra( String s )  -> Unique Origin *weighted
 * void negative( String s )  -> Unique Origin *negative weight
 * void acyclic( String s )   -> Unique acyclic origin
 * 
 * ***Errors****
 * Some comprobations are made to ensure that the graph is correct
 * and satisfies the properties all algorithms needs.
 * Exceptions are made if errors are detected.
 * 
 */
public class GraphBook {
   public static final int INFINITY = Integer.MAX_VALUE;
   
   private Map<String, Vertex> vertexMap = new HashMap<>();
   
   
   public void addEdge( String sourceName, String destName, int cost)
   {
       
   }
   
   public void printPath( String destName )
   {
       
   }
   
   public  void unweighted( String startName )
    {
       
   }
     
   public void dijkstra( String startName )
   {
       
   }

   public void negative( String startName )
   {
       
   }

   public void acyclic( String startName )
   {
       
   }

   
   
   
   private Vertex getVertex( String vertexName)
   {
    
   }       
        
   private void printPath( Vertex dest)
   {
       
   }

   private void clearAll()
   {
       
   }
   
   
}


/*
*Used to indicate violation of preconditions for the different shortests
*path algorithms
*
*
*/

class GraphException extends RuntimeException{
    

        
        GraphException(String name)
{
    super(name);
    
}


}