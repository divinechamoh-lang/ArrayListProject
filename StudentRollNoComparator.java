import java.util.Comparator;

/**
 * StudentRollNoComparator.java
 * Divine Chamoh
 * Orders students by roll number, lowest first.
 */
public class StudentRollNoComparator implements Comparator<Student> {

    @Override
    public int compare(Student first, Student second) {
        return Integer.compare(first.getRollno(), second.getRollno());
    }
}
