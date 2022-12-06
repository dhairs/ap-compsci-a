public class Student {
    String[] students = new String[10];
    int[] studentIDs = new int[10];
    int nextIndex = 0;

    public void enterData(String name, int studentID) {
        students[nextIndex] = name;
        studentIDs[nextIndex] = studentID;
        nextIndex++;
    }

    public void findName(int id) {

        for (int i = 0; i < studentIDs.length; i++) {
            if (studentIDs[i] == id) {
                System.out.println(students[i]);
            }
        }
    }
}
