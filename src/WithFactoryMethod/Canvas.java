package WithFactoryMethod;
import Shapes.*;

public class Canvas {

	private ShapeFactory factory;

	
	
	public Canvas ()
	{
		this.factory = new ShapeFactory ();
	}

	
	
	public void addShape (String shapeName)
	{
		Shape shape;
		shape = this.factory.getShape(shapeName);
		if (shape != null)
		   shape.draw();
	}

}
