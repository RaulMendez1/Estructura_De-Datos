package listas_dobles;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args){
		ListaDoble lista=new ListaDoble();
		int opcion=0,elemento;
		String gen,alb,art;
		do{
			try{
				opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
				"1. Agregar un nodo al inicio \n"
				 +"2. Agregarun nodo al final \n"
				 +"3. Mostrar la ista de inicio a fin \n"
				 +"4. Mostrar la lista de fin a inicio \n"
				 +"5. Eliminar Datos de inicio \n"
				 +"6. Eliminar datos del fin \n"
				 +"7. Salir\n"
				 +"Que deceas hacer","Menu de opciones",JOptionPane.INFORMATION_MESSAGE));
				
				switch(opcion){
				case 1:
					elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
							"id","Datos al inicio",JOptionPane.INFORMATION_MESSAGE));
					gen=JOptionPane.showInputDialog (null, 
							"Genero: ", "Datos al inicio",JOptionPane.INFORMATION_MESSAGE);
					alb=JOptionPane.showInputDialog (null, 
							"Albun: ", "Datos al inicio",JOptionPane.INFORMATION_MESSAGE);
					art=JOptionPane.showInputDialog (null, 
							"Artista: ", "Datos al inicio",JOptionPane.INFORMATION_MESSAGE);
					lista.agragarInicio(elemento, gen, alb, art);
					break;
				case 2:
					elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
							"id","Datos al final",JOptionPane.INFORMATION_MESSAGE));
					gen=JOptionPane.showInputDialog (null, 
							"Genero: ", "Datos al final",JOptionPane.INFORMATION_MESSAGE);
					alb=JOptionPane.showInputDialog (null, 
							"Albun: ", "Datos al final",JOptionPane.INFORMATION_MESSAGE);
					art=JOptionPane.showInputDialog (null, 
							"Artista: ", "Datos al final",JOptionPane.INFORMATION_MESSAGE);
					lista.agragarFinal(elemento, gen, alb, art);
					break;
				case 3:
					if(!lista.estVacia()){
						lista.mostrarInicioFin();
					}else{
						JOptionPane.showMessageDialog(null,"Aplicacion Finalizada",
								"Lista vacia",JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 4:
					if(!lista.estVacia()){
						lista.mostrarFinInicio();
					}else{
						JOptionPane.showMessageDialog(null,"Aplicacion Finalizada",
								"Lista vacia",JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 5:
					if(!lista.estVacia()){
						elemento=lista.eliminarInicio();
						JOptionPane.showMessageDialog(null,"El id de los datos eliminados es: "+elemento,"Eliminar datos inicio", JOptionPane.INFORMATION_MESSAGE);
					}else{
						JOptionPane.showMessageDialog(null,"No hay datos aun",
								"Lista vacia",JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 6:
					if(!lista.estVacia()){
						elemento=lista.eliminarFinal();
						JOptionPane.showMessageDialog(null,"El id de los datos eliminados es: "+elemento,"Eliminar datos final", JOptionPane.INFORMATION_MESSAGE);
					}else{
						JOptionPane.showMessageDialog(null,"No hay datos aun",
								"Lista vacia",JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 7:
					JOptionPane.showMessageDialog(null,"Aplicacion Finalizada",
							"Fin",JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null,"Elige una opcion correcta",
							"Error",JOptionPane.INFORMATION_MESSAGE);
				}
			}catch(NumberFormatException n){
			JOptionPane.showMessageDialog(null,"Error"+ n.getMessage());
			}
		}while(opcion!=7);
	}

	
}
