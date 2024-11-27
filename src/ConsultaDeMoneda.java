import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDeMoneda {
    public Monedas buscaMoneda(String moneda) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/567811e54b13185534dd5bdd/latest/" + moneda);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/567811e54b13185534dd5bdd/latest/" + moneda))
                .build();
        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        }catch (IllegalStateException e){
            throw new RuntimeException("NO escribdffkasdlksjdfñlkaf");
        }catch (NullPointerException e) {
            throw new RuntimeException("NO escribdffkasdlksjdfñlkaf");
        } catch (Exception e) {
            throw new RuntimeException("No encontré esa pelicula.");
        }

    }


}
