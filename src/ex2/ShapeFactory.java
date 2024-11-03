package ex2;

public class ShapeFactory {
	
	public Forme create_shape(String type) {
		switch(type) {
		case "Square":
		return new Square();
		case "Circle":
			return new Circle();
		case "Triangle":
			return new Triangle();
		case "Hexagon":
			return new Hexagon();
		default :
			throw new IllegalArgumentException("Type de forme non supporté : " + type);
		}
	}
}
