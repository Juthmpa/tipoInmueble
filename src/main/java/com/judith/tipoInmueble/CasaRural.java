package com.judith.tipoInmueble;
/*
 * Autor: Judith Piedra
 * Fecha: 24/10/2025
 * Descripción: Esta clase denominada CasaRural,
 * extiende a casa y modela casas rurales
 * con los siguientes atributos: distancia a la capital,
 * altitud sobre el nivel del mar y el valor del inmueble
 * también tiene el atributo valor por metro cuadrado
 */

// Clase Casa Rural
public class CasaRural extends Casa {
    // Atributo que da la distancia a la capital en km
    protected double distanciaCapital;
    // Atributo que da la altitud sobre el nivel del mar en metros
    protected double altitudSNM;
    // Valor base por metro cuadrado para Casa Rural
    private static final int VALOR_M2_RURAL = 200;

    /* Constructor que llama al constructor de la clase padre - Casa
     * @param identificadorInmobiliario Parámetro heredado para identificar el inmueble
     * @param areaMetrosCuadrados Parámetro heredado para conocer el área total en m²
     * @param direccion Parámetro heredado para saber la dirección del inmueble
     * @param numeroHabitaciones Parámetro heredado para saber la cantidad de habitaciones
     * @param numeroBanios Parámetro heredado para saber la cantidad de baños
     * @param cantidadPisos Parámetro heredado para saber el número de pisos
     * @param distanciaCapital Parámetro que define la distancia que hay a la capital desde la casa rural
     * @param altitudSNM Parámetro que define la altitud sobre el nivel del mar donde se encuentra la casa rural
     * @param VALOR_M2_CONJUNTO Párametro para saber el valor por metro cuadrado en el conjunto
     */
    public CasaRural(int identificadorInmobiliario, double areaMetrosCuadrados, String direccion,
                     int numeroHabitaciones, int numeroBanios, int cantidadPisos,
                     double distanciaCapital, double altitudSNM) {
        // Llama al constructor Casa
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion,
                numeroHabitaciones, numeroBanios, cantidadPisos);
        // Inicializa distancia
        this.distanciaCapital = distanciaCapital;
        // Inicializa altitud
        this.altitudSNM = altitudSNM;
    }

    // Implementación del métodos abstracto que define el valor por metro cuadrado
    @Override
    public int getValorMetroCuadrado() {
        // Retorna 200
        return VALOR_M2_RURAL;
    }

    // Sobreescribe el métodos imprimir
    @Override
    public void imprimir() {
        // Imprime título identificador
        System.out.println("--- Casa Rural ---");
        // Imprime datos de Casa
        super.imprimir();
        // Muestra distancia
        System.out.println("Distancia a la capital (km): " + distanciaCapital);
        // Muestra altitud
        System.out.println("Altitud (m.s.n.m): " + altitudSNM);
    }
}
