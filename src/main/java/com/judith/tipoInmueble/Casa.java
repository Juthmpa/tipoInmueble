package com.judith.tipoInmueble;
/*
 * Autor: Judith Piedra
 * Fecha: 24/10/2025
 * Descripción: Esta clase denominada Casa,
 * extiende a InmuebleVivienda y modela casas para la vivienda pueden ser urbanas o rurales
 * con el siguiente atributo común para casas: cantidad de pisos
 */
// Clase Casa
public abstract class Casa extends InmuebleVivienda {
    // Atributo que indica la cantidad de pisos que posee la casa
    protected int cantidadPisos;

    /* Constructor que llama al constructor de la clase padre - InmuebleVivienda
     * @param identificadorInmobiliario Parámetro heredado para identificar el inmueble
     * @param areaMetrosCuadrados Parámetro heredado para conocer el área total en m²
     * @param direccion Parámetro heredado para saber la dirección del inmueble
     * @param numeroHabitaciones Parámetro heredado para saber la cantidad de habitaciones
     * @param numeroBanios Parámetro heredado para saber la cantidad de baños
     * @param cantidadPisos Parámetro que define el número de pisos de las casas
     */
    public Casa(int identificadorInmobiliario, double areaMetrosCuadrados, String direccion,
                int numeroHabitaciones, int numeroBanios, int cantidadPisos) {
        // Llama al constructor de InmuebleVivienda
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numeroHabitaciones, numeroBanios);
        // Inicializa la cantidad de pisos
        this.cantidadPisos = cantidadPisos;
    }

    // Sobreescribe el métodos imprimir para incluir la cantidad de pisos
    @Override
    public void imprimir() {
        // Llama al métodos imprimir de Vivienda
        super.imprimir();
        // Muestra la cantidad de pisos
        System.out.println("Cantidad de pisos: " + cantidadPisos);
    }
}
