import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {

        String serverAddress = "localhost"; // Dirección IP del servidor
        int serverPort = 12345; // Puerto en el que el servidor escucha

        try {
            Socket socket = new Socket(serverAddress, serverPort);

            // Flujos de entrada y salida para enviar y recibir datos al/del servidor
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

            String userInput;
            while ((userInput = consoleInput.readLine()) != null) {
                // Recibir y mostrar la respuesta del servidor
                String serverResponse = in.readLine();
                System.out.println("Respuesta del servidor: " + serverResponse);

                // Enviar la entrada del usuario al servidor
                out.println(userInput);
            }

            // Cierra conexiones
            in.close();
            out.close();
            consoleInput.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}