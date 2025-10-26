package com.judith.tipoInmueble;
/*
 * Autor: Judith Piedra
 * Fecha: 24/10/2025
 * Descripción: Esta clase denominada CasaUrbana,
 * extiende a Casa y modela inmuebles para la vivienda pueden estar en conjunto cerrado o ser independientes
 * no tiene atributos propios en la descripción
 */

//Clase CasaUrbana
public abstract class CasaUrbana extends Casa{
    // Las Casas Urbanas no tienen atributos propios

    /* Constructor que llama al constructor de la clase padre - Casa
     * @param identificadorInmobiliario Parámetro heredado para identificar el inmueble
     * @param areaMetrosCuadrados Parámetro heredado para conocer el área total en m²
     * @param direccion Parámetro heredado para saber la dirección del inmueble
     * @param numeroHabitaciones Parámetro heredado para saber la cantidad de habitaciones
     * @param numeroBanios Parámetro heredado para saber la cantidad de baños
     * @param cantidadPisos Parámetro heredado para saber el número de pisos
     */
    public CasaUrbana(int identificadorInmobiliario, double areaMetrosCuadrados, String direccion,
                      int numeroHabitaciones, int numeroBanios, int cantidadPisos) {
        // Llama al constructor Casa
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion,
                numeroHabitaciones, numeroBanios, cantidadPisos);
    }

    // Sobreescribe el métodos imprimir
    @Override
    public void imprimir() {
        // Imprime título identificador
        System.out.println("--- Casa Urbana ---");
        // Imprime datos de Casa
        super.imprimir();
    }

    // El métodos getValorMetroCuadrado() permanece abstracto aquí.
}
