package interFace;

public interface MethodManagerStudent<Student> {
    int addStudent(Student student);
    boolean editStudent(Student student);
    boolean removeStudent(int id);
    void sortStudent();
    void display();

}
