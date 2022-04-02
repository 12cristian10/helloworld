/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaOnline;

/**Esta clase define objetos que contienen datos de un comic, el cual es una clase de libro caracterizado por el número.
 *
 * @author Kevin Martinez
 */
public class Comic extends Libro{ // esta clase hereda los atributos y metodos de la clase libro
    
    //ATRIBUTOS
    private int numero;
    
    /**
     * Constructor por defecto no recibe parametros 
     * inicializa la edad a 6 años
     */

    public Comic() {
        super();//se utiliza el metodo super para inicializar los atributos heredados de la clase libro a sus valores por defecto
        numero = 1;
    }
    
    /**
     * Primer constructor alternativo
     * recibe como parametros el ISBN, la editorial, el genero , el año de publicacion del producto , el nombre, la cantidad y su valor unitario
     * e inicializa los atributos a los valores de los parametros ingresados
     * @param numero
     * @param ISBN
     * @param editorial
     * @param genero
     * @param publicationYear
     * @param nombre
     * @param valorUnitario
     * @param cantidad
     */

    public Comic(int numero, long ISBN, String editorial, String genero, int publicationYear, String nombre, int valorUnitario, int cantidad){
        super(ISBN, editorial, genero, publicationYear, nombre, valorUnitario, cantidad);//se utiliza el metodo super para inicializar los atributos heredados de la clase libro
        this.numero = numero;                                                  // a los valores de los parametros ingresados
    }
/**
     * Segundo constructor alternativo
     * recibe como parametros el numero, el ISBN, el genero , el año de publicacion del producto , el nombre, la cantidad y su valor unitario
     * e inicializa el atributo heredado editorial a su valor por defecto y los demas atributos a los valores de los parametros ingresados
     * @param numero
     * @param ISBN
     * @param genero
     * @param publicationYear
     * @param nombre
     * @param valorUnitario
     * @param cantidad
     */    
    public Comic(int numero, long ISBN, String genero, int publicationYear, String nombre, int valorUnitario, int cantidad){
        super(ISBN, genero, publicationYear, nombre, valorUnitario, cantidad);
        this.numero = numero;
    }
    
    // Analizadores y Modificadores de atributos
    
    /**Metodo Analizador del atributo numero no recibe parametros
     * 
     *@return numero del comic
     * 
     */

    public int getNumero() {
        return numero;
    }

    /**Metodo Modificador del atributo numero recibe como parametros el numero del comic
     * 
     * @param numero 
     * 
     */
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    /**
     * Metodo calcularPrecioDescuento heredado de la clase libro ,el cual asimismo tambien es un metodo heredo de la clase producto 
     *Este metodo fue sobrescrito para calcula el valor del precio de descuento de un comic restandole a su valor unitario la multiplicacion de este 
     * mismo por 0.05 
     * 
     * @return el resultado es el precio de descuento de un comic en temporada el cual es el valor unitario menos su 5%
     * 
     */
    
    @Override
    public double calcularPrecioDescuento(){
        return valorUnitario - (valorUnitario * 0.05);
    }
    
    /*
     * Metodo toString heredado de la clase Object 
     * Devuelve los atributos del comic en un String
     * contiene los atributos nombre, ISBN, editorial, numero, genero, año de publicacion y valor unitario
     */


    @Override
    public String toString() {
        return "Nombre del Comic: " + nombre + "\n"
                + "ISBN: " + ISBN + "\n"
                + "Editorial: " + editorial + "\n"
                + "Numero: " + numero + "\n"
                + "Genero: " + genero + "\n"
                + "Año de Publicación: " + publicationYear + "\n"
                + "Cantidad: " + cantidad + "\n"
                + "Valor: " + valorUnitario +"\n";
    }
    
}
