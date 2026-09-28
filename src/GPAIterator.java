import java.util.Iterator;
import java.util.List;

public class GPAIterator implements Iterator <Student>{
    private double minimumGPA;
    private int currentPosition;
    private List <Student> students;

    public GPAIterator(double minGPA, List <Student> s){
        minimumGPA = minGPA;
        students = s;
        currentPosition = 0;
    }
    
    public boolean hasNext(){
        boolean retVal = false;
        while(currentPosition <students.size()){
            if (students.get(currentPosition).getGPA() >= minimumGPA) {
            retVal = true;
            break;
            }
        }
        
    }

    public Student next(){
        currentPosition++;
       return retVal;
    }



}
