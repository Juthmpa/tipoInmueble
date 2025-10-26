package com.judith.tipoInmueble;
/*
 * Autor: Judith Piedra
 * Fecha: 24/10/2025
 * Descripción: Esta clase denominada Casa Independiente,
 * extiende a CasaUrbana y modela inmuebles para la vivienda que son
 * intependientes, no tiene atributos propios en la descripción
 */

//Clase Casa Urbana Independiente
public class CasaIndependiente extends CasaUrbana {
// Las casas independientes no tienen atributos adicionales específicos en la descripción

    // Atributo valor base por metro cuadrado
    private static final int VALOR_M2_CONJUNTO = 400;

    /* Constructor que llama al constructor de la clase padre - CasaUrbana
     * @param identificadorInmobiliario Parámetro heredado para identificar el inmueble
     * @param areaMetrosCuadrados Parámetro heredado para conocer el área total en m²
     * @param direccion Parámetro heredado para saber la dirección del inmueble
     * @param numeroHabitaciones Parámetro heredado para saber la cantidad de habitaciones
     * @param numeroBanios Parámetro heredado para saber la cantidad de baños
     * @param cantidadPisos Parámetro heredado para saber el número de pisos
     * @param VALOR_M2_CONJUNTO Párametro para saber el valor por metro cuadrado en el conjunto
     */
    public CasaIndependiente(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion,
                               int numeroHabitaciones, int numeroBanios, int cantidadPisos) {
        // Llama al constructor CasaUrbana
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion,
                numeroHabitaciones, numeroBanios, cantidadPisos);
    }

    // Implementación del métodos abstracto que define el valor por metro cuadrado
    @Override
    public int getValorMetroCuadrado() {
        // Retorna 400
        return VALOR_M2_CONJUNTO;
    }
    // Sobreescribe el métodos imprimir
    @Override
    public void imprimir() {
        // Imprime el título para la Casa en Conjunto Cerrado
        System.out.println("--- Casa Independiente ---");
        // Imprime datos de Casa Urbana
        super.imprimir();
    }
}