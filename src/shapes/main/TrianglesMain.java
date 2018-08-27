package shapes.main;

import java.util.Scanner;

import shapes.function.TriangleFunctions;
import shapes.model.Triangle;

public class TrianglesMain {

	public static void main(String[] args) {
		TriangleFunctions triangleFunc=new TriangleFunctions();
		System.out.println("Tringle with max perim "+triangleFunc.getMaxTriangleByPerim());
		System.out.println("Triangle with minim perim "+triangleFunc.getMinTriangleByPerim());
		System.out.println("Triangle with max square "+triangleFunc.getMaxTriangleBySquare());
		System.out.println("Triangle with minim square "+triangleFunc.getMinTriangleBySquare());
		System.out.println("Average perimetr of triangles is "+triangleFunc.AveragePerim());
		System.out.println("Average square of triangles is "+triangleFunc.AverageSquare());
		System.out.println("Source array before sorting : ");
		triangleFunc.outArray();
		System.out.println("Array after UP sorting by perim is : ");
		triangleFunc.sortByPerimUp(); 
		triangleFunc.outArray();
		System.out.println("Array after DOWN sorting by perim is : ");
		triangleFunc.sortByPerimDown();
		triangleFunc.outArray();
		System.out.println("Array after UP sorting by square is : ");
		triangleFunc.sortBySquareUp();
		triangleFunc.outArray();
		System.out.println("Array after DOWN sorting by square is : ");
		triangleFunc.sortBySquareDown();
		triangleFunc.outArray();
	}

}
