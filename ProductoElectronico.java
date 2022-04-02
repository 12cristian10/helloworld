/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaOnline;

/**Esta clase define objetos que contienen datos de un electrodomestico, el cual es un tipo de producto caracterizado por requerir de electricidad
 *
 * @author Kevin Martinez
 */
public class ProductoElectronico extends Producto{// esta clase hereda los atributos y metodos de la clase Producto
    //ATRIBUTOS
    protected String fabricante;
    
    /**
     * Constructor por defecto no recibe parametros 
     * inicializa el fabricante a Empresa x
     */
 
    public ProductoElectronico() { 
        super();//se utiliza el metodo super para inicializar los atributos heredados de la clase producto a sus valores por defecto
        fabricante = "Empresa x";
    }
    
    /**
     * Constructor alternativo
     * recibe como parametros el fabricante del producto, el nombre, la cantidad y su valor unitario
     * e inicializa los atributos a los valores de los parametros ingresados
     * @param fabricante
     * @param nombre
     * @param valorUnitario
     * @param cantidad
     */
    
    public ProductoElectronico(String fabricante, int valorUnitario, String nombre, int cantidad){
        super(nombre, valorUnitario, cantidad);//se utiliza el metodo super para inicializar los atributos heredados de la clase producto a los valores de los parametros asignados
        this.fabricante = fabricante;
    }
    
    // Analizadores y Modificadores de atributos
    
    /**Metodo Analizador del atributo fabricante no recibe parametros
     * 
     *@return fabricante del producto electronico
     * 
     */

    public String getFabricante() {
        return fabricante;
    }
    
    /**Metodo Modificador del atributo fabricante recibe como parametros el fabricante del producto electronico
     * 
     * @param fabricante
     * 
     */

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    /*
     * Metodo toString heredado de la clase Object 
     * Devuelve los atributos del producto electronico en un String
     */
    
    @Override
    public String toString() {
        return nombre + " " + valorUnitario+ " " + cantidad + " " + fabricante ;
    }
    
}
