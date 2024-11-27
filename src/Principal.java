import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args)  {

        ConsultaDeMoneda consulta = new ConsultaDeMoneda();
        Monedas moneda = consulta.buscaMoneda("123");

        try {
            System.out.println(moneda);
        }catch (IllegalStateException e){
            System.out.println("No escribir numeros, solo Currency Code  en letras");
        }catch (NullPointerException e){
            System.out.println("Currency Code equivocado, escribir nuevamente de forma correctamente");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Fnializando la aplicacion");
        }

        /*
         Acceso a las propiedades del objeto
        System.out.println("Base Code: " + moneda.base_code());
        System.out.println("Tasa de COP: " + moneda.conversion_rates().get("COP"));
        System.out.println("Tasa de EUR: " + moneda.conversion_rates().get("EUR"));
        System.out.println("Tasa de BRL: " + moneda.conversion_rates().get("BRL"));
        System.out.println("Tasa de ARS: " + moneda.conversion_rates().get("ARS"));
        */



    }
}
