import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    List<Student> students=new ArrayList<>();

    public static void main(String[] args) {
        Main main=new Main();
        ObjectFile objectFile=new ObjectFile();
        main.students.add(new Student(1L,"Chau","Ha Noi"));
        main.students.add(new Student(3L,"Nam","Hai Noi"));
        main.students.add(new Student(2L,"Hai","Ha Noiii"));
        try {
            objectFile.writeObjectFile("student.csv",main.students);
            main.students=objectFile.readObjectFile("student.csv");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
