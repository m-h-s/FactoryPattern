# Name
Factory Method


# Problem

* We have a Canvas on which different shapes can be drawn.
* The type of the shape that should be drawn on Canvas is identified at run-time.
* The type of shapes that can be drawn on the canvas will be added over the time.
* With adding each new shape the code inside Canvas should change to allow new shapes to be  created and drawn on canvas.


# Solution

* Pull out the creation of different shapes to a separate class called ShapeFactory. 
* Inside the Canvas Class call the ShapeFactory to create the expected shape.
* Now draw the shape. 
* Whenever a new shape needs to be added to the shape hierarchy only change the ShapeFactory class.