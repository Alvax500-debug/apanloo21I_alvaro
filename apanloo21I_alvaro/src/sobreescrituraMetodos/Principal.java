package sobreescrituraMetodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B subOb = new B(5, 7, 4);
		
		subOb.show(); //show de B sobrescribe al show de A
		
		A supOb;
		supOb = new A(5,6);
		supOb.show(); //al de A… no es sobrescritura
		
		//subOb.super.show(); //No lo Permite

	}

}
