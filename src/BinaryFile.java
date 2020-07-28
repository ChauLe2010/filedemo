import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFile {
    void writeBinaryFile(String path,int[] array) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream(path);

        for(int value:array){
            fileOutputStream.write(value);
            fileOutputStream.flush();
        }
    }
    void readBinaryFile(String path) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(path);
        int value;
        while((value=fileInputStream.read())!=-1)
            System.out.println(value);
    }
    public static void main(String[] args) {
        BinaryFile binaryFile=new BinaryFile();
        final String PATH="test.dat";
        int[] array={1,2,3,4};
        try {
            binaryFile.writeBinaryFile(PATH,array);
            binaryFile.readBinaryFile(PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
