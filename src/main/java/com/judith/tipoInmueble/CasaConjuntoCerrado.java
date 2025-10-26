package com.judith.tipoInmueble;
/*
 * Autor: Judith Piedra
 * Fecha: 24/10/2025
 * Descripción: Esta clase denominada CasaConjuntoCerrado,
 * extiende a CasaUrbana y modela inmuebles para la vivienda que pueden ser familiares o estudios
 * con los siguiente atributos: valor de la administración y si incluyen o no áreas verdes comunes
 * como piscina y campos deportivos
 * también tiene el atributo valos por metro cuadrado
 */

//Clase Casa Urbana en conjunto cerrado
public class CasaConjuntoCerrado extends CasaUrbana {
    // Atributo Valor de la administración
    protected double valorAdministracion;
    // Atributo que indica si tiene piscinas
    protected boolean tienePiscina;
    // Atributo que indica si tiene campos deportivos
    protected boolean tieneCampoDeportivo;
    // Valor base por metro cuadrado
    private static final int VALOR_M2_CONJUNTO = 350;

    /* Constructor que llama al constructor de la clase padre - CasaUrbana
     * @param identificadorInmobiliario Parámetro heredado para identificar el inmueble
     * @param areaMetrosCuadrados Parámetro heredado para conocer el área total en m²
     * @param direccion Parámetro heredado para saber la dirección del inmueble
     * @param numeroHabitaciones Parámetro heredado para saber la cantidad de habitaciones
     * @param numeroBanios Parámetro heredado para saber la cantidad de baños
     * @param cantidadPisos Parámetro heredado para saber el número de pisos
     * @param valorAdministracion Parámetro propio para saber el valor de la administración del conjunto
     * @param tienePiscina Parámetro para saber si el conjunto cuenta con piscina
     * @param tieneCampoDeperotivo Parámetro para saber si el conjunto cuenta con campos deportivo
     * @param VALOR_M2_CONJUNTO Párametro para saber el valor por metro cuadrado en el conjunto
     */
    public CasaConjuntoCerrado(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion,
                               int numeroHabitaciones, int numeroBanios, int cantidadPisos,
                               double valorAdministracion, boolean tienePiscina, boolean tieneCampoDeportivo) {
        // Llama al constructor CasaUrbana
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion,
                numeroHabitaciones, numeroBanios, cantidadPisos);
        // Inicializa valor de administración
        this.valorAdministracion = valorAdministracion;
        // Inicializa si tiene piscina
        this.tienePiscina = tienePiscina;
        // Inicializa si tiene campo deportivo
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    // Implementación del métodos abstracto que define el valor por metro cuadrado
    @Override
    public int getValorMetroCuadrado() {
        // Retorna 350
        return VALOR_M2_CONJUNTO;
    }
    // Sobreescribe el métodos imprimir
    @Override
    public void imprimir() {
        // Imprime el título para la Casa en Conjunto Cerrado
        System.out.println("--- Casa en Conjunto Cerrado ---");
        // Imprime datos de Casa Urbana
        super.imprimir();
        // Muestra administración
        System.out.println("Valor administración: $" + valorAdministracion);
        // Muestra si incluye piscina
        System.out.println("Tiene Piscina: " + (tienePiscina ? "Sí" : "No"));
        // Muestra si incluye campo deportivo
        System.out.println("Tiene Campo Deportivo: " + (tieneCampoDeportivo ? "Sí" : "No"));
    }
}
