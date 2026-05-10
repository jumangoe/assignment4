# Assignment 4 - Graph Traversal and Representation System

## Project Overview

This project demonstrates graph representation and graph traversal algorithms using Java.

The graph is implemented using an adjacency list structure. The program supports:

- Vertex creation
- Edge creation
- Breadth-First Search (BFS)
- Depth-First Search (DFS)
- Performance analysis using nanoTime()

The project was created to understand graph structures, traversal algorithms, and their time complexity.

---

# Graph Structure

The graph consists of:

- Vertices (nodes)
- Edges (connections between vertices)

The graph uses an adjacency list representation.

Example:

0 -> 1 2  
1 -> 3 4  
2 -> 5  

---

# Classes Description

## Vertex Class

Represents a vertex in the graph.

### Fields
- id

### Methods
- Constructor
- GetId()
- toString()

---

## Edge Class

Represents a connection between two vertices.

### Fields
- source
- destination

### Methods
- Constructor
- GetSource()
- GetDestination()
- toString()

---

## Graph Class

Represents the graph structure using adjacency lists.

### Methods

#### AddVertex(Vertex vertex)
Adds a new vertex.

#### AddEdge(int from,int to)
Adds an edge between vertices.

#### PrintGraph()
Prints graph structure.

#### Bfs(int start)
Performs Breadth-First Search traversal.

#### Dfs(int start)
Performs Depth-First Search traversal.

---

## Experiment Class

Used for testing and performance analysis.

### Methods

#### RunTraversals(Graph graph)
Runs BFS and DFS and measures execution time.

#### RunMultipleTests()
Creates graphs with different sizes:
- 10 vertices
- 30 vertices
- 100 vertices

#### PrintResults()
Prints final message.

---

# BFS Algorithm

Breadth-First Search visits vertices level by level.

BFS uses a Queue data structure.

### Steps
1. Start from selected vertex
2. Mark vertex as visited
3. Add neighbors to queue
4. Repeat until queue becomes empty

### Time Complexity

O(V+E)

Where:
- V = number of vertices
- E = number of edges

### Use Cases
- Shortest path in unweighted graphs
- Network traversal
- Social networks

---

# DFS Algorithm

Depth-First Search explores graph deeply before backtracking.

DFS uses recursion.

### Steps
1. Visit current vertex
2. Mark as visited
3. Recursively visit neighbors

### Time Complexity

O(V+E)

### Use Cases
- Path finding
- Cycle detection
- Topological sorting

---

# Experimental Results

The program tested graphs with:
- 10 vertices
- 30 vertices
- 100 vertices

Example output:

```text
BFS time: 1229917 ns
DFS time: 837834 ns
