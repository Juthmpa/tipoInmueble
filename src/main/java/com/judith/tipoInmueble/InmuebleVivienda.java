package com.judith.tipoInmueble;
/*
 * Autor: Judith Piedra
 * Fecha: 24/10/2025
 * Descripción: Esta clase denominada InmuebleVivienda,
 * extiende a inmueble y modela inmuebles para la vivienda pueden ser departamentos o casas
 * con los siguientes atributos propios: número de habitaciones, número de baños
 */

// Clase inmuebles para vivienda
public abstract class InmuebleVivienda extends Inmueble {
    // Atributo que da el número de habitaciones
    private int numeroHabitaciones;
    // Atributo que da el número de baños
    private int numeroBanios;

    /* Constructor que llama al constructor de la clase padre - Inmueble
     * @param identificadorInmobiliario Parámetro heredado para identificar el inmueble
     * @param areaMetrosCuadrados Parámetro heredado para conocer el área total en m²
     * @param direccion Parámetro heredado para saber la dirección del inmueble
     * @param numeroHabitaciones Parámetro que define el número de habitaciones
     * @param numeroBanios Parámetro que define el número de baños
     */
    public InmuebleVivienda (int identificadorInmobiliario, double areaMetrosCuadrados, String direccion,
                             int numeroHabitaciones, int numeroBanios) {
        // Llama al constructor de Inmueble
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion);
        // Inicializa el número de habitaciones
        this.numeroHabitaciones = numeroHabitaciones;
        // Inicializa el número de baños
        this.numeroBanios = numeroBanios;
    }

    // Sobreescribe el métodos imprimir para incluir información de vivienda
    @Override
    public void imprimir() {
        // Llama al métodos imprimir de Inmueble
        super.imprimir();
        // Muestra habitaciones
        System.out.println("Número de habitaciones: " + numeroHabitaciones);
        // Muestra baños
        System.out.println("Número de baños: " + numeroBanios);
    }
/* El métodos getValorMetroCuadrado() permanece abstracto aquí,
 * forzando a las subclases concretas a implementarlo.
 */
}
