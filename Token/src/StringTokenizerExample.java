import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) throws Exception {
        // cadena que deseamos dividir en tokens
        String inputString = "Hola,esto,es,un,ejemplo";

        // delimitador para dividir la cadena (en este caso, una coma)
        String delimiter = ",";

        // crear un objeto StringTokenizer con la cadena y el delimitador

        StringTokenizer tokenizer = new StringTokenizer(inputString, delimiter);

        // iterar a traves de los tokens y mostrarlos

        while(tokenizer.hasMoreTokens()){

            String token = tokenizer.nextToken();
            System.out.println("Token: "+ token);

        }


    }
}
