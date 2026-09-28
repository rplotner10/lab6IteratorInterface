public class Student
{
    private String first;
    private String last;
    private double gpa;

    public Student(String f, String l, double g)
    {
        setFirst(f);
        setLast(l);
        setGPA(g);
    }

    @Override
    public String toString()
    {
        return getLast() + ", " + getFirst() + " GPA: " + getGPA();
    }

    public void setFirst(String f)
    {
        first = f;
    }

    public String getFirst()
    {
        return first;
    }

    public void setLast(String l)
    {
        last = l;
    }

    public String getLast()
    {
        return last;
    }

    public void setGPA(double g)
    {
        gpa = g;
    }

    public double getGPA()
    {
        return gpa;
    }
}