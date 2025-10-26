package com.judith.tipoInmueble;
/*
 * Autor: Judith Piedra
 * Fecha: 24/10/2025
 * Descripción: Esta clase denominada TipoLocal,
 * modela a los locales para oficinas que dan a la calle o son internos
 * con los siguientes atributos constantes: interno o que da a la calle
 * y un atributo privado denominado descripción
 */

// Definición de la enumeración para la localización del local
public enum TipoLocal {

    // Declaración de las constantes de enumeración, incluyendo un valor descriptivo
    // El local se encuentra dentro de un edificio
    INTERNO("Interno"),
    // El local tiene acceso directo a la vía pública
    EXTERNO_CALLE("Da a la calle");

    // Atributo privado para almacenar la descripción
    private final String descripcion;

    /* Constructor privado para inicializar la descripción de cada constante
     * @param descripcion Parámetro que almacena la ubicación del local
     */
    TipoLocal(String descripcion) {
        // Inicializa descripción
        this.descripcion = descripcion;
    }

    // Métodos público getter para obtener la descripción legible
    public String getDescripcion() {
        // Devuelve "Interno" o "Da a la calle"
        return descripcion;
    }
}
