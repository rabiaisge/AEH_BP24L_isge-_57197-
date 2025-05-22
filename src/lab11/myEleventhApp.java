package lab11;

import java.util.*;

public class myEleventhApp {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
                new Student("54321", "Paweł", "Wiśniewski", Arrays.asList(2, 3, 2, 4)),
                new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );

        // 1. Find the student with the highest average grade
        Student topStudent = Collections.max(students, Comparator.comparingDouble(Student::calculateAverage));
        System.out.printf("Student with the highest average: %s %s (%s) - Average: %.2f\n",
                topStudent.getFirstName(), topStudent.getLastName(),
                topStudent.getIndexNumber(), topStudent.calculateAverage());

        // 2. Calculate the overall average grade of all students
        double overallAverage = students.stream()
                .mapToDouble(Student::calculateAverage)
                .average()
                .orElse(0);
        System.out.printf("\nOverall average of all students: %.2f\n", overallAverage);

        // 3. Sort students by last name
        students.sort(Comparator.comparing(Student::getLastName));
        System.out.println("\nStudents sorted by last names:");
        for (Student s : students) {
            System.out.printf("%s %s (%s) - Average: %.2f\n",
                    s.getFirstName(), s.getLastName(),
                    s.getIndexNumber(), s.calculateAverage());
        }
    }
}

