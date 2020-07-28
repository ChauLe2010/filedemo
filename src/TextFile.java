import java.io.*;

public class TextFile {
    public void readFile(String path) throws IOException {
        File file = new File(path);
        if(!file.exists()){
            System.out.println("Loi file");
            return;
        }
        FileReader fileReader=new FileReader(file);
        int value;
        while((value = fileReader.read())!=-1){
            System.out.println((char)value);
        }
    }
    public void readTextFile(String path) throws IOException {
        //File file = new File(path);
        FileReader fileReader=new FileReader(path);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String value=null;
        while((value=bufferedReader.readLine())!=null){
            System.out.println(value);
        }
    }
    public void writeTextFile(String path) throws IOException {
        File file=new File(path);
        if(!file.exists()){
            file.createNewFile();
        }
        FileWriter fileWriter=new FileWriter(file,true);
        fileWriter.write(" noi dung moi thay doi");
        //BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        fileWriter.flush();
    }

    public static void main(String[] args) {
        TextFile textFile=new TextFile();
        final String PATH="test.txt";
//        try{
//            textFile.readFile(PATH);
//        }catch(IOException ex){
//            System.out.println("Loi thao tac file");
//        };
        try{
            textFile.writeTextFile(PATH);
            textFile.readTextFile(PATH);
        }catch(IOException ex){
            System.out.println("Loi thao tac file");
        };


    }
}
