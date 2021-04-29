public class CourseManager {

    public void add(Course course) {

        System.out.println("Kurs eklendi: " + course.courseName);
    }

    public void delete(Course course) {

        System.out.println("Kurs silindi: " + course.courseName);
    }
}
