package cuentas;
/**
 * Clase Principal: Empieza el proyecto
 * @author MCPRO
 * @version (versión del programa)
 * @since fecha de realización del proyecto 22/02/2024
 */


public class Main {

    public static void main(String[] args) {
        operativa_cuenta(5000);
    }
    /**
     * 
     * 
     * @param CANTIDAD No lo usamos para nada. 
     */

    public static void operativa_cuenta(float CANTIDAD) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
