import java.util.ArrayList;
import java.util.List;

/**
 * StudentSortTest.java
 * Divine Chamoh
 * Stores 10 students in an ArrayList, then sorts them by name and by
 * roll number using SelectionSort and the two comparator classes.
 */
public class StudentSortTest {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1005, "Olivia Brown", "12 Oak Street"));
        students.add(new Student(1002, "Liam Johnson", "48 Maple Avenue"));
        students.add(new Student(1009, "Emma Davis", "7 Pine Road"));
        students.add(new Student(1001, "Noah Wilson", "93 Cedar Lane"));
        students.add(new Student(1007, "Ava Martinez", "221 Elm Court"));
        students.add(new Student(1010, "Ethan Clark", "15 Birch Drive"));
        students.add(new Student(1003, "Sophia Lewis", "66 Walnut Way"));
        students.add(new Student(1008, "Mason Walker", "304 Spruce Street"));
        students.add(new Student(1004, "Isabella Hall", "59 Willow Place"));
        students.add(new Student(1006, "James Young", "82 Aspen Circle"));

        print("Test 1: Original order", students);

        SelectionSort.sort(students, new StudentNameComparator());
        print("Test 2: Sorted by name", students);

        SelectionSort.sort(students, new StudentRollNoComparator());
        print("Test 3: Sorted by roll number", students);

        SelectionSort.sort(students, new StudentRollNoComparator());
        print("Test 4: Sorting an already sorted list (no change)", students);

        List<Student> empty = new ArrayList<>();
        SelectionSort.sort(empty, new StudentNameComparator());
        print("Test 5: Sorting an empty list (no error)", empty);
    }

    private static void print(String title, List<Student> students) {
        System.out.println("=== " + title + " ===");
        System.out.printf("%-8s %-16s %s%n", "Roll No", "Name", "Address");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }
}
