package testing;

public class Square extends Figure  implements Draw {
	private int a = 7;
	   
	public void Print(String name, String color){
		System.out.print(name + " "+color + " кольру з стороно "+a+"(м) ");
		calculation();	
	}
	
	private void calculation(){
		 double p=a*4;
		 double area=a*a;
		 System.out.println("має периметер "+p+"(м) а площа  рівна " + area + "(m2)");	
	}
}
