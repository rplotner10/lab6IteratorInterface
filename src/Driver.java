import java.util.Iterator;

public class Driver
{
    public static void main(String[] args)
    {
        System.out.println("Iterator Program");

        //create some students
        Student s1 = new Student("Mark", "Mahoney", 2.3);
        Student s2 = new Student("Laura", "Mahoney", 2.8);
        Student s3 = new Student("Buddy", "Mahoney", 3.3);
        Student s4 = new Student("Patrick", "Mahoney", 3.5);

        //add them to a roster
        Roster roster = new Roster();

        roster.addStudent(s1);
        roster.addStudent(s2);
        roster.addStudent(s3);
        roster.addStudent(s4);

        Iterator <Student> goodStudents = roster.getGPAIterator(3.2);

        while(goodStudents.hasNext()) {
            Student goodStudent =goodStudents.next();
            System.out.println(goodStudent);

        }
    }
}