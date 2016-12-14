package testing;

public class Circle extends Figure implements Draw {
	
	private int r = 7;
	private final double pi = 3.14;
	
	public void Print(String name, String color){
			
	System.out.print(name+" "+color+" �������, ����� ����� "+r+"(�) ");
	calculation();
	}
	
	private void calculation(){
		 double p=2*pi*r;
		 double a=pi*(r*r);
		 System.out.println("�� ��������� "+p+"(�) � �����  ���� " + a + "(m2)");	
	}

}
