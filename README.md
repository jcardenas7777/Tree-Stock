Sistema de gestión de inventario implementado en Java utilizando un Árbol Binario de Búsqueda (BST) como estructura de datos principal. Permite insertar, buscar y recorrer productos de forma eficiente mediante los tres recorridos clásicos de árboles.

 Descripción
Este proyecto implementa un árbol binario de búsqueda donde cada nodo representa un Producto con un id numérico y un nombre. El árbol organiza los productos automáticamente: los IDs menores quedan a la izquierda y los mayores a la derecha, lo que permite búsquedas eficientes.

 Estructura del Proyecto
ArbolInventario/
├── Producto.java         # Nodo del árbol (dato + referencias izquierda/derecha)
├── ArbolInventario.java  # Lógica del BST (insertar, buscar, recorridos)
└── Main.java             # Menú interactivo por consola

 Clases
Producto.java
Representa cada nodo del árbol. Contiene:

int id — identificador único del producto (clave de ordenamiento)
String nombre — nombre del producto
Producto izquierda — referencia al hijo izquierdo
Producto derecho — referencia al hijo derecho

ArbolInventario.java
Contiene toda la lógica del árbol binario de búsqueda:
MétodoDescripcióninsertar(int id, String nombre)Inserta un nuevo producto respetando el orden BSTbuscar(int dato)Busca un producto por ID, retorna true si existeinOrden()Recorre el árbol Izquierda → Raíz → Derecha (orden ascendente)preOrden()Recorre el árbol Raíz → Izquierda → DerechapostOrden()Recorre el árbol Izquierda → Derecha → Raíz
Main.java
Interfaz de usuario por consola con menú interactivo.

 Menú del Programa
=====ARBOL BINARIO=====
1. INGRESAR DATO
2. BUSCAR DATO
3. INORDEN
4. POSTORDEN
5. PREORDEN
6. SALIR

 Cómo Ejecutar
Requisitos

Java JDK 8 o superior

Compilar
bashjavac Producto.java ArbolInventario.java Main.java
Ejecutar
bashjava Main

 Ejemplo de Uso
=====ARBOL BINARIO=====
INGRESE UNA OPCION: 1

***REGISTRO***
INGRESE EL ID DEL PRODUCTO: 50
INGRESE EL NOMBRE DEL PRODUCTO: Arroz
DESEA REGISTRAR OTRO DATO?
 1.SI 2.NO: 1

INGRESE EL ID DEL PRODUCTO: 30
INGRESE EL NOMBRE DEL PRODUCTO: Leche
DESEA REGISTRAR OTRO DATO?
 1.SI 2.NO: 1

INGRESE EL ID DEL PRODUCTO: 70
INGRESE EL NOMBRE DEL PRODUCTO: Aceite
DESEA REGISTRAR OTRO DATO?
 1.SI 2.NO: 2

INGRESE UNA OPCION: 3
***INORDEN***
30, 50, 70,
Árbol resultante del ejemplo:
        50 (Arroz)
       /          \
   30 (Leche)   70 (Aceite)

InOrden imprime: 30, 50, 70 → siempre en orden ascendente por ID.


 Conceptos Aplicados

Árbol Binario de Búsqueda (BST): estructura jerárquica donde cada nodo tiene máximo dos hijos y los valores menores van a la izquierda.
Recursividad: los tres recorridos (inOrden, preOrden, postOrden) se implementan con métodos recursivos privados.
Iteratividad: la inserción y búsqueda se implementan con ciclos while para mayor eficiencia en la pila de llamadas.
Sobrecarga de métodos: cada recorrido tiene una versión pública (sin parámetros) y una privada (recursiva) que recibe el nodo actual.


Autor
Jonatan Estiben Cárdenas Carasquilla
Estudiante — Ingenieria de Software y Datos
IUDIGITAL-ANTIOQUIA

https://drive.google.com/file/d/1SS_aHlMLKPq8DXktf7WmMCde861KK0ty/view?usp=sharing