
package cuentas;

/**
 *
 * Clase que emula el control y el movimiento de una
 * bancaria
 *
 * @author Marcos
 * @version 2.25
 * @since 1.2
 *
 */

public class CCuenta {

   
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    /**
     * Constructor clase cuentas del proyecto
     *
     * @param nom Nombre cliente
     * @param cue Número de cuenta
     * @param sal Variable tipo double que contiene el saldo
     * @param tipo Variable tipo double que contiene el tipo de interés
     *
     *
     */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Método estado
     * @return Devuelve el valor de la vaiable saldo
     *
     */

    public double estado()
    {
        return getSaldo();
    }

    /**
     * 
     * @param cantidad importe de la cantidad que se va ingresar
     * @throws Exception se generará una excepción en el caso de la cantidad
     * a ingresar sea negativa.
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     *
     * @param cantidad importe de la cantidad a retirar se restará al saldo
     * @throws Exception se crearán excepciones en el caso de una cantidad negativa o
     * bien en el caso que el saldo sea menos que la cantidad retirar
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Getter de la variable nombre
     * @return devuelve el valor de nombre
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Setter de la variable nombre
     * @param nombre String variable nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter variable cuenta
     * @return Devuelve valor de la variable tipo Strig cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Setter variable tipo String cuenta
     * @param cuenta variable tipo String
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     *Getter de la variable tipo double saldo
     * @return devuelve el valor de la variable saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Setter de la variable saldo
     * @param saldo asigna el valor pasado a la variable saldo
     */

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Getter de la variable tipoInteres
     * @return devuelve el valor de la variable tipo double tipoInteres
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Setter de la variable tipoInteres
     * @param tipoInterés Asigna el vaor pasado por parámetro a la variable tipoInteres
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}