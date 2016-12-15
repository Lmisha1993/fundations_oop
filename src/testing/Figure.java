package testing;

public abstract class Figure implements Draw  {
private String name;
private String color ;

public void setFigure (String name, String color){
	this.name = name;
	this.color = color;
	}
public String getName() {
    return name;
}
public String getColor() {
    return color;
}
public void setName(String name){
    this.name= name;
    }
public void setColor(String color){
    this.color= color;
    }

}
