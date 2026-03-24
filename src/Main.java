import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
     try (Scanner teclado = new Scanner(System.in)) {
        ArbolInventario arbol=new ArbolInventario();
         int dato = 0;
            String opcion="";
         
           do {              
                 menu();
                 System.out.println("INGRESE UNA OPCION: ");
                 opcion=teclado.nextLine();
                   switch (opcion) {
                case "1":
                     OUTER:
                     while (true) {
                         System.out.println("***REGISTRO***\n");
                         System.out.println("INGRESE EL ID DEL PRODUCTO: ");
                            dato = teclado.nextInt();
                            teclado.nextLine();
                            System.out.println("INGRESE EL NOMBRE DEL PRODUCTO: ");
                            String nombre = teclado.nextLine();
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
                      System.out.println(arbol.inOrden());
                    break;

                    case "3":
                            System.out.println("***INGRESE EL DATO QUE DESEA BUSCAR***\n");
                            dato = teclado.nextInt();
                            teclado.nextLine();
                            if(arbol.buscar(dato)){
                                System.out.println("DATO ENCONTRADO");
                            }else{
                                System.out.println("DATO NO ENCONTRADO");
                            }
                            break;
                
                case "4":
                    System.out.println("***MOSTRAR POSTORDEN***\n");
                      arbol.postOrden();
                    break;
                case "5":
                   System.out.println("***MOSTRAR PREORDEN***\n");
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

