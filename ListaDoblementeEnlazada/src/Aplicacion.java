
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDoble a= new ListaDoble();
		System.out.println(a.toString());
		a.insertarAlPrincipio("Miguel");
		a.insertarAlPrincipio("Mig");
		a.insertarAlFinal("Juan");
		a.insertarAlFinal("Pedro");
System.out.println("\n"+a.toString());

String bus="Mike";
int busq=3;

if(a.buscarNodo(bus)==null){
	System.out.println("\nNo existe el elemento "+bus+" en la lista");
	}else{
		System.out.println("\nSe encontro el elemeto "+bus+" en la lista"+a.buscarNodo(bus).getDato());		
}

if(a.buscarNodo(busq)==null){
	System.out.println("\nNo existe la posicion "+busq+" en la lista");
	}else{
		System.out.println("\nSe encontro la posicion "+busq+" en la lista:\n"+a.buscarNodo(busq).getAnte().getDato()+" "+a.buscarNodo(busq).getDato()+" "+a.buscarNodo(busq).getSig().getDato());
		
		
}
String eliminar="Pedro";
a.eliminarNodo(eliminar);

System.out.println("\nSe elimino el elemento "+eliminar+" de la lista\n"+"la nueva lista es\n"+a);


	}

}
