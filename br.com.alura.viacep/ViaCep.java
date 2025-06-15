import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class ViaCep {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        Endereco endereco = new Endereco();

        
        System.out.println("****************************");
        System.out.println("*******Consulte um CEP******");
        System.out.println("Digite um número de CEP: ");
        String cep = scan.nextLine();
        endereco.setCep(cep);
        System.out.println("****************************");

        try{
            String json = response.body();
            if (!cep.matches("\\d{8}")) {
                System.out.println("CEP inválido: deve conter exatamente 8 dígitos numéricos.");
            } else if (response.statusCode() == 404) {
                System.out.println("CEP não encontrado.");
            }

            String link = "https://viacep.com.br/ws/" + cep + "/json/";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(link))
                    .build();
   
            HttpResponse<String> response = client
                    .send(request, BodyHandlers.ofString());

            
            Gson gson = new Gson();
            endereco = gson.fromJson(json, Endereco.class);
            System.out.println(endereco);

            //Gson gson = new GsonBuilder().setPrettyPrinting().create();
            //String json = gson.toJson(endereco);
            //System.out.println(json);

            if (!cep.matches("\\d{8}")) {
                System.out.println("CEP inválido: deve conter exatamente 8 dígitos numéricos.");
            } else if (response.statusCode() == 404) {
                System.out.println("CEP não encontrado.");
            }

            
        } catch(IllegalArgumentException e) {
                System.out.println("CEP inválido: não pode ser alfanumérico.");
        } catch(IllegalStateException e) {
            System.out.println("CEP inválido: deve conter 8 dígitos.");
        } catch(JsonSyntaxException e) {
            System.out.println("CEP inválido: não pode ter espaço entre os dígitos.");
        }

        System.out.println("Finalizado com sucesso!");

        scan.close();

    }
}
