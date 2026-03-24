import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
     try (Scanner teclado = new Scanner(System.in)) {
        //CREAR EL ARBOL
        ArbolInventario arbol=new ArbolInventario();
         int dato = 0;
         //VARIABLE PARA GUARDAR LA OPCION DEL USUARIO
            String opcion="";
         
           do {              
                 menu();// mostrar el menu
                 System.out.println("INGRESE UNA OPCION: ");
                 //LEER LA OPCION DEL USUARIO
                 opcion=teclado.nextLine();
                   switch (opcion) {
                case "1":
                     OUTER:
                     while (true) {
                         System.out.println("***REGISTRO***\n");
                         System.out.println("INGRESE EL ID DEL PRODUCTO: ");
                         //LEER EL DATO DEL USUARIO
                            dato = teclado.nextInt();
                            //LIMPIAR EL BUFFER
                            teclado.nextLine();
                           
                            System.out.println("INGRESE EL NOMBRE DEL PRODUCTO: ");
                            //LEER EL NOMBRE DEL PRODUCTO
                            String nombre = teclado.nextLine();
                            //INSERTAR EL DATO EN EL ARBOL
                            arbol.insertar(dato, nombre);
                            
                           System.out.println("DESEA REGISTRAR OTRO DATO? \n 1.SI 2.NO");
                         opcion=teclado.nextLine();
                         switch (opcion) {
                             case "1":
                                 break;
                             case "2":
                                 break OUTER;
                             default:
                               
                                 break;
                         }
                     }
                    
                    break;
                    case "2":
                      System.out.println("***MOSTRAR INVENTARIO (INORDEN)***\n");
                      //MOSTRAR EL INVENTARIO EN INORDEN
                      System.out.println(arbol.inOrden());
                    break;

                    case "3":
                            System.out.println("***INGRESE EL DATO QUE DESEA BUSCAR***\n");
                            //LEER EL DATO DEL USUARIO
                            dato = teclado.nextInt();
                            teclado.nextLine();
                            //BUSCAR EL DATO EN EL ARBOL
                            if(arbol.buscar(dato)){
                                System.out.println("DATO ENCONTRADO");
                            }else{
                                System.out.println("DATO NO ENCONTRADO");
                            }
                            break;
                
                case "4":
                    System.out.println("***MOSTRAR POSTORDEN***\n");
                    //MOSTRAR EL INVENTARIO EN POSTORDEN
                      arbol.postOrden();
                    break;
                case "5":
                   System.out.println("***MOSTRAR PREORDEN***\n");
                   //MOSTRAR EL INVENTARIO EN PREORDEN
                      arbol.preOrden();
                      break;
                case "6":
                    break;
                default:
                    System.out.println("OPCION NO VALIDA, INTENTE DE NUEVO");;
            }
              } while (!opcion.equals("6"));
     }
     System.out.println("PROGRAMA TERMINADO...");
       
    }
    //METODO PARA MOSTRAR EL MENU
  public static void menu(){
      System.out.println("=====ARBOL BINARIO=====");
      System.out.println("1.INGRESAR DATO");
      System.out.println("2.MOSTRAR INVENTARIO (INORDEN)");
      System.out.println("3.BUSCAR PRODUCTO");
      System.out.println("4.MOSTRAR POSTORDEN");
      System.out.println("5.MOSTRAR PREORDEN");
      System.out.println("6.SALIR");
      
  }
    }

