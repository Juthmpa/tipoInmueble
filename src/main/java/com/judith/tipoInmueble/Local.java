package com.judith.tipoInmueble;
/*
 * Autor: Judith Piedra
 * Fecha: 24/10/2025
 * Descripción: Esta clase denominada Local,
 * extiende de Inmueble, que modela a los locales
 * con los siguientes atributos: localización si es interna o a la calle
 */

// Clase Local
public abstract class Local extends Inmueble {
    // Atributo localización interna o a la calle, que es específico de los locales
    // Se utiliza enumeración
    protected TipoLocal localizacion;

    /*Constructor de la clase Local que llama a la clase padre Inmueble
     * @param identificadorInmobiliario Parámetro que define al inmueble
     * @param areaEnMetrosCuadrados Parámetro que define el tamaño del inmueble
     * @param direccion Parámetro que define la dirección del inmueble
     * @param localizacion Parámetro que define si el local es interno o a la calle
     */
    public Local(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, TipoLocal localizacion) {
        // Llama al constructor de Inmueble
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion);
        // Inicializa la localización usando Enum
        this.localizacion = localizacion;
    }

    // Sobreescribe el métodos imprimir
    @Override
    public void imprimir() {
        // Imprime datos de Inmueble
        super.imprimir();
        // Muestra la localización usando el métodos getter del Enum
        System.out.println("Localización: " + localizacion.getDescripcion());
    }

    // El métodos getValorMetroCuadrado() permanece abstracto aquí
    public abstract int getValorMetroCuadrado();
}
