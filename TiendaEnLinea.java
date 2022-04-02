/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/************************************************* ***********************
* Palabra de honor:
* - No he discutido ni mostrado el código de mi programa con alguien que no sea mi *compañero, Profesor o con el monitor asignado a este curso.
* 
* - No he utilizado código obtenido de otro u otros estudiantes,
* O cualquier otra fuente no autorizada, ya sea modificado o sin modificar.
*
* - Si cualquier código o documentación utilizada en mi programa
* Fue obtenido de otra fuente, tal como un libro de texto o notas del curso
* debe ser claramente señalado con una cita apropiada en
* los comentarios de mi programa.
*
* <Kevin Martinez Acevedo – 0222010022>
* <Haider López Guerrero – 0222010045>
* <Cristian David Palacio Morelos – 0222010017>
*
************************************************** *********************/


package TiendaOnline;


import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Martinez
 */
public class TiendaEnLinea {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Variables utilizadas
        int categoria, categoriaLibro, categoriaElectrico, again, againProducto;
        String nombre, editorial, genero, fabricante, total = "";
        int numero, precio, edad, year, pulgadas, watts, cantidad,unidades, valorTotal = 0;
        double totalDescuento = 0;
        long ISBN = 0; /*Se define como long debido a que los codigos ISBN actualmente son de 13 
        caracteres y el tipo int no los soporta*/
        Boolean smart, bluetooth, codlibro;
        
        //Petición de la cantidad de obejetos a ingresar
        do{
            cantidad = Integer.valueOf(JOptionPane.showInputDialog(null, "¿Cuántas ordenes de productos desea ingresar?: "));
        }while(cantidad < 1);//Valida que como minimo se deba ingresar un producto
        
        //Arreglo de tipo Producto donde irán todos los productos ingresados
        Producto productos[] = new Producto[cantidad];
        
        //Ciclo que repetirá la cantidad de veces tantos objetos sean necesarios
        for(int i = 0; i < cantidad ; i++){
            
            //Llamada a la función menu principal, el cual recibe como parametros las opciones del menú optimizando el código
            categoria = menuPrincipales("Tienda en Linea", "Libros", "Equipos Electrónicos", 0);
            
            //Condicional que evalua la categoria del objeto a ingresar (Libros o Equipos electrónicos)
            switch(categoria){
                
                //Ingresa a la opción 1 si se eligió libros
                case 1:
                    
                    // Do-while que preguntará si el siguiente objeto a ingresar es un libro o no
                    do{
                        //Llamada a la función de menú para imprimir las opción de la categoría libro
                        categoriaLibro = menuPrincipales("Tipos de Libros", "Comics", "Libros Infantiles", 1);
                        
                        //Si la opción es distinta a 3, siendo 3 la opción para ir atras
                        if(categoriaLibro != 3){
                            int band = 0;//Variable bandera a utilizar en el condicional del ISBN
                                    //Solicitud de datos necesario de la clase Libro
                                    do{
                                        nombre = JOptionPane.showInputDialog(null,"Ingrese el Titulo:");
                                    }while(nombre.length()==0);//Valida si el campo no está vacio
                                    do{
                                        String validate = JOptionPane.showInputDialog(null,"ISBN:");
                                        codlibro = ValidarISBN(productos, validate, cantidad);
                                        if(validate.length() == 13 || validate.length() == 10){//Verifica que el ISBN debe tener 10 o 13 caracteres reglamentarios
                                            if(!codlibro){//verifica que el ISBN ingresado no se repita, ya que este atributo corresponde exclusivamente a un solo libro
                                                ISBN = Long.parseLong(validate);//Convierte del tipo String a Long debido a que no cabe en un tipo int
                                                band = 0;
                                            }else{//Mensaje que arrojará si el ISBN ingresado ya se encuentra en uso
                                               JOptionPane.showConfirmDialog(null, "El ISBN ingresado ya existe."); 
                                               band = 1;
                                            }
                                        }else{//Mensaje que arrojará si no se cumple la longitud de caracteres
                                            
                                            JOptionPane.showConfirmDialog(null, "El ISBN debe ser de 10 o 13 caracteres numericos.");
                                            band = 1;
                                        }
                                    }while(band == 1);//Condicional del ciclo para repetir tantas veces no se cumpla el requisito de ISBN
                                    //La variable editorial no es obligatoria, debido a que puede ser autopublicado
                                    editorial = JOptionPane.showInputDialog(null,"Nombre de la editorial:");
                                    do{
                                        genero = JOptionPane.showInputDialog(null,"Género:");
                                    }while(genero.length() == 0);//valida que el campo género no esté vacio
                                    do{
                                        year = Integer.valueOf(JOptionPane.showInputDialog(null,"Año de publicación:"));
                                    }while(year<1449 || year>2021);/*Valida que el año sea mayor a 1449, ya que se tiene registro del primer libro publicado y 2021 que es el año actual*/
                                    do{
                                        precio = Integer.valueOf(JOptionPane.showInputDialog(null,"Valor del libro:"));
                                    }while(precio <= 0);//Valida que el producto tenga un valor
                                    
                                    
                            switch(categoriaLibro){//Condicional que estudiará si el producto deseado fué un Comic o Lirbo infantil
                                case 1://Ingresa si lo deseado es un Comic

                                    do{
                                       numero = Integer.valueOf(JOptionPane.showInputDialog(null,"Número del comic:")); 
                                    }while(numero<1);//Valida que el número del comic sea como minimo el #1
                                    
                                    do{
                                        unidades = Integer.valueOf(JOptionPane.showInputDialog(null,"¿Cuantas unidades desea llevar?:"));
                                    }while(unidades <1 );//Valida que se seleccione como minimo una unidad

                                    if(editorial.length() == 0){//Valida si se ingresó un género para llamar a su respectivo constructor
                                        //Se crea un objeto del tipoLibro pero usando polimorfismo con los datos necesarios
                                        Libro newComic = new Comic(numero, ISBN, genero, year, nombre, precio, unidades);
                                        //Si se ingresó el género llama al constrcutor que contiene este dato
                                        productos[i] = newComic;
                                    }else{
                                        //Se crea un objeto del tipo Libro pero usando polimorfismo con los datos necesarios
                                        Libro newComic = new Comic(numero, ISBN, editorial, genero, year, nombre, precio, unidades);
                                        //Se añade al arreglo de Prodcutos
                                        productos[i] = newComic;
                                    }

                                    break;
                                case 2:

                                    do{
                                       edad = Integer.valueOf(JOptionPane.showInputDialog(null,"¿Desde que edad va dirigido?:")); 
                                    }while(edad<4);/*Debido a que los estudios nos indican que la edad minima común para apender a leer es 4 años
                                    se toma como la minima edad para los libros*/ 
                                    
                                    do{
                                        unidades = Integer.valueOf(JOptionPane.showInputDialog(null,"¿Cuantas unidades desea llevar?:"));
                                    }while(unidades <1 );//Valida que se seleccione como minimo una unidad 


                                    if(editorial.length() == 0){
                                        //Se crea un objeto del tipo Libro pero usando polimorfismo con los datos necesarios
                                        Libro newLibro = new LibroInfantil(edad, ISBN, genero, year, nombre, precio, unidades);
                                        //Se añade al arreglo de Prodcutos
                                        productos[i] = newLibro;
                                    }else{
                                        //Se crea un objeto del tipo Libro pero usando polimorfismo con los datos necesarios
                                        Libro newLibro = new LibroInfantil(edad, ISBN, editorial, genero, year, nombre, precio, unidades);
                                        //Se añade al arreglo de Productos
                                        productos[i] = newLibro;
                                    }

                                    break;
                            }
                        }
                        
                        //Condicional que permitira preguntar si el siguiente producto es un libro
                        if(i == cantidad-1){//Si se encuentra en el ultimo paso por el ciclo for ingresará
                            again = 1;//Hace la variable bandera 1 para cerrar el ciclo do-while de la categoría libros
                            i++;//Se suma 1 a la variable del ciclo for
                        }else{//Si no es el ultimo paso por el ciclo for ingresará
                            //Pregunta si el próximo producto a ingresar es un libro
                            again = JOptionPane.showConfirmDialog(null, "¿Deseas agregar una nueva orden de Libros?");
                            if(again == 0){//El valor 0 representa un sí
                                i++;//Se sumará 1 a la variable del for, debido a que no acaba el ciclo for y se agrega un nuevo producto
                            }
                        }
                        
                    }while(again == 0);//Condicional del ciclo categoría de libros

                    break;

                case 2:
                    do{
                        //Llamada a la función de menú para imprimir las opción de la categoría Eqipos Electrónicos
                        categoriaElectrico = menuPrincipales("Tipos de Equipos Electrónicos", "TV", "Equipo de Sonido", 1);
                        
                        //Si la opción es distinta a 3, siendo 3 la opción para ir atras
                        if(categoriaElectrico != 3){
                            
                            int validate;//Variable utilizada luego para validar si el equipo es smart o tiene Bluetooth
                            
                            //Petición de datos al usuario
                            do{
                                nombre = JOptionPane.showInputDialog(null,"Ingrese el Nombre del Equipo:");
                            }while(nombre.length()==0);//Valida que el campo nombre no esté vacio
                            do{
                                fabricante = JOptionPane.showInputDialog(null,"Nombre del Fabricante:");
                            }while(fabricante.length() == 0);//Valida que el campo fabricante no esté vacio
                            do{
                                precio = Integer.valueOf(JOptionPane.showInputDialog(null,"Valor del Equipo:"));
                            }while(precio <= 0);//Valida que el campo valor no esté vacio

                            switch(categoriaElectrico){
                                case 1:

                                    do{
                                        pulgadas = Integer.valueOf(JOptionPane.showInputDialog(null,"Cantidad de Pulgadas:"));
                                    }while(pulgadas<19);/*Se valida si el tv cuenta con un minimo de 19 pulgadas, debido a que actualmente
                                    es la cantidad minima común comercial*/ 
                                    do{
                                        validate = JOptionPane.showConfirmDialog(null, "¿El Tv es Smart Tv?:");
                                        if(validate == 0){//Se toma el 0 como sí y se valida el dato
                                            smart = true;
                                        }else{
                                            smart = false;
                                        }
                                    }while(validate == 3);//Si se oprime el botón cancelar se volverá a solicitar el dato
                                    
                                    do{
                                        unidades = Integer.valueOf(JOptionPane.showInputDialog(null,"¿Cuantas unidades desea llevar?:"));
                                    }while(unidades <1 );//Valida que se seleccione como minimo una unidad
                                    
                                    //Se crea un objeto del tipo ProductoElectronico pero usando polimorfismo con los datos necesarios
                                    ProductoElectronico newTV = new TV(pulgadas, smart, fabricante, precio, nombre, unidades);
                                    //Ingreso del objeto en el arreglo de productos
                                    productos[i] = newTV;

                                    break;
                                case 2:

                                    do{
                                        watts = Integer.valueOf(JOptionPane.showInputDialog(null,"Cantidad de WATTS:"));
                                    }while(watts<1);//Valida que no se pueda ingresar 0 o valores negativos en el campo WATTS
                                    do{
                                        validate = JOptionPane.showConfirmDialog(null, "¿El equipo de sonido tiene bluetooth?:");
                                        if(validate == 0){//Se toma el 0 como sí y se valida el dato
                                            bluetooth = true;
                                        }else{
                                            bluetooth = false;
                                        }
                                    }while(validate == 3);//Si se oprime el botón cancelar se volverá a solicitar el dato
                                    
                                    do{
                                        unidades = Integer.valueOf(JOptionPane.showInputDialog(null,"¿Cuantas unidades desea llevar?:"));
                                    }while(unidades <1 );//Valida que se seleccione como minimo una unidad
                                    
                                    //Se crea un objeto del tipo ProductoElectronico pero usando polimorfismo con los datos necesarios
                                    ProductoElectronico newEquipoSonido = new EquipoSonido(watts, bluetooth, fabricante, precio, nombre, unidades);
                                    //Se introduce el objeto al arreglo de productos
                                    productos[i] = newEquipoSonido;

                                    break;
                            }

                        }

                        //Condicional que permitira preguntar si el siguiente producto es un Equipo Electrónico
                        if(i == cantidad-1){//Si se encuentra en el ultimo paso por el ciclo for ingresará
                            again = 1;//Hace la variable bandera 1 para cerrar el ciclo do-while de la categoría Equipo Electrónico
                            i++;//Se suma 1 a la variable del ciclo for
                        }else{//Si no es el ultimo paso por el ciclo for ingresará
                            //Pregunta si el próximo producto a ingresar es un Equipo Electrónico
                            again = JOptionPane.showConfirmDialog(null, "¿Deseas agregar una nueva orden de Equipos Electrónicos?");
                            if(again == 0){//El valor 0 representa un sí
                                i++;//Se sumará 1 a la variable del for, debido a que no acaba el ciclo for y se agrega un nuevo producto
                            }
                        }

                    }while(again == 0);
                    break;

                default:
                    System.exit(0);
            }
            
        }
           
        
        //Recorrido al arreglo de productos
        for(int i = 0; i < cantidad ; i++){
            if(productos[i] instanceof Comic){//Se valida si en la posición hay una instancia de la clase Comic
                //Se le añade a la cadena total el tipo, los datos del objeto, el valor por cantidad y el valor de descuento llamando a su metodo sobreescrito
                total += "Tipo: Comic\n" + productos[i].toString() + "Valor Descuento: "+ productos[i].calcularPrecioDescuento()+"\n\n";                        
            }else if(productos[i] instanceof LibroInfantil){//Se valida si en la posición hay una instancia de la clase LibroInfantil
                //Se le añade a la cadena total el tipo, los datos del objeto y el valor de descuento llamando a su metodo sobreescrito
                total += "Tipo: Libro Infantil\n" + productos[i].toString()+"Valor Descuento: "+ productos[i].calcularPrecioDescuento()+"\n\n"; 
                
            }else if(productos[i] instanceof TV){//Se valida si en la posición hay una instancia de la clase TV
                //Se le añade a la cadena total el tipo, los datos del objeto y el valor de descuento llamando a su metodo sobreescrito
                total += "Tipo: TV\n" + productos[i].toString() + "Valor Descuento: "+ productos[i].calcularPrecioDescuento()+"\n\n";; 
                
            }else{//Si no es ninguna de las anteriores, por defecto debe ser de la clase EquipoSonido
                //Se le añade a la cadena total el tipo, los datos del objeto y el valor de descuento llamando a su metodo sobreescrito
                total += "Tipo: Equipo de Sonido\n" + productos[i].toString() + "Valor Descuento: "+ productos[i].calcularPrecioDescuento()+"\n\n";
            }
            valorTotal += productos[i].cantidad*productos[i].valorUnitario;//De la misma manera se acumulan los valores unitarios para dar un valor total
            totalDescuento += productos[i].cantidad*productos[i].calcularPrecioDescuento();//Al igual que los valores de descuentos del producto
        }
        
        //Impresión de los productos ingresados con sus datos y al final el valor total con y sin descunto de temporada
        System.out.println(total + "Valor Total: " + valorTotal +"\n"+ "Valor total con descuento: " + totalDescuento);
        
        
    } 
    /**
     * Metodo ValidarISBN , sera llamado para verificar que el ISBN que recibe como parametro se encuetre o no dentro del arreglo
     * 
     * @param p arreglo que almacena los productos ingresados por el usuario
     * @param cod ISBN que se desea validar
     * @param tam tamaño del arreglo de productos
     * 
     * @return true si el ISBN ya existe dentro del arreglo o false si no existe
     */
    public static Boolean ValidarISBN(Producto [] p, String cod, int tam){
         long ISBN = Long.parseLong(cod);//Convierte del tipo String a Long para poder realizar la comparacion debido a que dentro del arreglo se almacena el ISBN como tipo long
          for(int i = 0; i < tam; i++){//se recorre el arreglo
              if(p[i] instanceof LibroInfantil || p[i] instanceof Comic ){//Se valida si en la posición hay una instancia de la clase LibroInfantil o Comic
                  Libro libros = (Libro)p[i];//se crea una nueva instancia de libro que solo las instancias tipo libro del arreglo p
                  if(libros.ISBN == ISBN){//se validad que el atributo ISBN de la instancia sea igual al ISBN ingresado 
                        return true;
                    }                      
              }
          }
        
          return false;  
    }
    
    //Metodo MenuPrincipal, será llamado en cada menú a imprimir para mejor optimización del código
    public static int menuPrincipales(String title, String op1, String op2, int atras){
        
        int op;
        String op3;
        
        if(atras == 1){//Si el parametro atras es 1 significa que se solicitará una categoria de libros o Equipo de Sonido
            op3 = "3. Atras\n\n";//La opción 3 tomará el valor de atras
        }else{
            op3 = "3. Salir\n\n";//La opción 3 tomará el valor de Salir
        }
        
        do{//Impresión y solicitud de opciones 
            op = Integer.valueOf(JOptionPane.showInputDialog(null, title+"\n\n"
                + "1. "+op1+"\n"
                + "2. "+op2+"\n"
                + op3));
        }while(op>4 || op<1);//Condicional que valida la opción exista
        
        return op;
        
    }
    
}
