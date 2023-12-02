
package ListaDoble;

public class ListaDoble{

	Node topForward;
	Node topBackward;

	//Métodos para los casos de inserción de nodos
	public boolean insertaPrimerNodo(String dato){
		if (topForward == null) { //La lista está vacía
			topForward = new Node();
			topForward.name = dato;
			topForward.previous = null;
			topForward.next = null;
			
			topBackward = topForward;

			return true;
		}
		else {
			return false;
		}
	}
	
	public void imprimir(){
		System.out.print("[X]"); 

		for (Node temp = this.topForward; temp != null; temp = temp.next){
			System.out.print(" <- [ " + temp.name + " ] -> ");
		}

		System.out.print("[X]\n"); 
	}
	
	public String toString(){
		String cadAux = "[X]";
		for (Node temp = this.topForward; temp != null; temp = temp.next){
			cadAux += " <- [ " + temp.name + " ] -> ";
		}

		cadAux += "[X]\n"; 

		return cadAux;
	}

	public void insertaAntesPrimerNodo(String nombre){
		Node temp; 
		temp = new Node ();
		temp.name = nombre;
		temp.next = this.topForward;
		this.topForward.previous = temp;
		this.topForward = temp;
		temp = null;
	}

	public void insertaAlFinal(String nombre){
		Node temp = new Node ();
		temp.name = nombre;
		temp.next = null;
		
		temp.previous = this.topBackward;
		this.topBackward.next = temp;
		this.topBackward = temp;
		temp = null;
	}

	public boolean insertaEntreNodos(String nombre, String buscado){
		Node temp = new Node();
		temp.name = nombre;
		Node temp2 = this.topForward;

		//boolean NodoNoEncontrado = true;

		while ( (temp2 != null) 
				&& temp2.name.equals(buscado) == false ) {	
		         temp2 = temp2.next;
		}

		if (temp2 != null){  //Nodo buscado se encontró
			temp.next = temp2.next;
			temp2.next = temp;

			temp.previous = temp2;
			temp.next.previous = temp;

			temp = null;
			temp2 = null;
			
			return true;
		}
		else return false;
	} 
	
	//Métodos de borrado
	public void borrarPrimerNodo(){
		this.topForward = this.topForward.next;
		this.topForward.previous.next = null;
		this.topForward.previous = null;
	}

	public void borrarUltimoNodo(){
		this.topBackward = this.topBackward.previous;
		this.topBackward.next.previous = null;
		this.topBackward.next = null;
	}

	
	//Borrar cualquier nodo que no sea el primero
	public boolean borrarCualquierNodo(String buscado){
		Node temp = this.topForward;

		while ( (temp != null) 
				&& temp.name.equals(buscado) == false ) {	
		         temp = temp.next;
		}

		if (temp != null){  //Nodo buscado se encontró
			temp.next = temp.next.next;
			temp.next.previous.previous = null;
			temp.next.previous.next = null;
			temp.next.previous = temp;
			temp = null;
			
			return true;
		}
		else return false;
	}
            
            //Métodos para la tarea
            //Método para buscar un nodo por su posición
            public Node buscarPorPosicion(int posicion) {
                Node temp = topForward;
                int contador = 0;
                //recorrido de la lista 
                while (temp != null && contador < posicion) {
                    temp = temp.next;
                    contador++;
                }

                return temp;
            }
            //método para insertar un nuevo nodo antes del último
            public void insertarAntesUltimoNodo(String nombre) {
                if (topBackward == null) { // Lista vacía
                    insertaPrimerNodo(nombre);//insertamos el primer nodo
                } else {
                    Node temp = new Node();
                    temp.name = nombre;
                    //insertar el nuevo nodo antes del último
                    temp.next = topBackward;
                    temp.previous = topBackward.previous;

                    topBackward.previous.next = temp;
                    topBackward.previous = temp;
                }
            }
      
            //metodo para intercambiar un nodo por otro buscado
            public boolean intercambiarNodos(String nodoBuscado, String nuevoNombre) {
                Node temp = topForward;
                // se busca el nodo por su nombre
                while (temp != null && !temp.name.equals(nodoBuscado)) {
                    temp = temp.next;
                }

                if (temp != null) { // nodo encontrado
                    temp.name = nuevoNombre;
                    return true;
                } else {
                    return false; 
                }
            }


}













