/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaOnline;

/**Esta clase define objetos que estan a la venta en una tienda online, los cuales cuentan con un nombre y un precio unitario
 *
 * @author Kevin Martinez
 */
public class Producto {
    // ATRIBUTOS
    protected String nombre;
    protected int valorUnitario, cantidad; 
    
    /**
     * Constructor por defecto no recibe parametros 
     * inicializa nombre a Item variado y valor unitario a 50000
     */
    public Producto(){
        nombre = "Item variado";
        valorUnitario =50000;
        cantidad = 1;
    }
    
    /**
     * Constructor alternativo
     * recibe como parametros el nombre del producto y su valor unitario
     * e inicializa los atributos a los valores de los parametros
     * @param nombre
     * @param valorUnitario
     * @param cantidad
     */
    public Producto(String nombre, int valorUnitario, int cantidad){
        this.nombre = nombre;
        this.valorUnitario = valorUnitario;
        this.cantidad = cantidad;
    }
    
    // Analizadores y Modificadores de atributos
    
    /**Metodo Modificador del atributo nombre recibe como parametros el nombre ingresado
    *
    * @param nombre
    * 
    */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    /**Metodo Modificador del atributo valorUnitario recibe como parametros el valorUnitario ingresado
     *
     * @param valorUnitario
     * 
     */
    public void setValorUnitario(int valorUnitario){
        this.valorUnitario = valorUnitario;
    } 
    
   /**Metodo Modificador del atributo cantidad recibe como parametros la cantidad de productos
    *
    * @param cantidad
    * 
    */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    /**Metodo Analizador del atributo Nombre no recibe parametros 
     * 
     * @return nombre del producto
     * 
     */
    public String getNombre() {
        return nombre;
    }
    
    /**Metodo Analizador del atributo valorUnitario no recibe parametros 
    *  
    * @return valor unitario del producto
    * 
    */
    public int getValorUnitario() {
        return valorUnitario;
    } 
    
    /**Metodo Analizador del atributo cantidad no recibe parametros 
    *  
    * @return valor numerico que representa la cantidad de unidades ingresadas del producto
    * 
    */
    
    public int getCantidad() {
        return cantidad;
    }
    
    //Metodo que define la operacion que permite calcular el precio en descuento de un producto
    
    public double calcularPrecioDescuento(){
        return 0;
    }
    
}
