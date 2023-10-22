import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("1", "1", "1", 1);
        Student student2 = new Student("2", "2", "2", 2);
        Student student3 = new Student("3", "3", "3", 3);
        Student student4 = new Student("4", "4", "4", 4);
        Teacher teacher = new Teacher("t", "t", "t", 5);
        List<Student> list = new ArrayList<>();
        list.add(student3);
        list.add(student1);
        list.add(student4);
        list.add(student2);
        Collections.sort(list);
        StudentGroup studentGroup = new StudentGroup(list, teacher);
        for(Student student : studentGroup){
            System.out.println(student);
        }
    }



    public static void testIterator(StudentGroup studentGroup) {
        StudentGroupIterator groupIterator = new StudentGroupIterator(studentGroup);
        while (groupIterator.hasNext()) {
            System.out.println(groupIterator.next());
        }
    }
}