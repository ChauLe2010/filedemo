import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectFile {

    List<Student> readObjectFile(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream=new FileInputStream(path);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        List<Student> students=new ArrayList<>();
        Student student=null;
        try{
            while((student= (Student)objectInputStream.readObject())!=null){
                System.out.println(student);
                students.add(student);
            }
        }catch(EOFException ex){
            System.out.println("End of file");
        }
        return students;
    }
    void writeObjectFile(String path,List<Student> students) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        for(Student student:students)
            objectOutputStream.writeObject(student);
    }
}
