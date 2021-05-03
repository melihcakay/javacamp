public class Main {

    public static void main(String[] args) {

        Course course1 = new Course(1, "C#+Angular Kursu", "Engin Demiroğ");
        Course course2 = new Course(2, "Java+React Kursu", "Engin Demiroğ");
        Course course3 = new Course(3, "Programlamaya Giriş Kursu", "Engin Demiroğ");

        Course[] courses = {course1, course2, course3};

        for (Course course : courses) {
            System.out.println(course.courseName);
        }

        System.out.println("-----------------------------");

        Category category1 = new Category(1, "Tümü");
        Category category2 = new Category(2, "Programlama");

        Category[] categories = {category1, category2};

        for (Category category : categories) {
            System.out.println(category.categoryName);
        }

        System.out.println("-----------------------------");

        CourseManager courseManager = new CourseManager();
        courseManager.add(course1);
        courseManager.delete(course2);



    }
}
