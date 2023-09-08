public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Tim", "Berger", 333, 1, 3, 5, 4);
        Student student2 = new Student("Kate", "Müller", 132, 2, 5, 2, 4);
        Student student3 = new Student("Josh", "Henkell", 213, 3, 3, 3, 5);

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();

    }
}
