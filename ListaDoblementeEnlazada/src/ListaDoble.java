
public class ListaDoble {
	protected Nodo cabeza;
    protected Nodo cola;
	protected int tamaño;
	
	
	public ListaDoble(){
		cabeza=null;
		cola=null;
		tamaño=0;
	}
	
	
	public boolean estaVacia(){
		
		if (cabeza==null){
			return true;
		}else{
			return false;
		}
	}
		
	public void insertarAlPrincipio(String name){
		if (estaVacia()){
			cabeza= new Nodo(name);
			cola= cabeza;
			tamaño+=1;
		}else{
			Nodo p=new Nodo(name,cabeza,null);
			cabeza.setAnte(p);
			cabeza=p;
			tamaño+=1;
}}
	 public void insertarAlFinal(String name){
		 if (estaVacia()){
			 cola=new Nodo(name);
			 cabeza=cola;
			 tamaño+=1;
		 }else{
			 Nodo q= new Nodo(name,null,cola);
			 cola.setSig(q);
			 cola=q;
			 tamaño+=1;
	
		 }}
	
		 
	public Nodo buscarNodo(String dato){
		Nodo bus= cabeza;
		
			for(bus=cabeza;bus!=null;bus=bus.getSig()){
				if (dato.compareToIgnoreCase(bus.getDato())==0){
				return bus;	
				}}
			return null;
			
		}
	
	
			
	
	public  Nodo buscarNodo(int num){
	if (num<0 || num>tamaño){
			return null;
	}else{
		Nodo aux=cabeza;
	
	for (int i=1;(i<num)&&(aux!=null);i++)
		{   
			aux=aux.getSig();
			
			}
	return aux;
	}}
	
	
		
		public void eliminarNodo(String elim){
			
			
			Nodo aux=buscarNodo(elim);
			if(aux==null){
				
			}else{
			Nodo au1=aux.getAnte();
			Nodo au2=aux.getSig();
			
			if (au1==null){
				cabeza=cabeza.getSig();
				
				
			}else if(au2==null){
				cola=cola.getAnte();
			}
			else{
			au1.setSig(au2);
			au2.setAnte(au1);
			tamaño-=1;}}
			
		}

			 
			 
		 
		 
		 
		 
	 


	@Override
	public String toString() {
		String salida="";
		if(estaVacia()){
			salida="La lista esta vacia";
		}else{
		salida= "LISTA:\n*********************\n";
		Nodo n= cabeza;
		while(n !=null){
			salida+=n.getDato()+"\n";
			n=n.getSig();
		}}
		return salida+"\ntamaño= "+tamaño;
			
		}
			
	}
	
	

