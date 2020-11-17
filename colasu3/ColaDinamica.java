
package colasu3;

class ColaDinamica {
     NodoColas cima,fin;
     int tamanio;
     
     public boolean estaVacia(){
         return cima==null;
     }
     //Método Insertar
     public void Empujar(String elemento){
         NodoColas nodo=new NodoColas(elemento); 
         if(estaVacia()){
             cima =nodo;
         }else{
             fin.siguiente=nodo;
         }
         fin=nodo; 
         tamanio++; 
     }
     //Metodo eliminar
     public String SacarCola(){
         if(!estaVacia()){
         cima=cima.siguiente; 
         tamanio--;
         //return auxiliar;
         }else{
             System.out.println("No hay elementos que eliminar en la pila");
         }
         return null;
         
     }
     

     
     public void mostrarCola(){
         NodoColas recorre=cima;
         if(!estaVacia()){
         while(recorre!=null){
             System.out.print(recorre.elemento   );
             recorre=recorre.siguiente;
         }   
         }else{
             System.out.println("La cola esta vacia");
         }
     }
     
    
}
