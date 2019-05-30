import interFace.MethodManagerStudent;
import java.util.ArrayList;

public class ManagerStudent extends Student implements MethodManagerStudent<ManagerStudent> {
    ArrayList<ManagerStudent> students =  new ArrayList<ManagerStudent>();
    public int count = 0;

    public ManagerStudent() {
    }

    public ManagerStudent(ArrayList<ManagerStudent> students) {
        this.students = students;
    }

    public ManagerStudent(int id, String name, int age, String address, float gpa, ArrayList<ManagerStudent> students) {
        super(id, name, age, address, gpa);
        this.students = students;
    }

    public ArrayList<ManagerStudent> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<ManagerStudent> students) {
        this.students = students;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int addStudent(ManagerStudent student) {
        if(students.contains(student)) {
            return -1;
        } else {
            students.add(student);
            count ++;
            return 1;
        }

    }

    @Override
    public boolean editStudent(ManagerStudent student) {
        if(students.contains(student)) {
            
        }
    }

    @Override
    public boolean removeStudent(int id) {
        return false;
    }

    @Override
    public void sortStudent() {

    }
}
