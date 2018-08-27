package shapes.function;

import java.util.Scanner;

import shapes.model.Triangle;

public class TriangleFunctions {
	private Triangle[] triangles;
	private Triangle temp;
	public TriangleFunctions() {
		createArray();
	}
	public void createArray() {
		int count;
		System.out.println("Enter the count of triangles");
		Scanner input=new Scanner(System.in);
		count=input.nextInt();
		triangles=new Triangle[count];
		for (int i = 0; i < triangles.length; i++) {
			System.out.println("Enter sides of "+(i+1)+" triangle");
			int a=input.nextInt();
			int b=input.nextInt();
			int c=input.nextInt();
			triangles[i]=new Triangle(a, b, c);
		}
	}
	public void outArray() {
		for (int i = 0; i < triangles.length; i++) {
			System.out.println(triangles[i]);
		}
	}
	public Triangle getMaxTriangleByPerim() {
		int posMaxPerim=0;
		for (int i = 0; i < triangles.length; i++) {
			if (triangles[i].getPerim()>triangles[posMaxPerim].getPerim()) {
				posMaxPerim=i;
			}
		}
		return triangles[posMaxPerim];
	}
	public Triangle getMinTriangleByPerim() {
		int posMinPerim=0;
		for (int i = 0; i < triangles.length; i++) {
			if (triangles[i].getPerim()<triangles[posMinPerim].getPerim()) {
				posMinPerim=i;
			}
		}
		return triangles[posMinPerim];
	}
	public Triangle getMaxTriangleBySquare() {
		int posMaxSquare=0;
		for (int i = 0; i < triangles.length; i++) {
			if (triangles[i].getSquare()>triangles[posMaxSquare].getSquare()) {
				posMaxSquare=i;
			}
		}
		return triangles[posMaxSquare];
	}
	public Triangle getMinTriangleBySquare() {
		int posMinSquare=0;
		for (int i = 0; i < triangles.length; i++) {
			if (triangles[i].getSquare()<triangles[posMinSquare].getSquare()) {
				posMinSquare=i;
			}
		}
		return triangles[posMinSquare];
	}
	public double AverageSquare() {
		int averageSquare=0;
		for (int i = 0; i < triangles.length; i++) {
			averageSquare+=triangles[i].getSquare();
		}
		return averageSquare/triangles.length;
	}
	public double AveragePerim() {
		int averagePerim=0;
		for (int i = 0; i < triangles.length; i++) {
			averagePerim+=triangles[i].getPerim();
		}
		return averagePerim/triangles.length;
	}
	public void sortByPerimUp() {
		for (int border = 0; border < triangles.length-1; border++) {
			for (int i = 0; i < triangles.length-border-1; i++) {
				if (triangles[i].getPerim()>triangles[i+1].getPerim()) {
					temp=triangles[i];
					triangles[i]=triangles[i+1];
					triangles[i+1]=temp;
				}
			}
		}
	}
	public void sortByPerimDown() {
		for (int border = 0; border < triangles.length-1; border++) {
			for (int i = 0; i < triangles.length-border-1; i++) {
				if (triangles[i].getPerim()<triangles[i+1].getPerim()) {
					temp=triangles[i];
					triangles[i]=triangles[i+1];
					triangles[i+1]=temp;
				}
			}
		}
	}
	public void sortBySquareUp() {
		for (int border = 0; border < triangles.length-1; border++) {
			for (int i = 0; i < triangles.length-border-1; i++) {
				if (triangles[i].getSquare()>triangles[i+1].getSquare()) {
					temp=triangles[i];
					triangles[i]=triangles[i+1];
					triangles[i+1]=temp;
				}
			}
		}
	}
	public void sortBySquareDown() {
		for (int border = 0; border < triangles.length-1; border++) {
			for (int i = 0; i < triangles.length-border-1; i++) {
				if (triangles[i].getSquare()<triangles[i+1].getSquare()) {
					temp=triangles[i];
					triangles[i]=triangles[i+1];
					triangles[i+1]=temp;
				}
			}
		}
	}
}
