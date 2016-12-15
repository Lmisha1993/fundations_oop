package testing;

public class Main {	
 public static void main(String[] args){
	
	Figure square = new Square();
	Figure circle = new Circle(); 
	circle.setFigure("Circle", "green");
	square.setFigure("Square", "red");
	square.Print(square.getName(), square.getColor()); 
	circle.Print(circle.getName(), circle.getColor());
	
 }

}
