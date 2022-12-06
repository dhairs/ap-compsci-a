public class StudentExtension extends Student {
    int studentAges[] = new int[10];
    int studentGrades[] = new int[10];

    public void enterData(String name, int studentID, int age, int grade) {
        studentAges[nextIndex] = age;
        studentGrades[nextIndex] = grade;
        super.enterData(name, studentID);
    }

    public void findAgeOrGrade(int age) {
        for (int i = 0; i < studentIDs.length; i++) {
            if (studentAges[i] == age || studentGrades[i] == age) {
                System.out.print(studentIDs[i] + " ");
                System.out.println("(" + students[i] + "): ");
                System.out.print(studentAges[i] + " Years old, Grade ");
                System.out.println(studentGrades[i]);
            }
        }
    }
}
