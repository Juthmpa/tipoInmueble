package com.judith.tipoInmueble;
/*
 * Autor: Judith Piedra
 * Fecha: 24/10/2025
 * Descripción: Esta clase denominada Departamento,
 * extiende a InmuebleVivienda y modela inmuebles para la vivienda que pueden ser familiares o apartaestudios
 * con los siguientes atributos: administración
 */

// Clase Departamento
public abstract class Departamento extends InmuebleVivienda {
    // Atributo específico valor de administración que pagan los departamentos
    protected double valorAdministracion;

    /* Constructor que llama al constructor de la clase padre - InmuebleVivienda
     * @param identificadorInmobiliario Parámetro heredado para identificar el inmueble
     * @param areaMetrosCuadrados Parámetro heredado para conocer el área total en m²
     * @param direccion Parámetro heredado para saber la dirección del inmueble
     * @param numeroHabitaciones Parámetro que define el número de habitaciones
     * @param numeroBanios Parámetro que define el número de baños
     * @param valorAdministracion Parámetro que define el valor de administración a pagar en los departamentos
     */
    public Departamento(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion,
                        int numeroHabitaciones, int numeroBanios, double valorAdministracion) {
        // Llama al constructor InmuebleVivienda
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion,
                numeroHabitaciones, numeroBanios);
        // Inicializa el valor de administración
        this.valorAdministracion = valorAdministracion;
    }

    // Sobreescribe el métodos imprimir para incluir información de departamento
    @Override
    public void imprimir() {
        // Imprime el título Departamento
        System.out.println("--- Departamento ---");
        // Imprime datos de Vivienda
        super.imprimir();
        // Muestra administración
        System.out.println("Valor administración: $" + valorAdministracion);
    }

    // El métodos getValorMetroCuadrado() permanece abstracto aquí.
}