import java.util.Comparator;

/**
 * StudentNameComparator.java
 * Divine Chamoh
 * Orders students alphabetically by name, ignoring upper/lower case.
 */
public class StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student first, Student second) {
        return first.getName().compareToIgnoreCase(second.getName());
    }
}
