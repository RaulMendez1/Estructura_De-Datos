 package listas_dobles;

public class Nodo_Doble {
public int id;
public String Genero;
public String Albun;
public String Artista;
Nodo_Doble siguiente,anterior;

public Nodo_Doble(int el,String gene,String al, String ar){
	this(el,gene,al,ar,null,null);
}

public Nodo_Doble(int el,String gene,String al, String ar, Nodo_Doble s, Nodo_Doble a){
	id=el;
	Genero=gene;
	Albun=al;
	Artista=ar;
	siguiente=s;
	anterior=a;
}

}
