import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {


        try{
            File archivo = new File("archivo.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            String cadena;

            while((cadena=br.readLine()) != null){
                System.out.println(cadena);
            }

            br.close();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }


        /* try{

            File archivo = new File("archivo.txt");
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i = 1 ; i <= 10; i++){
                bw.write("Escritura en archivo #"+i);
                bw.newLine();
            }

            bw.close();
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        } */
    }
}
