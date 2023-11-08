import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        
        int portNumber = 12345; // Puerto en el que el servidor escuchara

        try{
            ServerSocket serverSocket = new ServerSocket(portNumber);
            System.out.println("Esperando la conexion del cliente en el puerto " +portNumber + "...");

            Socket clientSocket = serverSocket.accept();

            System.out.println("Cliente conectado desde: " + clientSocket.getInetAddress());

            // flujo de entrada para recibir datos del cliente

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // leer el mensaje del cliente

            String clientMessage = in.readLine();

            System.out.println("Mensaje del cliente: " + clientMessage);

            // cerrar conexiones

            in.close();
            clientSocket.close();
            serverSocket.close();

        }catch(IOException e){
            e.printStackTrace();
        }


    }
}
