import java.io.*;
import java.net.*;


public class Client {

    public static void main(String[] args) throws Exception {

        String serverAddress = "127.0.0.1"; // direccion IP del servidor
        int serverPort = 12345; // puerto en el que el servidor escucha

        try{

            Socket clienSocket = new Socket(serverAddress, serverPort);

            // flujo de salida para enviar datos al servidor 

            PrintWriter out = new PrintWriter(clienSocket.getOutputStream(), true);

            // enviar un mensaje al servidor

            out.println("Hola servidor. Soy el Cliente");

            // cerrar conexiones

            out.close();
            clienSocket.close();

        }catch(IOException e){
            e.printStackTrace();
        }


    }
    
}
