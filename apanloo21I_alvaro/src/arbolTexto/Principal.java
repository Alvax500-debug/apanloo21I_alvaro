package arbolTexto;

public class Principal {

	/* public static void main(String[] args) {
	
		
		NodoAR b = NodoAR.inserEnArbol(2, null, null);
		NodoAR c = NodoAR.inserEnArbol(3, null, null);
		NodoAR a = NodoAR.inserEnArbol(1, b, c);
		
		
		b=null;
		c=null;
		
		System.out.println("Arbol a");
		System.out.println(a.dato);
		System.out.println(a.izq.dato);
		System.out.println(a.der.dato);
		
		
		
		NodoAR f = NodoAR.inserEnArbol(6, null, null);
		NodoAR e = NodoAR.inserEnArbol(5, null, f);
		NodoAR d = NodoAR.inserEnArbol(4, e, null);
		
		e=null;
		f=null;
		
		System.out.println("Arbol d");
		System.out.println(d.dato);
		System.out.println(d.izq.dato);
		System.out.println(d.izq.der.dato);
		
		NodoAR arbol1, arbol2, arbol3;
		
		arbol1=a;
		arbol2=d;
		
		System.out.println("arbol1");
		System.out.println(arbol1.dato);
		System.out.println(arbol1.izq.dato);
		System.out.println(arbol1.der.dato);
		
		System.out.println("arbol2");
		System.out.println(arbol2.dato);
		System.out.println(arbol2.izq.dato);
		System.out.println(arbol2.izq.der.dato);
		
		a.der.der = d;
		
		System.out.println("Arbol a de nuevo");
		System.out.println(a.dato);
		System.out.println(a.izq.dato);
		System.out.println(a.der.dato);
		System.out.println(a.der.der.dato);
		System.out.println(a.der.der.izq.dato);
		System.out.println(a.der.der.izq.der.dato);
		
		System.out.println("arbol1 de nuevo");
		System.out.println(arbol1.dato);
		System.out.println(arbol1.izq.dato);
		System.out.println(arbol1.der.dato);
		
		b = NodoAR.inserEnArbol(14, null, null);
		c = NodoAR.inserEnArbol(17, null, null);
		arbol3 = NodoAR.inserEnArbol(12, b, c);
		
		
		System.out.println("Conteo de Nodos");
		System.out.println(NodoAR.conteoNodos(0, arbol3));
		
		System.out.println("Altura del Arbol");
		System.out.println(NodoAR.determinarAltura(0, arbol3));
		
	} */
	
	public static void main(String[] args) {
		
		NodoAR arbol1, arbol2, arbol3;
		
		NodoAR a,b,c,d,e,f,g;
		
		f = NodoAR.inserEnArbol(7, null, null);
		e = NodoAR.inserEnArbol(6, null, null);
		d = NodoAR.inserEnArbol(5, null, null);
		c = NodoAR.inserEnArbol(4, null, null);
		
		b = NodoAR.inserEnArbol(3, e, f);
		a = NodoAR.inserEnArbol(2, c, d);
		
		arbol1 = NodoAR.inserEnArbol(1, a, b);
		
		f = null;
		e = null;
		d = null;
		c = null;
		
		b = null;
		a = null;
		
		System.out.println("arbol1");
		/*System.out.println(arbol1.dato);
		System.out.println(arbol1.izq.dato);
		System.out.println(arbol1.der.dato);
		System.out.println(arbol1.izq.izq.dato);
		System.out.println(arbol1.izq.der.dato);
		System.out.println(arbol1.der.izq.dato);
		System.out.println(arbol1.der.der.dato);*/
		
		System.out.println("Nodo Raiz");
		System.out.println(arbol1.dato);
		
		System.out.println("Conteo de Nodos");
		System.out.println(NodoAR.conteoNodos(0, arbol1));
		
		System.out.println("Altura del Arbol1");
		System.out.println(NodoAR.determinarAltura(0, arbol1));
		
		System.out.println("Arbol1 postorden");
		System.out.println(NodoAR.postorden("", arbol1));
		
		System.out.println("Arbol1 orden");
		System.out.println(NodoAR.orden("", arbol1));
		
		System.out.println("Arbol1 preorden");
		System.out.println(NodoAR.preorden("", arbol1));
		System.out.println();
		
		g = NodoAR.inserEnArbol(8, null, null);
		
		f = NodoAR.inserEnArbol(6, null, null);
		e = NodoAR.inserEnArbol(5, g, null);
		d = NodoAR.inserEnArbol(4, null, null);
		c = NodoAR.inserEnArbol(3, e, f);
		
		b = NodoAR.inserEnArbol(2, c, d);
		a = NodoAR.inserEnArbol(7, null, null);
		
		arbol2 = NodoAR.inserEnArbol(1, a, b);
		
		g = null;
		
		f = null;
		e = null;
		d = null;
		c = null;
		
		b = null;
		a = null;
		
		System.out.println("arbol2");
		/*System.out.println(arbol2.dato);
		System.out.println(arbol2.izq.dato);
		System.out.println(arbol2.der.dato);
		System.out.println(arbol2.der.izq.dato);
		System.out.println(arbol2.der.izq.dato);
		System.out.println(arbol2.der.der.dato);
		System.out.println(arbol2.der.izq.izq.dato);
		System.out.println(arbol2.der.izq.der.dato);
		System.out.println(arbol2.der.izq.izq.izq.dato);*/
		
		System.out.println("Nodo Raiz");
		System.out.println(arbol2.dato);
		
		System.out.println("Conteo de Nodos");
		System.out.println(NodoAR.conteoNodos(0, arbol2));
		
		System.out.println("Altura del Arbol2");
		System.out.println(NodoAR.determinarAltura(0, arbol2));
		
		System.out.println("Arbol2 postorden");
		System.out.println(NodoAR.postorden("", arbol2));

		System.out.println("Arbol2 orden");
		System.out.println(NodoAR.orden("", arbol2));
		
		System.out.println("Arbol2 preorden");
		System.out.println(NodoAR.preorden("", arbol2));
		System.out.println();

		g = NodoAR.inserEnArbol(8, null, null);
		
		f = NodoAR.inserEnArbol(7, g, null);
		e = NodoAR.inserEnArbol(6, null, f);
		d = NodoAR.inserEnArbol(5, e, null);
		c = NodoAR.inserEnArbol(4, null, d);
		
		b = NodoAR.inserEnArbol(3, null, null);
		a = NodoAR.inserEnArbol(2, c, b);
		
		arbol3 = NodoAR.inserEnArbol(1, a, null);
		
		g = null;
		
		f = null;
		e = null;
		d = null;
		c = null;
		
		b = null;
		a = null;
		
		System.out.println("arbol3");
		/*System.out.println(arbol3.dato);
		System.out.println(arbol3.izq.dato);
		System.out.println(arbol3.izq.izq.dato);
		System.out.println(arbol3.izq.der.dato);
		System.out.println(arbol3.izq.izq.der.dato);
		System.out.println(arbol3.izq.izq.der.izq.dato);
		System.out.println(arbol3.izq.izq.der.izq.der.dato);
		System.out.println(arbol3.izq.izq.der.izq.der.izq.dato);*/
		//System.out.println(arbol3.der.izq.izq.izq.dato);
		
		System.out.println("Nodo Raiz");
		System.out.println(arbol3.dato);
		
		System.out.println("Conteo de Nodos");
		System.out.println(NodoAR.conteoNodos(0, arbol3));
		
		System.out.println("Altura del Arbol3");
		System.out.println(NodoAR.determinarAltura(0, arbol3));
		
		System.out.println("Arbol3 postorden");
		System.out.println(NodoAR.postorden("", arbol3));

		System.out.println("Arbol3 orden");
		System.out.println(NodoAR.orden("", arbol3));
		
		System.out.println("Arbol3 preorden");
		System.out.println(NodoAR.preorden("", arbol3));
		
	}

}
