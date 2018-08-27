package shapes.main;

import shapes.function.CircleFunction;
import shapes.model.Circle;

public class CirclesMain {

	public static void main(String[] args) {
		CircleFunction circleFunc=new CircleFunction();
		System.out.println("Circle with max perim is "+circleFunc.getMaxCircleByPerim());
		System.out.println("Circle with min perim is "+circleFunc.getMinCircleByPerim());
		System.out.println("Circle with max square is "+circleFunc.getMaxCircleBySquare());
		System.out.println("Circle with min square is "+circleFunc.getMinCircleBySquare());
		System.out.println("Average perimetr of circles is "+circleFunc.AveragePerim());
		System.out.println("Average square of circles is "+circleFunc.AverageSquare());
		System.out.println("Source array before sorting : ");
		circleFunc.outArray();
		System.out.println("Array after UP sorting by perim is : ");
		circleFunc.sortByPerimUp();
		circleFunc.outArray();
		System.out.println("Array after DOWN sorting by perim is : ");
		circleFunc.sortByPerimDown();
		circleFunc.outArray();
		System.out.println("Array after UP sorting by square is : ");
		circleFunc.sortBySquareUp();
		circleFunc.outArray();
		System.out.println("Array after DOWN sorting by square is : ");
		circleFunc.sortBySquareDown();
		circleFunc.outArray();
		
	}

}
