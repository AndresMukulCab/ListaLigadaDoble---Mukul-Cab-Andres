package ListaDoble;

public class UsaListaDoble{
	
	public static void main(String[] args){
		ListaDoble lista = new ListaDoble();
		lista.insertaPrimerNodo("R");
		lista.imprimir();
		lista.insertaPrimerNodo("F");
		lista.imprimir();
		System.out.println(lista);
		lista.insertaAntesPrimerNodo("H");
		System.out.println(lista);
		lista.insertaAlFinal("Z");
		System.out.println(lista);
		lista.insertaEntreNodos("T", "R");
		System.out.println(lista);
		lista.insertaAntesPrimerNodo("K");
		System.out.println(lista);
		lista.insertaAlFinal("Ñ");
		System.out.println(lista);
		lista.borrarPrimerNodo();
		System.out.println(lista);
		lista.borrarUltimoNodo();
		System.out.println(lista);
		lista.borrarCualquierNodo("R");
		System.out.println(lista);
                
                
                 // método para buscar un nodo por posición
                int posicionABuscar = 2; // la posicion buscada en este caso es la "2"
                Node nodoEnPosicion = lista.buscarPorPosicion(posicionABuscar);

                if (nodoEnPosicion != null) {
                    System.out.println("Nodo en la posición " + posicionABuscar + ": " + nodoEnPosicion.name);
                } else {
                    System.out.println("La posición " + posicionABuscar + " no existe en la lista.");
                }
                
                // se insertar antes del último nodo el nuevo en este caso "W"
                String nuevoNombreAntesUltimo = "W";
                lista.insertarAntesUltimoNodo(nuevoNombreAntesUltimo);

                System.out.println("Lista después de insertar un nodo antes del último nodo:");
                System.out.println(lista);
                
                
                // intercambio de un nodo por otro buscado
                String nodoBuscado = "H"; // nodo buscado "H"
                String nuevoNombre = "K"; // nuevo nodo
                boolean exitoIntercambio = lista.intercambiarNodos(nodoBuscado, nuevoNombre);

                if (exitoIntercambio) {
                    System.out.println("Nodo con nombre " + nodoBuscado + " intercambiado.");
                } else {
                    System.out.println("Nodo con nombre " + nodoBuscado + " no encontrado en la lista.");
                }

                System.out.println("Lista después del intercambio (o no intercambio):");
                System.out.println(lista);
	}
        
        
}
























