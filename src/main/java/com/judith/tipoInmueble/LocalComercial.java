package com.judith.tipoInmueble;
/*
 * Autor: Judith Piedra
 * Fecha: 24/10/2025
 * Descripción: Esta clase denominada LocalComercial,
 * extiende de Local, que modela a los locales comerciales
 * con los siguientes atributos: centro comercial donde están ubicados
 */

// Clase Local comercial
public class LocalComercial extends Local {
    // Atributo específico de locales comerciales para saber donde está establecido
    protected String centroComercial;

    // Valor base por metro cuadrado
    private static final int VALOR_M2_COMERCIAL = 400;

    /*Constructor de la clase LocalComercial que llama a la clase padre Local
     * @param identificadorInmobiliario Parámetro que define al inmueble
     * @param areaEnMetrosCuadrados Parámetro que define el tamaño del inmueble
     * @param direccion Parámetro que define la dirección del inmueble
     * @param localizacion Parámetro que define si el local es interno o a la calle
     * @param centroComercial Parámetro que define el centro comercial donde están establecidos los locales comerciales
     */
    public LocalComercial(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion,
                          TipoLocal localizacion, String centroComercial) {
        // Llama al constructor de Local
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, localizacion);
        // Inicializa el centro comercial
        this.centroComercial = centroComercial;
    }

    // Implementación del métodos abstracto que define el valor por metro cuadrado
    @Override
    public int getValorMetroCuadrado() {
        // Retorna 400
        return VALOR_M2_COMERCIAL;
    }

    // Sobreescribe el métodos imprimir
    @Override
    public void imprimir() {
        // Imprime el título Local Comercial
        System.out.println("--- Local Comercial ---");
        // Imprime datos de Local
        super.imprimir();
        // Muestra el centro comercial
        System.out.println("Centro Comercial: " + centroComercial);
    }
}
