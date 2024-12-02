import java.util.Scanner;

public class Principal {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        ConsultaDeMoneda consulta = new ConsultaDeMoneda();
        int opcion = 0;
        while (opcion != 7){
            System.out.println("""
                    ////////////////   MENU PRINCIPAL   /////////////////
                    Bienvenido/a al conversor de Moneda. 
                    1. Dólar a Peso Colombiano
                    2. Peso Colombiano a Dolar
                    3. Dólar a Peso Argentino
                    4. Peso Argentino a Dolar
                    5. Dólar a Peso Brasileño
                    6. Peso Brasileño a Dolar
                    7. salir
                    """);
            System.out.print("Elija una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    ConversorDeMoneda.convertir("USD","COP",consulta,scanner);
                    break;
                case 2:
                    ConversorDeMoneda.convertir("COP","USD",consulta,scanner);
                    break;
                case 3:
                    ConversorDeMoneda.convertir("USD","ARS",consulta,scanner);
                    break;
                case 4:
                    ConversorDeMoneda.convertir("ARS","USD",consulta,scanner);
                    break;
                case 5:
                    ConversorDeMoneda.convertir("USD","BRL",consulta,scanner);
                    break;
                case 6:
                    ConversorDeMoneda.convertir("BRL","USD",consulta,scanner);
                    break;
                case 7:
                    System.out.println("saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intentar nuevamente.");
                    break;
            }
            System.out.println();
        }
    }
}
