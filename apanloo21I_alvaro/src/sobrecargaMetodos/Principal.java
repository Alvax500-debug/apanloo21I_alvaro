package sobrecargaMetodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadDemo ovrdemo = new OverloadDemo();
		
		int i = 17;
		
		ovrdemo.test();
		
		ovrdemo.test(4, 7);
		
		ovrdemo.test(4.7);
		
		ovrdemo.test(i);

	}
	
	/*
	 * Contestando preguntas punto 4:
	 * a) No marca ningun error durante la compilacion o la ejecucion
	 * b) Se ejecuta el metodo sobrecargado que recibe un double como parametro
	 * c) Marca error de compilacion, el tipo double no es permitido para un parametro esperado como int
	 * d) No hay diferencia con la sobre carga de constructores, ya que estos utilizan las misma logica de tipos admitidos
	 * */

}
