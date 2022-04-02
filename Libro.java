/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaOnline;

/**Esta clase define objetos que contienen datos de un libro, el cual es un tipo de producto caracterizado por estar destinado a la lectura
 *
 * @author Kevin Martinez
 */
public class Libro extends Producto{ // esta clase hereda los atributos y metodos de la clase producto
    //ATRIBUTOS
    protected long ISBN;
    protected String editorial;
    protected String genero;
    protected int publicationYear; 
    
    /**
     * Constructor por defecto no recibe parametros 
     * inicializa ISBN a 123
     * inicializa editorial a desconocida
     * inicializa genero a novela
     * inicializa publicationYear a el año 2000
     */
    public Libro(){
        super();    //se utiliza el metodo super para inicializar los atributos heredados de la clase producto a sus valores por defecto
        ISBN = 123;
        editorial = "desconocida";
        genero = "novela";
        publicationYear = 2000;
    }
    
    /**
     * Primer constructor alternativo
     * recibe como parametros el ISBN, la editorial, el genero , el año de publicacion del producto , el nombre, la cantidad y su valor unitario
     * e inicializa los atributos a los valores de los parametros ingresados
     * @param ISBN
     * @param editorial
     * @param genero
     * @param publicationYear
     * @param nombre
     * @param valorUnitario
     * @param cantidad
     */
    
    public Libro(long ISBN, String editorial, String genero, int publicationYear, String nombre, int valorUnitario, int cantidad){
        super(nombre, valorUnitario, cantidad); //se utiliza el metodo super para inicializar los atributos heredados de la clase producto a los valores de los parametros asignados
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.genero = genero;
        this.publicationYear = publicationYear;
    }
    
    /**
     * Segundo constructor alternativo
     * recibe como parametros el ISBN, el genero , el año de publicacion del producto , el nombre, la cantidad y su valor unitario
     * e inicializa el atributo editorial a Autopublicado y los atributos a los valores de los parametros ingresados
     * @param ISBN
     * @param genero
     * @param publicationYear
     * @param nombre
     * @param valorUnitario
     * @param cantidad
     */

    
    public Libro(long ISBN, String genero, int publicationYear, String nombre, int valorUnitario, int cantidad){
        super(nombre, valorUnitario, cantidad);
        this.ISBN = ISBN;
        this.editorial = "Autopublicado";
        this.genero = genero;
        this.publicationYear = publicationYear;
    }
    
    // Analizadores y Modificadores de atributos
    
    
    /**Metodo Modificador del atributo ISBN recibe como parametros el ISBN
     * 
     * @param ISBN el valor numerico representa un codigo utlizado para la identificacion de libros
     * 
     */

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }
    
    /**Metodo Modificador del atributo editorial recibe como parametros la editorial del libro
    * 
    * @param editorial
    * 
    */
    
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    /**Metodo Modificador del atributo genero recibe como parametros el genero del libro
     * 
     * @param genero el String permite la categorizacion de los libros
     * 
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    /**Metodo Modificador del atributo publicationYear recibe como parametros el año de publicacion del libro
     * 
     * @param publicationYear
     * 
     */
    
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    
    /**Metodo Analizador del atributo ISBN no recibe parametros
     * 
     *@return ISBN del libro
     * 
     */
    
    public long getISBN() {
        return ISBN;
    }
    
    /**Metodo Analizador del atributo editorial no recibe parametros
     * 
     * @return editorial del libro
     * 
     */
    
    public String getEditorial() {
        return editorial;
    }
    
    /**Metodo Analizador del atributo genero no recibe parametros
    * 
    * @return genero del libro
    * 
    */

    public String getGenero() {
        return genero;
    }
    
    /**Metodo Analizador del atributo publicationYear no recibe parametros
    * 
    * @return año de publicacion del libro
    * 
    */

    public int getPublicationYear() {
        return publicationYear;
    }
    
    /**
     * Metodo toString heredado de la clase Object 
     * Devuelve los atributos del libro en un String
     */
    
    @Override
    public String toString(){
        return nombre + " " + ISBN + " " + editorial + " " + genero + " " + publicationYear + " " + valorUnitario +" " + cantidad;
    }
    
}
