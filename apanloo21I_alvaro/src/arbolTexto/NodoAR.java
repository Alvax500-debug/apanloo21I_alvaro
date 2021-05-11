package arbolTexto;

public class NodoAR {

	int dato;
	NodoAR izq;
	NodoAR der;
	
	
	NodoAR()
	{}
	
	//Metodo que agrega NODOS al Arbol
	static NodoAR inserEnArbol(int dato, NodoAR izq, NodoAR der)
	{
		NodoAR aux = new NodoAR();
		aux.dato=dato;
		aux.izq=izq;
		aux.der=der;
	    return aux;	
	}//fin del metodo insertaEnArbol
	
	//Metodo para obtener el nodo Raiz (raiz global)?
	
	//Metodo para obtener el numero de nodos - Recursividad?
	public static int conteoNodos(int contador, NodoAR raiz) {
		
		contador++;
		
		if (raiz.izq != null) {
			contador = conteoNodos(contador, raiz.izq);
			
		}
		if (raiz.der != null) {
			contador = conteoNodos(contador, raiz.der);
			
		}
		return contador;
	}
	
	//Metodo para obtener altura del Arbol - Recursividad?
	public static int determinarAltura(int contador, NodoAR raiz) {
		if (raiz.izq != null && raiz.der != null) {
			contador++;
			if (raiz.izq.izq != null || raiz.izq.der != null) {
				
				contador = determinarAltura(contador, raiz.izq);
			} else {
				if (raiz.der.izq != null || raiz.der.der != null) {
					
					contador = determinarAltura(contador, raiz.der);
				} else {
					//contador += 0;
				}
				
			}
		} else {
			if (raiz.izq != null) {
				contador++;
				contador = determinarAltura(contador, raiz.izq);
			} else {
				if (raiz.der != null) {
					contador++;
					contador = determinarAltura(contador, raiz.der);
				} else {
					//contador += 0;
				}
				
			}
		}
		
		return contador;
	}
	
	//Metodo(s) para recorrer el arbol
	
	//Metodo POSTORDERN
	public static String postorden(String valorNodo, NodoAR raiz) {
		//String valorNodo = "";
		
		if (raiz.izq != null) {
			valorNodo = postorden(valorNodo, raiz.izq);
			
		} /*else {
			valorNodo = valorNodo.concat(String.valueOf(raiz.dato));
		}*/
		
		if (raiz.der != null) {
			valorNodo = postorden(valorNodo, raiz.der);
			
		} /*else {
			valorNodo = valorNodo.concat(String.valueOf(raiz.dato));
		}*/
		
		valorNodo = valorNodo.concat(String.valueOf(raiz.dato));
		
		return valorNodo;
	}
	
	//Metodo ORDERN
	public static String orden(String valorNodo, NodoAR raiz) {
		//String valorNodo = "";
		
		if (raiz.izq != null) {
			valorNodo = orden(valorNodo, raiz.izq);
			
		} /*else {
			valorNodo = valorNodo.concat(String.valueOf(raiz.dato));
		}*/
		
		valorNodo = valorNodo.concat(String.valueOf(raiz.dato));
		
		if (raiz.der != null) {
			valorNodo = orden(valorNodo, raiz.der);
			
		} /*else {
			valorNodo = valorNodo.concat(String.valueOf(raiz.dato));
		}*/
		
		return valorNodo;
	}
	
	//Metodo PREORDERN
		public static String preorden(String valorNodo, NodoAR raiz) {
			//String valorNodo = "";
			
			valorNodo = valorNodo.concat(String.valueOf(raiz.dato));
			
			if (raiz.izq != null) {
				valorNodo = preorden(valorNodo, raiz.izq);
				
			} /*else {
				valorNodo = valorNodo.concat(String.valueOf(raiz.dato));
			}*/
			
			if (raiz.der != null) {
				valorNodo = preorden(valorNodo, raiz.der);
				
			} /*else {
				valorNodo = valorNodo.concat(String.valueOf(raiz.dato));
			}*/
			
			return valorNodo;
		}
	
}//fin de la clase NodoAR
