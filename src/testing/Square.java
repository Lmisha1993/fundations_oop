package testing;

public class Square extends Figure  implements Draw {
	private int a = 7;
	   
	public void Print(String name, String color){
		System.out.print(name + " "+color + " ������ � ������� "+a+"(�) ");
		calculation();	
	}
	
	private void calculation(){
		 double p=a*4;
		 double area=a*a;
		 System.out.println("�� ��������� "+p+"(�) � �����  ���� " + area + "(m2)");	
	}
}
