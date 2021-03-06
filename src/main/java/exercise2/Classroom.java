package exercise2;

import exercise1.DuplicateStudentException;
import exercise1.Student;

import java.util.List;

/**
 * A classroom gathers many distinct students.
 */
public class Classroom {
    /**
     * Adds a student to this classroom.
     *
     * @throws NullPointerException if the student is null.
     * @throws DuplicateStudentException if the given student is already part of the classroom.
     */
    public void addStudent(Student student) {

    }

    /**
     * Returns the average score of the classroom, all courses included.
     *
     * @return the average score of the students or 0 if there is none.
     */
    public double averageScore() {
        return 0;
    }

    /**
     * Returns the number of students that are part of this classroom.
     */
    public int countStudents() {
        return 0;
    }

    /**
     * Returns the <code>n</code> students that scored best for the given course.
     * The returned students are sorted by decreasing score.
     *
     * @param course the course to evaluate.
     * @param n the number of top students to return.
     * @return the top <code>n</code> students or an empty list if there is no student or none did score the course.
     * @throws NullPointerException if the course is null.
     * @throws IllegalArgumentException if <code>n</code> is less than or equal to 0.
     */
    public List<Student> topScorers(String course, int n) {
        return null;
    }

    /**
     * Returns all the students that are successful.
     * The returned list is sorted by decreasing average score.
     *
     * @return a sorted list of students or an empty list.
     */
    public List<Student> successfulStudents() {
        return null;
    }
}
