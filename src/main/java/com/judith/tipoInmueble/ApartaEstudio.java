package com.judith.tipoInmueble;
/*
 * Autor: Judith Piedra
 * Fecha: 24/10/2025
 * Descripción: Esta clase denominada ApartaEstudio,
 * extiende a Departamento y modela inmuebles para la vivienda que son apartaestudios
 * con los siguientes atributos: tiene una sola habitación y un baño
 */

public class ApartaEstudio extends Departamento {
    // Un apartaestudio tiene una sola habitación y por lógica sería un solo baño

    // Valor base por metro cuadrado
    private static final int VALOR_M2_APARTAESTUDIO = 200;

    // Constructor
    public ApartaEstudio(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion,
                         double valorAdministracion) {
        // Los apartaestudios siempre tienen 1 habitación, según el enunciado
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, 1, 1, valorAdministracion);
    }

    // Implementación del valor por metro cuadrado
    @Override
    public int getValorMetroCuadrado() {
        // Retorna 200
        return VALOR_M2_APARTAESTUDIO;
    }

    // Sobreescribe el métodos imprimir
    @Override
    public void imprimir() {
        // Imprime el título ApartaEstudio y específica que tiene una habitación
        System.out.println("--- Apartaestudio (1 Habitación) ---");
        /* Aseguramos que la restricción de 1 habitación se muestre correctamente
         * si se usara el imprimir del padre
         */
        super.imprimir();
    }
}