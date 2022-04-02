/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaOnline;

/**Esta clase define objetos que contienen datos de un libro infantil, el cual es una clase de libro caracterizado por la edad de los niños a quien van dirigidos
 *
 * @author Kevin Martinez
 */
public class LibroInfantil extends Libro{ // esta clase hereda los atributos y metodos de la clase libro
    
   //ATRIBUTOS
    private int edad;
    
    /**
     * Constructor por defecto no recibe parametros 
     * inicializa la edad a 6 años
     */
  
    public LibroInfantil(){
        super(); //se utiliza el metodo super para inicializar los atributos heredados de la clase libro a sus valores por defecto
        edad = 6;
    }
    
    /**
     * Primer constructor alternativo
     * recibe como parametros el ISBN, la editorial, el genero , el año de publicacion del producto , el nombre, la cantidad y su valor unitario
     * e inicializa los atributos a los valores de los parametros ingresados
     * @param edad
     * @param ISBN
     * @param editorial
     * @param genero
     * @param publicationYear
     * @param nombre
     * @param valorUnitario
     * @param cantidad
     */
    
    public LibroInfantil(int edad, long ISBN, String editorial, String genero, int publicationYear, String nombre, int valorUnitario, int cantidad){
        super(ISBN, editorial, genero, publicationYear, nombre, valorUnitario, cantidad);//se utiliza el metodo super para inicializar los atributos heredados de la clase libro 
        this.edad = edad;                                                      // a los valores de los parametros ingresados
    }
    
    /**
     * Segundo constructor alternativo
     * recibe como parametros la edad, el ISBN, el genero , el año de publicacion del producto , el nombre, la cantidad y su valor unitario
     * e inicializa el atributo heredado editorial a su valor por defecto y los demas atributos a los valores de los parametros ingresados
     * @param edad
     * @param ISBN
     * @param genero
     * @param publicationYear
     * @param nombre
     * @param valorUnitario
     * @param cantidad
     */
    
    public LibroInfantil(int edad, long ISBN, String genero, int publicationYear, String nombre, int valorUnitario, int cantidad){
        super(ISBN, genero, publicationYear, nombre, valorUnitario, cantidad);
        this.edad = edad;
    } 
    
    // Analizadores y Modificadores de atributos
    
    /**Metodo Analizador del atributo edad no recibe parametros
     * 
     *@return edad de los niños a quien van dirigidos
     * 
     */

    public int getEdad() {
        return edad;
    }
    
    /**Metodo Modificador del atributo edad recibe como parametros la edad de los niños a quien van dirigido el libro infantil
     * 
     * @param edad 
     * 
     */

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * Metodo calcularPrecioDescuento heredado de la clase libro ,el cual asimismo tambien es un metodo heredo de la clase producto 
     *Este metodo fue sobrescrito para calcula el valor del precio de descuento de un libro infantil restandole a su valor unitario la multiplicacion de este 
     * mismo por 0.10 
     * 
     * @return el resultado es el precio de descuento de un libro infantil en temporada el cual es el valor unitario menos su 10%
     * 
     */
    
    @Override
    public double calcularPrecioDescuento(){
        return valorUnitario - (valorUnitario * 0.10);
    }
    
    /*
     * Metodo toString heredado de la clase Object 
     * Devuelve los atributos del libro infantil en un String
     * contiene los atributos nombre, ISBN, editorial, edad, genero, año de publicacion y valor unitario
     */
    
    
    @Override
    public String toString() {
        return "Titulo del libro: " + nombre + "\n"
                + "ISBN: " + ISBN + "\n"
                + "Editorial: " + editorial + "\n"
                + "Edad: " + edad + "\n"
                + "Genero: " + genero + "\n"
                + "Año de Publicación: " + publicationYear + "\n"
                + "Cantidad: " + cantidad + "\n"
                + "Valor unitario: " + valorUnitario +"\n";
    }
    
    
    
}
