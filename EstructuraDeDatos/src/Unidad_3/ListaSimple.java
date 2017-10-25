package Unidad_3;

public class ListaSimple {

private Node_Simple cabeza;
	
	public ListaSimple() {
		this.cabeza=null;
	}

	public Node_Simple getCabeza() {
		return cabeza;
	}

	public void setCabeza(Node_Simple cabeza) {
		this.cabeza = cabeza;
	}

	public boolean isVacio() {
		boolean respuesta=true;
		if(this.cabeza!=null) {
			respuesta=false;
		}
		return respuesta;
	}

	public void insertar(int valor) {
		Node_Simple nuevo=new Node_Simple();
		nuevo.setDato(valor);
		nuevo.setSiguiente(null);
		this.cabeza=nuevo;
	}

	public void insertarPrincipio(int valor) {
		if(this.isVacio()) {
			this.insertar(valor);
		}else {
			Node_Simple nuevo=new Node_Simple();
			nuevo.setDato(valor);
			nuevo.setSiguiente(this.cabeza);
			this.cabeza=nuevo;		
		}
	}

	public void insertarFinal(int valor) {
		if(this.isVacio()) {
			this.insertar(valor);
		}else {
			Node_Simple nuevo=new Node_Simple();
			nuevo.setDato(valor);
			nuevo.setSiguiente(null);
			
			Node_Simple temporal=this.cabeza;
			while(temporal.getSiguiente()!=null) {
				temporal=temporal.getSiguiente();
			}
			temporal.setSiguiente(nuevo);
		}
	}
	public int contar() {
		int respuesta=0;
		Node_Simple temporal=this.cabeza;
		while(temporal!=null) {
			respuesta++;
			temporal=temporal.getSiguiente();
		}
		return respuesta;
	}
	public Node_Simple encontrar(int posicion) {
		Node_Simple temporal=this.cabeza;
		Node_Simple anterior=null;
		int i=0;
		while(i<posicion) {
			i++;
			anterior=temporal;
			temporal=temporal.getSiguiente();
		}
		return anterior;
	}
	public void insertarPosicion(int valor, int posicion) {
		if(posicion>0 && this.contar()>1 && posicion<=this.contar()) {
			if(posicion==1) {
				this.insertarPrincipio(valor);
			}else if(posicion==this.contar()) {
				this.insertarFinal(valor);
			}else {
				Node_Simple anterior=this.encontrar(posicion-1);
				Node_Simple nuevo=new Node_Simple();
				nuevo.setDato(valor);
				nuevo.setSiguiente(anterior.getSiguiente());
				anterior.setSiguiente(nuevo);
			}
			
		}
	}
	public boolean localizar(int valor) {
		boolean respuesta=false;
		
		Node_Simple temporal=this.cabeza;
		while(temporal!=null) {
			if(temporal.getDato()==valor) {
				respuesta=true;
			}
			temporal=temporal.getSiguiente();
		}
		
		return respuesta;
	}

	public void buscar(int valor) {
		boolean respuesta=false;
		
		Node_Simple temporal=this.cabeza;
		while(temporal!=null) {
			if(temporal.getDato()==valor) {
				respuesta=true;
				System.out.println("El valor encontrado es:"+temporal.getDato());
			}
			temporal=temporal.getSiguiente();
		}
		if(respuesta==false) {
			System.out.println("El valor no fue encontrado");
		}
		
	}

	public boolean eliminar(int posicion) {
		boolean respuesta=false;
		if(posicion==1) {
			this.setCabeza(this.cabeza.getSiguiente());
			respuesta=true;
		}else {
			Node_Simple temporal=this.encontrar(posicion-1);
			temporal.setSiguiente(temporal.getSiguiente().getSiguiente());
			respuesta=true;
		}
		return respuesta;
	}

	public StringBuilder imprimir() {
		StringBuilder cadena=new StringBuilder();
		cadena.append("Cabeza-->");
		Node_Simple temporal=this.cabeza;
		while(temporal!=null) {
			cadena.append(temporal.getDato());
			cadena.append("-->");
			temporal=temporal.getSiguiente();
		}
		cadena.append("NULL");
		return cadena;
	}


	
}


