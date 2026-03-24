public class Producto {
    Producto izquierda;
    Producto derecho;
    int id;
    String nombre;
    public Producto() {
        this.id=0;
        izquierda=null;
        derecho=null;
        this.nombre="";
    }
    
            

    public Producto(int id) {
        this.id=id;
        izquierda=null;
        derecho=null;
        this.nombre="";
    }

    public Producto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        izquierda =null;
        derecho =null;
    }

}
