public class Main {

    public static void main(String[] args) {

        Course course1 = new Course();
        course1.setId(1);
        course1.setName("C# Kursu");

        Course course2 = new Course();
        course2.setId(2);
        course2.setName("Java Kursu");

        Course course3 = new Course();
        course3.setId(3);
        course3.setName("Programlamaya Giriş");

        Course[] courses = {course1,course2,course3};


        Instructor engin = new Instructor();
        engin.setId(1);
        engin.setFirstName("Engin");
        engin.setLastName("Demiroğ");
        engin.setEmail("engindemirog@outlook.com");

        Student melih = new Student();
        melih.setId(2);
        melih.setFirstName("Melih");
        melih.setLastName("Çakay");
        melih.setEmail("melihcakay@outlook.com");

        Student gokay = new Student();
        gokay.setId(3);
        gokay.setFirstName("Gökay");
        gokay.setLastName("Deniz");
        gokay.setEmail("gokaydeniz@outlook.com");

        Student[] students = {melih,gokay};
        Instructor[] instructors = {engin};
        User[] users = {engin,melih,gokay};

        UserManager userManager = new UserManager();
        userManager.add(engin);
        userManager.add(melih);
        userManager.add(gokay);





    }
}
