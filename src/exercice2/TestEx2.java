package exercice2;

public class TestEx2 {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Forme forme;
		
		System.out.println("---- Creation and drawing of square ----");
		forme = shapeFactory.create_shape("Square");
		forme.draw();
		
		System.out.println("---- Creation and drawing of circle ----");
		forme = shapeFactory.create_shape("Circle");
		forme.draw();
		
		System.out.println("---- Creation and drawing of triangle ----");
		forme = shapeFactory.create_shape("Triangle");
		forme.draw();
		
		System.out.println("---- Creation and drawing of hexagon ----");
		forme = shapeFactory.create_shape("Hexagon");
		forme.draw();

	}

}
