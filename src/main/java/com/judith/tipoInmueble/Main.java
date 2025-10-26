package com.judith.tipoInmueble;

// Importa la clase para manejar la excepción de tipo de dato incorrecto
import java.util.InputMismatchException;
// Importa la clase Scanner para la entrada de datos por consola
import java.util.Scanner;

/*
 * Autor: Judith Piedra
 * Fecha: 25/10/2025
 * Descripción: Clase principal con menú interactivo
 * para registrar distintos tipos de inmuebles y calcular su valor total.
 */

// Declaración de la clase principal
public class Main {

    // Métodos principal de ejecución del programa
    public static void main(String[] args) {

        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Variable booleana para controlar el bucle principal
        boolean continuar = true;

        // Imprime una línea decorativa
        System.out.println("==============================================");
        // Imprime el título del programa con una bienvenida
        System.out.println("BIENVENIDO AL PROGRAMA DE TIPOS DE INMUEBLES");
        // Imprime una línea decorativa y un salto de línea
        System.out.println("==============================================\n");

        // Bucle principal para permitir el registro de múltiples inmuebles.
        while (continuar) {
            // Inicio del bloque try-catch para manejar posibles errores de entrada
            try {
                // Muestra la pregunta principal al usuario para saber el tipo de inmueble que busca
                System.out.println("\n¿Qué tipo de inmueble busca?");
                // Muestra la opción 1: Vivienda
                System.out.println("1. Vivienda");
                // Muestra la opción 2: Local
                System.out.println("2. Local");
                // Muestra la opción 3: Salir del programa
                System.out.println("3. Salir");
                // Pide al usuario que seleccione una opción
                System.out.print("Seleccione una opción: ");
                // Lee la opción principal seleccionada
                int opcionPrincipal = scanner.nextInt();
                // Elimina el salto de línea pendiente del nextInt() para evitar que lea el siguiente scanner y espere su entrada
                scanner.nextLine(); // limpiar buffer

                // Verifica si el usuario quiere salir
                if (opcionPrincipal == 3) {
                    // Muestra mensaje de despedida
                    System.out.println("Gracias por usar el sistema. ¡Hasta pronto!");
                    // Sale del bucle while
                    break;
                }

                // Sección para ingresar atributos generales del inmueble
                // Pide el identificador inmobiliario
                System.out.print("Ingrese el identificador inmobiliario: ");
                // Lee el identificador.
                int id = scanner.nextInt();
                // Pide el área en metros cuadrados
                System.out.print("Ingrese el área en metros cuadrados: ");
                // Lee el área
                int area = scanner.nextInt();
                // Limpia el buffer de entrada para la siguiente lectura de String
                scanner.nextLine(); // limpiar buffer
                // Pide la dirección
                System.out.print("Ingrese la dirección del inmueble: ");
                // Lee la dirección
                String direccion = scanner.nextLine();

                // Variable para almacenar el cálculo centralizado del valor total
                double valorTotal = 0.0; // cálculo centralizado
                // Objeto de tipo Inmueble se aplica polimorfismo
                Inmueble inmueble = null;

                // Si la opción principal es 1 - Vivienda
                if (opcionPrincipal == 1) {
                    // Lógica para Vivienda
                    // Muestra el submenú de tipos de vivienda
                    System.out.println("\n¿Qué tipo de vivienda busca?");
                    // Muestra la opción 1: Casa
                    System.out.println("1. Casa");
                    // Muestra la opción 2: Departamento
                    System.out.println("2. Departamento");
                    // Pide al usuario que seleccione una opción
                    System.out.print("Seleccione una opción: ");
                    // Lee el tipo de vivienda
                    int tipoVivienda = scanner.nextInt();
                    // Consume el salto de línea pendiente
                    scanner.nextLine(); // limpiar buffer

                    // Si la subopción es 1 - Casa
                    if (tipoVivienda == 1) {
                        // Lógica para Casa
                        // Pide el número de habitaciones
                        System.out.print("Ingrese el número de habitaciones: ");
                        // Lee las habitaciones
                        int habitaciones = scanner.nextInt();
                        // Pide el número de baños
                        System.out.print("Ingrese el número de baños: ");
                        // Lee los baños
                        int banios = scanner.nextInt();
                        // Pide la cantidad de pisos
                        System.out.print("Ingrese la cantidad de pisos: ");
                        // Lee la cantidad de pisos
                        int pisos = scanner.nextInt();

                        // Muestra el submenú de ubicación de la Casa
                        System.out.println("\n¿Dónde se ubica la casa?");
                        // Muestra la opción 1: Rural
                        System.out.println("1. Rural");
                        // Muestra la opción 2: Urbana
                        System.out.println("2. Urbana");
                        // Pide la selección
                        System.out.print("Seleccione una opción: ");
                        // Lee el tipo de ubicación de casa
                        int tipoCasa = scanner.nextInt();

                        // Si el tipo de casa es 1 - Rural
                        if (tipoCasa == 1) {
                            // Lógica para Casa Rural
                            // Pide la distancia a la capital
                            System.out.print("Ingrese la distancia a la capital (km): ");
                            // Lee la distancia
                            double distancia = scanner.nextDouble();
                            // Pide la altitud
                            System.out.print("Ingrese la altitud sobre el nivel del mar (m): ");
                            // Lee la altitud
                            double altitud = scanner.nextDouble();

                            // Crea una nueva instancia de CasaRural
                            inmueble = new CasaRural(id, area, direccion, habitaciones, banios, pisos, distancia, altitud);
                            // Cálculo centralizado
                            valorTotal = inmueble.calcularValorCompra();

                            // Si el tipo de casa es 2 - Urbana
                        } else if (tipoCasa == 2) {
                            // Muestra el submenú de tipos de Casa Urbana
                            System.out.println("\n¿Qué tipo de casa urbana busca?");
                            // Muestra la opción 1: Conjunto cerrado
                            System.out.println("1. Conjunto cerrado");
                            // Muestra la opción 2: Independiente
                            System.out.println("2. Independiente");
                            // Pide la selección
                            System.out.print("Seleccione una opción: ");
                            // Lee el tipo de casa urbana
                            int tipoUrbana = scanner.nextInt();

                            // Si el tipo es 1 - Casa en Conjunto Cerrado
                            if (tipoUrbana == 1) {
                                // Pide el valor de la administración
                                System.out.print("Ingrese el valor de la administración: ");
                                // Lee el valor de administración
                                double valorAdmin = scanner.nextDouble();

                                // Llama a una función auxiliar para preguntar si tiene piscina
                                boolean piscina = preguntarSiNo(scanner, "¿Tiene piscina?");
                                // Llama a una función auxiliar para preguntar si tiene campo deportivo
                                boolean campoDeportivo = preguntarSiNo(scanner, "¿Tiene campo deportivo?");

                                // Crea una nueva instancia de CasaConjuntoCerrado
                                inmueble = new CasaConjuntoCerrado(id, area, direccion, habitaciones, banios, pisos,
                                        valorAdmin, piscina, campoDeportivo);
                                // Cálculo centralizado
                                valorTotal = inmueble.calcularValorCompra();

                                // Si el tipo es 2 - Casa Independiente
                            } else if (tipoUrbana == 2) {
                                // Crea una nueva instancia de CasaIndependiente
                                inmueble = new CasaIndependiente(id, area, direccion, habitaciones, banios, pisos);
                                // Cálculo centralizado
                                valorTotal = inmueble.calcularValorCompra();
                                // Si la opción no es válida
                            } else {
                                // Muestra un mensaje de error
                                System.out.println(" Opción no válida. Regresando al menú principal...");
                                // Vuelve al inicio del bucle while
                                continue;
                            }
                        }

                        // Si la subopción de vivienda es 2 - Departamento
                    } else if (tipoVivienda == 2) {
                        // Muestra el submenú de tipos de Departamento
                        System.out.println("\n¿Qué tipo de departamento busca?");
                        // Muestra la opción 1: Familiar
                        System.out.println("1. Familiar");
                        // Muestra la opción 2: Apartaestudio
                        System.out.println("2. Apartaestudio");
                        // Pide la selección.
                        System.out.print("Seleccione una opción: ");
                        // Lee el tipo de departamento
                        int tipoDepto = scanner.nextInt();

                        // Si el tipo es 1 - Departamento Familiar
                        if (tipoDepto == 1) {
                            // Pide el número de habitaciones
                            System.out.print("Ingrese el número de habitaciones: ");
                            // Lee las habitaciones
                            int habitaciones = scanner.nextInt();
                            // Pide el número de baños
                            System.out.print("Ingrese el número de baños: ");
                            // Lee los baños
                            int banios = scanner.nextInt();
                            // Pide el valor de la administración
                            System.out.print("Ingrese el valor de la administración: ");
                            // Lee el valor de administración
                            double valorAdmin = scanner.nextDouble();

                            // Crea una nueva instancia de DepartamentoFamiliar
                            inmueble = new DepartamentoFamiliar(id, area, direccion, habitaciones, banios, valorAdmin);
                            // Cálculo centralizado
                            valorTotal = inmueble.calcularValorCompra();

                            // Si el tipo es 2 - Apartaestudio
                        } else if (tipoDepto == 2) {
                            // Pide el valor de la administración
                            System.out.print("Ingrese el valor de la administración: ");
                            // Lee el valor de administración
                            double valorAdmin = scanner.nextDouble();

                            // Crea una nueva instancia de ApartaEstudio
                            inmueble = new ApartaEstudio(id, area, direccion, valorAdmin);
                            // Cálculo centralizado
                            valorTotal = inmueble.calcularValorCompra();
                            // Si la opción no es válida
                        } else {
                            // Muestra un mensaje de error
                            System.out.println(" Opción no válida. Regresando al menú principal...");
                            // Vuelve al inicio del bucle while
                            continue;
                        }
                    }

                    // Si la opción principal es 2 - Local
                } else if (opcionPrincipal == 2) {
                    // Lógica para Local
                    // Muestra el submenú de tipos de Local
                    System.out.println("\n¿Qué tipo de local busca?");
                    // Muestra la opción 1: Comercial
                    System.out.println("1. Comercial");
                    // Muestra la opción 2: Oficina.
                    System.out.println("2. Oficina");
                    // Pide la selección
                    System.out.print("Seleccione una opción: ");
                    // Lee el tipo de local
                    int tipoLocal = scanner.nextInt();
                    // Consume el salto de línea pendiente
                    scanner.nextLine();

                    // Determina si el local es EXTERNO_CALLE o INTERNO usando la función auxiliar
                    TipoLocal localizacion = (preguntarSiNo(scanner, "¿El local da a la calle?"))
                            ? TipoLocal.EXTERNO_CALLE : TipoLocal.INTERNO;

                    // Si el tipo de local es 1 - Comercial
                    if (tipoLocal == 1) {
                        // Pide el nombre del centro comercial
                        System.out.print("Ingrese el nombre del centro comercial: ");
                        // Lee el nombre
                        String centroComercial = scanner.nextLine();

                        // Crea una nueva instancia de LocalComercial
                        inmueble = new LocalComercial(id, area, direccion, localizacion, centroComercial);
                        // Cálculo centralizado
                        valorTotal = inmueble.calcularValorCompra();

                        // Si el tipo de local es 2 - Oficina
                    } else if (tipoLocal == 2) {
                        // Pregunta si es una oficina de gobierno usando la función auxiliar
                        boolean esGob = preguntarSiNo(scanner, "¿Es una oficina del gobierno?");
                        // Crea una nueva instancia de Oficina
                        inmueble = new Oficina(id, area, direccion, localizacion, esGob);
                        // Cálculo centralizado
                        valorTotal = inmueble.calcularValorCompra();
                        // Si la opción no es válida
                    } else {
                        // Muestra un mensaje de error
                        System.out.println(" Opción no válida. Regresando al menú principal...");
                        // Vuelve al inicio del bucle while
                        continue;
                    }
                    // Si la opción principal no es 1, 2 o 3
                } else {
                    // Muestra un mensaje de error
                    System.out.println(" Opción no válida. Intente de nuevo.");
                    // Vuelve al inicio del bucle while
                    continue;
                }

                // Sección para mostrar los resultados finales
                // Verifica si se creó un objeto inmueble
                if (inmueble != null) {
                    // Imprime una línea decorativa
                    System.out.println("\n==============================================");
                    // Llama al métodos imprimir del objeto inmueble aplicando polimorfismo
                    inmueble.imprimir();
                    // Imprime el valor total con formato de dos decimales
                    System.out.printf("Valor total del inmueble: $%.2f%n", valorTotal);
                    // Imprime una línea decorativa y un salto de línea
                    System.out.println("==============================================\n");
                }

                // Llama a la función auxiliar para preguntar si desea continuar
                continuar = preguntarSiNo(scanner, "¿Desea registrar otro inmueble?");

                // Captura la excepción si el usuario ingresa un valor no numérico donde se espera un número
            } catch (InputMismatchException e) {
                // Muestra un mensaje de error
                System.out.println(" Error: Debe ingresar un valor numérico válido.");
                // Limpia el buffer de entrada para evitar un bucle infinito
                scanner.nextLine();
            }
        }

        // Cierra el objeto Scanner para liberar recursos
        scanner.close();
    }

    // Métodos auxiliar estático para hacer preguntas de Sí/No.
    private static boolean preguntarSiNo(Scanner scanner, String mensaje) {
        // Bucle infinito hasta que se ingrese una respuesta válida
        while (true) {
            // Muestra el mensaje y las opciones de respuesta
            System.out.print(mensaje + " (1. Sí / 2. No): ");
            // Lee la respuesta numérica
            int respuesta = scanner.nextInt();
            // Si la respuesta es 1, retorna true - Sí
            if (respuesta == 1) return true;
                // Si la respuesta es 2, retorna false - No
            else if (respuesta == 2) return false;
                // Si la respuesta no es 1 ni 2
            else System.out.println(" Valor inválido. Ingrese 1 para Sí o 2 para No.");
        }
    }
}