public class ArbolInventario {
    Producto raiz;
    int tamaño;

    public ArbolInventario() {
       raiz = null;
       tamaño =0;
    }
    
    private String inOrden(Producto producto){
        if (producto!=null) {
               //1.recorrer el subarbol izquierdo
         return inOrden(producto.izquierda) + producto.id + " - " + producto.nombre + ", " + inOrden(producto.derecho);
              //2.procesar el dato
           
              //3. Recorrer el subarbol derecho
        }
        return "";
    }
      public String inOrden(){
          return inOrden(raiz);
    
    }
      
         private void preOrden(Producto producto){
        if (producto!=null) {
            //1.procesar el dato
             System.out.println(producto.id + " - " + producto.nombre);
               //2.recorrer el subarbol izquierdo
             preOrden(producto.izquierda);
              
           
              //3. Recorrer el subarbol derecho
             preOrden(producto.derecho);
            
          
        }
    }
      public void preOrden(){
          preOrden(raiz);
    
    }
           private void postOrden(Producto producto){
        if (producto!=null) {
            
               //1.recorrer el subarbol izquierdo
             postOrden(producto.izquierda);
              
           
              //2. Recorrer el subarbol derecho
             postOrden(producto.derecho);
            
          //3.procesar el dato
             System.out.println(producto.id + " - " + producto.nombre);
        }
    }
      public void postOrden(){
          postOrden(raiz);
    
    }
    
    
    public void insertar(int id, String nombre){
        if (raiz==null) {

            raiz=new Producto(id, nombre);
            tamaño++;
        }else{
            Producto aux= raiz;
            boolean bandera=true;
            while (bandera) {                
                if (id < aux.id) {
                    if (aux.izquierda!=null) {
                        aux=aux.izquierda;
                        
                    }else{
                      aux.izquierda=new Producto(id, nombre);
                      tamaño++;
                      bandera=false;
                    
                    }
                    
                    
                }else{
                if (aux.derecho!=null) {
                        aux=aux.derecho;
                        
                    }else{
                      aux.derecho=new Producto(id, nombre);
                      tamaño++;
                      bandera=false;
                    
                    }
                
                }
            }
                
         }
          
     }
    public boolean buscar(int dato){
        Producto aux=raiz;
        while (aux!=null) {  
            if (aux.id==dato) {
                return true;
            }else{
                if (dato<aux.id) {
                    aux=aux.izquierda;
                    
                }else{
                    aux=aux.derecho;
                
                
                }
            
            }
            
        
    
    }          
     return  false;
    }
}
