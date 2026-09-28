import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Roster
{
    private List < Student > students;

    public Roster()
    {
        students = new ArrayList < Student >();
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public Iterator <Student> getGPIterator(double minGPA) {
        return new GPAIterator(minGPA, students);
    }
}