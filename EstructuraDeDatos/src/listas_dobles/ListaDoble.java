package listas_dobles;

import javax.swing.JOptionPane;

public class ListaDoble {
	private Nodo_Doble inicio,fin;
	public ListaDoble(){
		inicio=fin=null;
	}
	public boolean estVacia(){
		return inicio==null;
	}
	public void agragarFinal(int el,String gene,String al, String ar){
		if(!estVacia()){
		 fin=new Nodo_Doble(el,gene,al,ar, null, fin);
		 fin.anterior.siguiente=fin;
	    } else{
		 inicio=fin=new Nodo_Doble(el,gene,al,ar);
	    }	
		}
	public void agragarInicio(int el,String gene,String al, String ar){
		if(!estVacia()){
		 inicio=new Nodo_Doble(el,gene,al,ar, inicio, null);
		 inicio.siguiente.anterior=inicio;
	    } else{
		 inicio=fin=new Nodo_Doble(el,gene,al,ar);
	    }	
		}
	public void mostrarInicioFin(){
		if(!estVacia()){
			String id="=>";
			Nodo_Doble auxiliar=inicio;
			while(auxiliar!=null){
				id = id+"["+auxiliar.id+"--"+auxiliar.Genero+"--"+auxiliar.Albun+"--"+auxiliar.Artista+"]=>";
				auxiliar=auxiliar.siguiente;
			}
			JOptionPane.showMessageDialog(null,id,"Lista de inicio a fin",JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	}
	public void mostrarFinInicio(){
		if(!estVacia()){
			String id="<=>";
			Nodo_Doble auxiliar=fin;
			while(auxiliar!=null){
				id = id+"["+auxiliar.id+"--"+auxiliar.Genero+"--"+auxiliar.Albun+"--"+auxiliar.Artista+"]=>";
				auxiliar=auxiliar.anterior;
			}
			JOptionPane.showMessageDialog(null,id,"Lista de inicio a fin",JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	}
	
	public int eliminarInicio(){
		int elemento=inicio.id,Genero,Albun,Artista;
		if(inicio==fin){
			inicio=fin=null;
		}else{
			inicio=inicio.siguiente;
			inicio.anterior=null;
		}
		return elemento;
	}
 public int eliminarFinal(){
	 int elemento=fin.id,Genero,Albun,Artista;
		if(inicio==fin){
			inicio=fin=null;
		}else{
			fin=fin.siguiente;
			fin.siguiente=null;
		}
		return elemento;
	}
}
