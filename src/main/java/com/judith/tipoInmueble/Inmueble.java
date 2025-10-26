package com.judith.tipoInmueble;
/*
 * Autor: Judith Piedra
 * Fecha: 24/10/2025
 * Descripción: Esta clase denominada Inmueble, modela un inmueble
 * definirá la lógica para calcular el valor de compra específico para cada tipo de inmueble
 * con los siguientes atributos comunes: identificador inmobiliario, área en metros cuadrados,
 * dirección
 */

// Clase base para todos los inmuebles
public abstract class Inmueble {
    // Atributo identificador único del inmueble
    protected int identificadorInmobiliario;
    // Atributo área en metros cuadrados
    protected double areaMetrosCuadrados;
    // Atributo dirección del inmueble
    protected String direccion;
    // Atributo precio de venta del inmueble
    //protected double precioVenta;

    /*Constructor de la clase Inmueble
     * @param identificadorInmobiliario Parámetro que define al inmueble
     * @param areaEnMetrosCuadrados Parámetro que define el tamaño del inmueble
     * @param direccion Parámetro que define la dirección del inmueble
     */
    public Inmueble(int identificadorInmobiliario, double areaMetrosCuadrados,
                    String direccion) {
        // Inicializa el identificador inmobiliario
        this.identificadorInmobiliario = identificadorInmobiliario;
        // Inicializa el áarea en métros cuadrados
        this.areaMetrosCuadrados = areaMetrosCuadrados;
        // Inicializa la dirección
        this.direccion = direccion;
    }

    // Métodos abstracto para obtener el valor base por metro cuadrado
    // Debe ser implementado por cada subclase concreta.
    public abstract int getValorMetroCuadrado();

    // Métodos para calcular el valor de compra total del inmueble
    public double calcularValorCompra() {
        // El valor de compra depende del área y el valor por metro cuadrado específico
        return areaMetrosCuadrados * getValorMetroCuadrado();
    }
    // Métodos para mostrar información del inmueble
    public void imprimir() {
        // Muestra el identificador inmobiliario
        System.out.println("Identificador Inmueble: " + identificadorInmobiliario);
        // Muestra el área en metros cuadrados
        System.out.println("Área: " + areaMetrosCuadrados + " m²");
        // Muestra la dirección
        System.out.println("Dirección: " + direccion);
    }
}