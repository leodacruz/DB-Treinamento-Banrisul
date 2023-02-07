package Utils;

import java.io.*;
import java.util.ArrayList;

public class CsvToArray {

    public static ArrayList<String[]> csvToArrayList(String nomeDoArquivo) throws IOException {
        String file = System.getProperty("user.dir") + File.separator + "resources" + File.separator+nomeDoArquivo;
        ArrayList<String[]> content = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                content.add(line.split(","));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return content;
    }
}