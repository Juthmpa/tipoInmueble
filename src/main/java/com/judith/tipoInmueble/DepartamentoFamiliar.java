package com.judith.tipoInmueble;
/*
 * Autor: Judith Piedra
 * Fecha: 24/10/2025
 * Descripción: Esta clase denominada DepartamentoFamiliar,
 * extiende a Departamento y modela inmuebles para la vivienda que son familiares
 * no tiene atributos propios en la descripción
 */

// Clase Departamento Familiar
public class DepartamentoFamiliar extends Departamento {
    // No tiene atributos adicionales específicos.

    // Valor base por metro cuadrado
    private static final int VALOR_M2_FAMILIAR = 300;

    /* Constructor que llama al constructor de la clase padre - InmuebleVivienda
     * @param identificadorInmobiliario Parámetro heredado para identificar el inmueble
     * @param areaMetrosCuadrados Parámetro heredado para conocer el área total en m²
     * @param direccion Parámetro heredado para saber la dirección del inmueble
     * @param numeroHabitaciones Parámetro que define el número de habitaciones
     * @param numeroBanios Parámetro que define el número de baños
     * @param valorAdministracion Parámetro que define el valor de administración a pagar en los departamentos
     */
    public DepartamentoFamiliar(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion,
                                int numeroHabitaciones, int numeroBanios, double valorAdministracion) {
        // Llama al constructor Departamento
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion,
                numeroHabitaciones, numeroBanios, valorAdministracion);
    }

    // Implementación del valor por metro cuadrado
    @Override
    public int getValorMetroCuadrado() {
        return VALOR_M2_FAMILIAR; // Retorna 300 [7]
    }

    // Sobreescribe el métodos imprimir para incluir información de departamentoFamiliar
    @Override
    public void imprimir() {
        //Imprime el título Departamento Familiar
        System.out.println("--- Departamento Familiar ---");
        // Imprime datos de Departamento
        super.imprimir();
    }
}
