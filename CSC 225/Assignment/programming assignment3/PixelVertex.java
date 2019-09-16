/* PixelVertex.java
   CSC 225 - Summer 2019


   B. Bird - 04/28/2019
   (Add your name/studentID/date here)
*/


public class PixelVertex{

	/* Add a constructor here (if necessary) */
	
	
	/* getX()
	   Return the x-coordinate of the pixel corresponding to this vertex.
	*/
	public int getX(){
		return -1;
	}
	
	/* getY()
	   Return the y-coordinate of the pixel corresponding to this vertex.
	*/
	public int getY(){
		return -1;
	}
	
	/* getNeighbours()
	   Return an array containing references to all neighbours of this vertex.
	   The size of the array must be equal to the degree of this vertex (and
	   the array may therefore contain no duplicates).
	*/
	public PixelVertex[] getNeighbours(){
		return null;
	}
	
	/* addNeighbour(newNeighbour)
	   Add the provided vertex as a neighbour of this vertex.
	*/
	public void addNeighbour(PixelVertex newNeighbour){
	}
	
	/* removeNeighbour(neighbour)
	   If the provided vertex object is a neighbour of this vertex,
	   remove it from the list of neighbours.
	*/
	public void removeNeighbour(PixelVertex neighbour){
	}
	
	/* getDegree()
	   Return the degree of this vertex. Since the graph is simple, 
	   the degree is equal to the number of distinct neighbours of this vertex.
	*/
	public int getDegree(){
		return -1;
	}
	
	/* isNeighbour(otherVertex)
	   Return true if the provided PixelVertex object is a neighbour of this
	   vertex and false otherwise.
	*/
	public boolean isNeighbour(PixelVertex otherVertex){
		return false;
	}
	
}