/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.advanceddatastructures;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author FranksLP
 */
public class Vertex {
    
 
/*
 * This class will serve as the proper node in our data structures
 * 
 */ 

    public String name; /* node's name */
    public List<Edge> adj; /* adjacency nodes */
    public int dist;  /* cost */
    public Vertex prev; /* previous node in the shortest path */
    public int extra; /* extra variable to be used by an algorithm  */

    public Vertex(String name) /* Class constructor */
    {
        this.name = name;  
        adj = new LinkedList<Edge>();
        reset();
    }

    public void reset() /* initializes the variables to an early stage */
    {
        dist = Integer.MAX_VALUE;
        prev = null; 
        extra = 0; 
    }

}
 