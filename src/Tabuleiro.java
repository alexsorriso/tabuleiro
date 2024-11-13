import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Tabuleiro {

    private ArrayList<Propriedade> propriedades;

    Tabuleiro(String caminho){
        propriedades= new ArrayList<Propriedade>();
        try {
            Scanner scan = new Scanner(new FileReader(caminho));
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String valores[] = line.split(  " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
