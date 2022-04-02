/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaOnline;

/** Esta clase define objetos que contienen datos de un Televisor, el cual es un tipo de producto electronico
 *
 * @author Kevin Martinez
 */
public class TV extends ProductoElectronico{// esta clase hereda los atributos y metodos de la clase ProductoElectronico
    //ATRIBUTOS
    private int pulgadas;
    private Boolean smart;
    
    /**
     * Constructor por defecto no recibe parametros 
     * inicializa las pulgadas a 32
     * inicializa el atributo smart a false
     */
    
    public TV() {
        super();//se utiliza el metodo super para inicializar los atributos heredados de la clase ProductoElectronico a sus valores por defecto
        pulgadas = 32;
        smart = false;
    }
    
    /**
     * Constructor alternativo
     * recibe como parametros el fabricante,las pulgadas, smart, el nombre, la cantidad y su valor unitario
     * e inicializa los atributos a los valores de los parametros ingresados
     * @param pulgadas
     * @param smart
     * @param fabricante
     * @param nombre
     * @param valorUnitario
     * @param cantidad
     */
    
    public TV(int pulgadas, Boolean smart, String fabricante, int valorUnitario, String nombre, int cantidad){
        super(fabricante, valorUnitario, nombre, cantidad);//se utiliza el metodo super para inicializar los atributos heredados de la clase producto a los valores de los parametros asignados
        this.pulgadas = pulgadas;
        this.smart = smart;
    }
    
    // Analizadores y Modificadores de atributos
    
    /**Metodo Analizador del atributo pulgadas no recibe parametros
     * 
     *@return el tamaño en pulgadas del televisor
     * 
     */

    public int getPulgadas() {
        return pulgadas;
    }
    
    /**Metodo Modificador del atributo pulgadas recibe como parametros las pulgadas 
     * 
     * @param pulgadas el valor numerico representa el tamaño del producto elctronico
     * 
     */

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }
    
    /**Metodo Analizador del atributo smart no recibe parametros
     * 
     *@return true si el televisor es smart y false si no lo es
     * 
     */


    public Boolean getSmart() {
        return smart;
    }
    
    /**Metodo Modificador del atributo smart recibe un parametro booleano  
     * 
     * @param smart el valor booleano determina si se cumple con la condicion de ser smart
     * 
     */


    public void setSmart(Boolean smart) {
        this.smart = smart;
    }
    
    /**
     * Metodo calcularPrecioDescuento heredado de la clase ProductoElectronico ,el cual asimismo tambien es un metodo heredo de la clase producto 
     *Este metodo fue sobrescrito para calcula el valor del precio de descuento de un TV restandole a su valor unitario la multiplicacion de este 
     * mismo por 0.20 
     * 
     * @return el resultado es el precio de descuento de un televisor en temporada el cual es el valor unitario menos su 20%
     * 
     */
    
    @Override
    public double calcularPrecioDescuento(){
        return valorUnitario - (valorUnitario * 0.20);
    }
    
    /*
     * Metodo toString heredado de la clase Object 
     * Devuelve los atributos del televisor en un String
     * contiene los atributos nombre, fabricante, pulgadas, smart y valor unitario
     */

    @Override
    public String toString() {
        return "Nombre del TV: " + nombre + "\n"
                + "Fabricante: " + fabricante + "\n"
                + "Pulgadas: " + pulgadas + "\n"
                + "Smart Tv: " + smart + "\n"
                + "Cantidad: " + cantidad + "\n"
                + "Valor: " + valorUnitario + "\n";
    }
    
}
