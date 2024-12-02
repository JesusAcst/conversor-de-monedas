import java.util.Scanner;

public class ConversorDeMoneda {

    public static void convertir(String monedaBase, String monedaTarget, ConsultaDeMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);

        System.out.println("-----------------------------------------");
        System.out.print("Ingrese la cantidad de " + monedaBase+" que desea convertir: ");
        cantidad = lectura.nextDouble();

        cantidadConvertida = cantidad * monedas.conversion_rate();

        System.out.println("-----------------------------------------");
        System.out.println("El valor "+cantidad+" "+ monedaBase +" = " +cantidadConvertida + " " + monedas.target_code());
        System.out.println("-----------------------------------------");
    }
}
