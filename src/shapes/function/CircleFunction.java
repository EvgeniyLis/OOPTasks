package shapes.function;

import java.util.Scanner;

import shapes.model.Circle;
import shapes.model.Triangle;

public class CircleFunction {
	private Circle[] circles;
	private Circle temp;
	public CircleFunction(){
		createArray();
	}
	public void createArray() {
		int count;
		System.out.println("Enter the count of circles");
		Scanner input=new Scanner(System.in);
		count=input.nextInt();
		circles=new Circle[count];
		for (int i = 0; i < circles.length; i++) {
			System.out.println("Enter radius of "+(i+1)+" circle");
			int r=input.nextInt();
			circles[i]=new Circle(r);
		}
	}
	public void outArray() {
		for (int i = 0; i < circles.length; i++) {
			System.out.println(circles[i]);
		}
	}
	public Circle getMaxCircleByPerim() {
		int posMaxPerim=0;
		for (int i = 0; i < circles.length; i++) {
			if (circles[i].getPerim()>circles[posMaxPerim].getPerim()) {
				posMaxPerim=i;
			}
		}
		return circles[posMaxPerim];
	}
	public Circle getMinCircleByPerim() {
		int posMinPerim=0;
		for (int i = 0; i < circles.length; i++) {
			if (circles[i].getPerim()<circles[posMinPerim].getPerim()) {
				posMinPerim=i;
			}
		}
		return circles[posMinPerim];
	}
	public Circle getMaxCircleBySquare() {
		int posMaxSquare=0;
		for (int i = 0; i < circles.length; i++) {
			if (circles[i].getSquare()>circles[posMaxSquare].getSquare()) {
				posMaxSquare=i;
			}
		}
		return circles[posMaxSquare];
	}
	public Circle getMinCircleBySquare() {
		int posMinSquare=0;
		for (int i = 0; i < circles.length; i++) {
			if (circles[i].getSquare()<circles[posMinSquare].getSquare()) {
				posMinSquare=i;
			}
		}
		return circles[posMinSquare];
	}
	public double AverageSquare() {
		int averageSquare=0;
		for (int i = 0; i < circles.length; i++) {
			averageSquare+=circles[i].getSquare();
		}
		return averageSquare/circles.length;
	}
	public double AveragePerim() {
		int averagePerim=0;
		for (int i = 0; i < circles.length; i++) {
			averagePerim+=circles[i].getPerim();
		}
		return averagePerim/circles.length;
	}
	public void sortByPerimUp() {
		for (int border = 0; border < circles.length-1; border++) {
			for (int i = 0; i < circles.length-border-1; i++) {
				if (circles[i].getPerim()>circles[i+1].getPerim()) {
					temp=circles[i];
					circles[i]=circles[i+1];
					circles[i+1]=temp;
				}
			}
		}
	}
	public void sortByPerimDown() {
		for (int border = 0; border < circles.length-1; border++) {
			for (int i = 0; i < circles.length-border-1; i++) {
				if (circles[i].getPerim()<circles[i+1].getPerim()) {
					temp=circles[i];
					circles[i]=circles[i+1];
					circles[i+1]=temp;
				}
			}
		}
	}
	public void sortBySquareUp() {
		for (int border = 0; border < circles.length-1; border++) {
			for (int i = 0; i < circles.length-border-1; i++) {
				if (circles[i].getSquare()>circles[i+1].getSquare()) {
					temp=circles[i];
					circles[i]=circles[i+1];
					circles[i+1]=temp;
				}
			}
		}
	}
	public void sortBySquareDown() {
		for (int border = 0; border < circles.length-1; border++) {
			for (int i = 0; i < circles.length-border-1; i++) {
				if (circles[i].getSquare()<circles[i+1].getSquare()) {
					temp=circles[i];
					circles[i]=circles[i+1];
					circles[i+1]=temp;
				}
			}
		}
	}
}
