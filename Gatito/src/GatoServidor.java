import java.io.*;
import java.net.*;

public class GatoServidor {
    public static void main(String[] args) throws Exception {

        int portNumber = 12345;

        try {
            ServerSocket serverSocket = new ServerSocket(portNumber);
            System.out.println("Esperando la conexion del Jugador 1 en el puerto " + portNumber + "...");

            Socket jugador1Socket = serverSocket.accept();
            System.out.println("Jugador 1 conectado desde: " + jugador1Socket.getInetAddress());

            // Flujo de entrada y salida para recibir datos del Jugador 1
            BufferedReader jugador1In = new BufferedReader(new InputStreamReader(jugador1Socket.getInputStream()));
            PrintWriter jugador1Out = new PrintWriter(jugador1Socket.getOutputStream(), true);

            jugador1Out.println("Conectado como Jugador 1");

            Socket jugador2Socket = serverSocket.accept();
            System.out.println("Jugador 2 conectado desde: " + jugador2Socket.getInetAddress());

            // Flujo de entrada y salida para recibir datos del Jugador 2
            BufferedReader jugador2In = new BufferedReader(new InputStreamReader(jugador2Socket.getInputStream()));
            PrintWriter jugador2Out = new PrintWriter(jugador2Socket.getOutputStream(), true);

            jugador2Out.println("Conectado como Jugador 2");

            char[][] tablero = new char[3][3];
            inicializarTablero(tablero);

            while (true) {
                // Turno del Jugador 1
                realizarMovimiento(tablero, jugador1In, jugador1Out, 'X');
                enviarTablero(jugador1Out, tablero);
    
                // Verifica si el Jugador 1 ganó o si hay un empate
                if (verificarGanador(tablero, 'X')) {
                    mostrarTablero(tablero);
                    jugador1Out.println("¡Felicidades, eres el ganador!");
                    jugador2Out.println("Lo siento, el Jugador 1 ha ganado.");
                    break;
                }
    
                if (tableroCompleto(tablero)) {
                    mostrarTablero(tablero);
                    jugador1Out.println("Juego terminado en empate");
                    jugador2Out.println("Juego terminado en empate");
                    break;
                }
    
                // Turno del Jugador 2
                realizarMovimiento(tablero, jugador2In, jugador2Out, 'O');
                enviarTablero(jugador2Out, tablero);
    
                // Verifica si el Jugador 2 ganó o si hay un empate
                if (verificarGanador(tablero, 'O')) {
                    mostrarTablero(tablero);
                    jugador2Out.println("¡Felicidades, eres el ganador!");
                    jugador1Out.println("Lo siento, el Jugador 2 ha ganado.");
                    break;
                }
            }

            // Cierra los recursos
            jugador1In.close();
            jugador1Out.close();
            jugador2In.close();
            jugador2Out.close();
            jugador1Socket.close();
            jugador2Socket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void enviarTablero(PrintWriter out, char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                out.print(tablero[i][j] + " ");
            }
            out.println();
        }
    }

    public static void realizarMovimiento(char[][] tablero, BufferedReader in, PrintWriter out, char jugador) throws IOException {
        out.println("Turno del Jugador " + jugador + ". Ingresa la fila y columna (ejemplo: 1 2):");
        mostrarTablero(tablero);

        String entrada = in.readLine();
        String[] coordenadas = entrada.split(" ");
        int fila = Integer.parseInt(coordenadas[0]);
        int columna = Integer.parseInt(coordenadas[1]);

        char disponible = ' ';

        if (tablero[fila][columna] == disponible) {
            tablero[fila][columna] = jugador;
        } else {
            out.println("La casilla ya está ocupada. Inténtalo de nuevo");
            realizarMovimiento(tablero, in, out, jugador);
        }
    }

    public static boolean tableroCompleto(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean verificarGanador(char[][] tablero, char c) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == c && tablero[i][1] == c && tablero[i][2] == c) {
                return true; // Verifica filas
            }
            if (tablero[0][i] == c && tablero[1][i] == c && tablero[2][i] == c) {
                return true; // Verifica columnas
            }
        }
        if (tablero[0][0] == c && tablero[1][1] == c && tablero[2][2] == c) {
            return true; // Verifica diagonal principal
        }
        if (tablero[0][2] == c && tablero[1][1] == c && tablero[2][0] == c) {
            return true; // Verifica diagonal secundaria
        }
        return false;
    }

    public static void mostrarTablero(char[][] tablero) {
        System.out.println("Tablero:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] inicializarTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
        return tablero;
    }
}
