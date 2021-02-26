package WithFactoryMethod;
import java.util.*;

import Shapes.Circle;
import Shapes.Oval;
import Shapes.Rectangle;
import Shapes.Shape;
import Shapes.Square;
public class ShapeFactory {

	//use getShape method to get object of type shape
	public Shape getShape(String shapeType) {

		if(shapeType == null){
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		} 
		
		else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		} 
		
		else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		} 
		
		else if(shapeType.equalsIgnoreCase("ROUND SHAPE")){
			return new Oval();
		}
		
		else
			
			{ 
			  System.out.println ("A " + shapeType.toLowerCase() + " is an undefined shape for this program.");
			  return null;
			}
	}
}