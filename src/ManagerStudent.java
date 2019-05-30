import interFace.MethodManagerStudent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Collections;

public class ManagerStudent implements MethodManagerStudent<Student> {
    ArrayList<Student> students =  new ArrayList<Student>();
    public int count = 0;

    public ManagerStudent() {
    }

    public ManagerStudent(ArrayList<Student> students) {
        this.students = students;
    }


    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int addStudent(Student student) {
        if(students.contains(student)) {
            return -1;
        } else {
            students.add(student);
            count ++;
            return 1;
        }

    }

    @Override
    public boolean editStudent(Student student) {
        if(students.contains(student)) {
            for (Student st : students) {
                if (st.getId() == student.getId()) {
                    st.setAddress(student.getAddress());
                    st.setAge(student.getAge());
                    st.setGpa(student.getGpa());
                    st.setName(student.getName());
                    return true;
                }
            }
        }
            return false;
    }

    @Override
    public boolean removeStudent(int id) {
        for (Student st: students) {
            if(st.getId() == id) {
                students.remove(st);
                count --;
                return true;
            }
        }

        return false;
    }

    @Override
    public void sortStudent() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getGpa() < o2.getGpa()) {
                    return 1;
                } else if (o1.getGpa() == o2.getGpa()) {
                    return 0;
                } else if (o1.getGpa() > o2.getGpa()) {
                    return -1;
                }
            }
            }

        });


    }

