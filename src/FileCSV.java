import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileCSV {
    public void readCsvFile(String path) throws IOException {
        FileReader fileReader=new FileReader(path);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String value;
        while((value=bufferedReader.readLine())!=null){
            String[] content=value.split(",");
            System.out.println(content[4]+" - "+content[5]);
        }
    }
    public static void main(String[] args) {
        final String PATH="test.csv";
        FileCSV fileCSV=new FileCSV();
        try {
            fileCSV.readCsvFile(PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
