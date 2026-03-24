public class ArbolInventario {
    Producto raiz;
    int tamaño;

    public ArbolInventario() {
        //INICIALIZAR EL ARBOL
       raiz = null;
       tamaño =0;
    }
    
    private String inOrden(Producto producto){
        //verificar que el producto no sea nulo
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
        //VERIFICAR SI EL ARBOL ESTA VACIO
        if (raiz==null) {
//CREAR EL NUEVO NODO Y ASIGNARLO COMO RAIZ
            raiz=new Producto(id, nombre);
            tamaño++;
        }else{
            //CREAR EL NUEVO NODO
            Producto aux= raiz;
            boolean bandera=true;
            while (bandera) {   
                //VERIFICAR SI EL ID ES MENOR O MAYOR QUE EL ID DEL NODO ACTUAL             
                if (id < aux.id) {
                    if (aux.izquierda!=null) {
                        aux=aux.izquierda;
                        //SI EL NODO IZQUIERDO NO ES NULO, MOVERSE A ESE NODO
                    }else{
                      aux.izquierda=new Producto(id, nombre);
                      tamaño++;
                      bandera=false;
                    
                    }
                    
                    //SI EL NODO IZQUIERDO ES NULO, INSERTAR EL NUEVO NODO A LA IZQUIERDA DEL NODO ACTUAL Y TERMINAR EL PROCESO 
                }else{
                if (aux.derecho!=null) {
                    //SI EL NODO DERECHO NO ES NULO, MOVERSE A ESE NODO
                        aux=aux.derecho;
                        
                    }else{
                        //SI EL NODO DERECHO ES NULO, INSERTAR EL NUEVO NODO A LA DERECHA DEL NODO ACTUAL Y TERMINAR EL PROCESO
                      aux.derecho=new Producto(id, nombre);
                      tamaño++;
                      bandera=false;
                    
                    }
                
                }
            }
                
         }
          
     }
    public boolean buscar(int dato){
        //CREAR UN NODO AUXILIAR PARA RECORRER EL ARBOL
        Producto aux=raiz;
        //RECORRER EL ARBOL HASTA ENCONTRAR EL DATO O LLEGAR A UN NODO NULO
        while (aux!=null) {  
            //VERIFICAR SI EL DATO ES IGUAL AL ID DEL NODO ACTUAL       
            if (aux.id==dato) {
                //SI EL DATO ES IGUAL AL ID DEL NODO ACTUAL, RETORNAR TRUE
                return true;
            }else{
                //SI EL DATO ES MENOR QUE EL ID DEL NODO ACTUAL, MOVERSE AL NODO IZQUIERDO, SI EL DATO ES MAYOR QUE EL ID DEL NODO ACTUAL, MOVERSE AL NODO DERECHO
                if (dato<aux.id) {
                    //SI EL DATO ES MENOR QUE EL ID DEL NODO ACTUAL, MOVERSE AL NODO IZQUIERDO
                    aux=aux.izquierda;
                    
                }else{
                    //SI EL DATO ES MAYOR QUE EL ID DEL NODO ACTUAL, MOVERSE AL NODO DERECHO
                    aux=aux.derecho;
                
                
                }
            
            }
            
        
    
    }          //SI SE LLEGA A UN NODO NULO, SIGNIFICA QUE EL DATO NO SE ENCONTRO EN EL ARBOL, RETORNAR FALSE
     return  false;
    }
}
