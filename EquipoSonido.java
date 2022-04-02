/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaOnline;

/**Esta clase define objetos que contienen datos de un Equipo de sonido, el cual es un tipo de producto electronico
 *
 * @author Kevin Martinez
 */
public class EquipoSonido extends ProductoElectronico{// esta clase hereda los atributos y metodos de la clase ProductoElectronico
    //ATRIBUTOS
    private int watts;
    private Boolean bluetooth;
    
    /**
     * Constructor por defecto no recibe parametros 
     * inicializa los watts a 60
     * inicializa el atributo bluetooth a false
     */
 
    public EquipoSonido() {
        super();//se utiliza el metodo super para inicializar los atributos heredados de la clase ProductoElectronico a sus valores por defecto
        watts = 60;
        bluetooth = false;
    }
    
    /**
     * Constructor alternativo
     * recibe como parametros el fabricante,los watts, bluetooth, el nombre, la cantidad y su valor unitario
     * e inicializa los atributos a los valores de los parametros ingresados
     * @param watts
     * @param bluetooth
     * @param fabricante
     * @param nombre
     * @param valorUnitario
     * @param cantidad
     */

    
    public EquipoSonido(int watts, Boolean bluetooth, String fabricante, int valorUnitario, String nombre ,int cantidad){
        super(fabricante, valorUnitario, nombre, cantidad);
        this.watts = watts;
        this.bluetooth = bluetooth;
    } 
    
    // Analizadores y Modificadores de atributos
    
    /**Metodo Analizador del atributo watts no recibe parametros
     * 
     *@return el valor numerico representa la potencia del equipo de sonido en watts
     * 
     */

    public int getWatts() {
        return watts;
    }
    
    /**Metodo Modificador del atributo watts recibe como parametros la potencia en watts
     * 
     * @param watts 
     * 
     */

    public void setWatts(int watts) {
        this.watts = watts;
    }
    
    /**Metodo Analizador del atributo bluetooth no recibe parametros
     * 
     *@return true si el equipo de sonido tiene bluetooth y false si no lo tiene
     * 
     */

    public Boolean getBluetooth() {
        return bluetooth;
    } 
    
    /**Metodo Modificador del atributo bluetooth recibe un parametro booleano  
     * 
     * @param bluetooth el valor booleano determina si se cumple con la condicion de tener bluetooth
     * 
     */

    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
    
    /**
     * Metodo calcularPrecioDescuento heredado de la clase ProductoElectronico ,el cual asimismo tambien es un metodo heredo de la clase producto 
     *Este metodo fue sobrescrito para calcula el valor del precio de descuento de un equipo de sonido restandole a su valor unitario la multiplicacion de este 
     * mismo por 0.15 
     * 
     * @return el resultado es el precio de descuento de un equipo de sonido en temporada el cual es el valor unitario menos su 15%
     * 
     */

    @Override
    public double calcularPrecioDescuento(){
        return valorUnitario - (valorUnitario * 0.15);
    }
    
    /*
     * Metodo toString heredado de la clase Object 
     * Devuelve los atributos del televisor en un String
     * contiene los atributos nombre, fabricante, watts, bluetooth y valor unitario
     * 
     */

    @Override
    public String toString() {
        return "Nombre Equipo de Sonido: " + nombre + "\n"
                + "Fabricante: " + fabricante + "\n"
                + "Watts: " + watts + "\n"
                + "Bluetooth: " + bluetooth + "\n"
                + "Cantidad: " + cantidad + "\n"
                + "Valor: " + valorUnitario + "\n";
    }
    
}
