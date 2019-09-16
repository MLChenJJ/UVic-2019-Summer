/* A3Algorithms.java
   CSC 225 - Summer 2019


   B. Bird - 04/28/2019
   (Add your name/studentID/date here)
*/ 

import java.awt.Color;

public class A3Algorithms{

	/* FloodFillDFS(v, writer, fillColour)
	   Traverse the component the vertex v using DFS and set the colour 
	   of the pixels corresponding to all vertices encountered during the 
	   traversal to fillColour.
	   
	   To change the colour of a pixel at position (x,y) in the image to a 
	   colour c, use
			writer.setPixel(x,y,c);
	*/
	public static void FloodFillDFS(PixelVertex v, PixelWriter writer, Color fillColour){
		/* Your code here */
	}
	
	/* FloodFillBFS(v, writer, fillColour)
	   Traverse the component the vertex v using BFS and set the colour 
	   of the pixels corresponding to all vertices encountered during the 
	   traversal to fillColour.
	   
	   To change the colour of a pixel at position (x,y) in the image to a 
	   colour c, use
			writer.setPixel(x,y,c);
	*/
	public static void FloodFillBFS(PixelVertex v, PixelWriter writer, Color fillColour){
		/* Your code here */
	}
	
	/* OutlineRegionDFS(v, writer, outlineColour)
	   Traverse the component the vertex v using DFS and set the colour 
	   of the pixels corresponding to all vertices with degree less than 4
	   encountered during the traversal to outlineColour.
	   
	   To change the colour of a pixel at position (x,y) in the image to a 
	   colour c, use
			writer.setPixel(x,y,c);
	*/
	public static void OutlineRegionDFS(PixelVertex v, PixelWriter writer, Color outlineColour){
		/* Your code here */
	}
	
	/* OutlineRegionBFS(v, writer, outlineColour)
	   Traverse the component the vertex v using BFS and set the colour 
	   of the pixels corresponding to all vertices with degree less than 4
	   encountered during the traversal to outlineColour.
	   
	   To change the colour of a pixel at position (x,y) in the image to a 
	   colour c, use
			writer.setPixel(x,y,c);
	*/
	public static void OutlineRegionBFS(PixelVertex v, PixelWriter writer, Color outlineColour){
		/* Your code here */
	}

	/* CountComponents(G)
	   Count the number of connected components in the provided PixelGraph 
	   object.
	*/
	public static int CountComponents(PixelGraph G){
		/* Your code here */
		return 0;
	}
}