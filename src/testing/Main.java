package testing;

public class Main {	
 public static void main(String[] args){
	Figure square = new Figure();
	square.setFigure("Square", "red");
	Draw s = new Square();
	s.Print(square.getName(), square.getColor());
	
	Draw c = new Circle();
Figure circle =new Figure();
circle.setFigure("Circle", "green");
	c.Print(circle.getName(), circle.getColor());
 }

}
