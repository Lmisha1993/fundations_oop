package testing;

public class Circle extends Figure {
	
	private int r = 7;
	private final double pi = 3.14;
	
	@Override
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
