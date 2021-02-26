package WithFactoryMethod;


public class Main {
	public static void main(String[] args) {

		Canvas canvas = new Canvas ();
		String [] shapeNames  = {"ROUND SHAPE", "RECTANGLE", "SQUARE","PANTAGON" };
		
		for (String shapeName : shapeNames)
		   canvas.addShape(shapeName);

	}
}