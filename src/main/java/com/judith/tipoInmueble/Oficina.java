package com.judith.tipoInmueble;
/*
 * Autor: Judith Piedra
 * Fecha: 24/10/2025
 * Descripción: Esta clase denominada Oficina,
 * extiende de Local, que modela a los locales para oficinas
 * con los siguientes atributos: si es un local de gobierno o no
 */

//Clase Oficina
public class Oficina extends Local {
    // Atributo para determinar si es del gobierno o no
    protected boolean esDelGobierno;

    // Valor base por metro cuadrado
    private static final int VALOR_M2_OFICINAS = 450;

    /*Constructor de la clase Oficina que llama a la clase padre Local
     * @param identificadorInmobiliario Parámetro que define al inmueble
     * @param areaEnMetrosCuadrados Parámetro que define el tamaño del inmueble
     * @param direccion Parámetro que define la dirección del inmueble
     * @param localizacion Parámetro que define si el local es interno o a la calle
     * @param esDelGobierno Parámetro que define si la oficina pertenece o no al gobierno
     */
    public Oficina(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion,
                   TipoLocal localizacion, boolean esDelGobierno) {
        // Llama al constructor de Local
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, localizacion);
        // Inicializa si es del gobierno
        this.esDelGobierno = esDelGobierno;
    }

    // Implementación del métodos abstracto que define el valor por metro cuadrado
    @Override
    public int getValorMetroCuadrado() {
        // Retorna 450
        return VALOR_M2_OFICINAS;
    }

    // Sobreescribe el métodos imprimir
    @Override
    public void imprimir() {
        // Imprime el título Oficina
        System.out.println("--- Oficina ---");
        // Imprime datos de Local
        super.imprimir();
        // Muestra si es del gobierno de forma legible
        System.out.println("Es del Gobierno: " + (esDelGobierno ? "Sí" : "No"));
    }
}
