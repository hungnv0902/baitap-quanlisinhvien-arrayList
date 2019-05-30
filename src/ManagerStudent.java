import interFace.MethodManagerStudent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class ManagerStudent implements MethodManagerStudent<Student> {
    ArrayList<Student> students =  new ArrayList<Student>();
    public int count = 0;

    public ManagerStudent() {
    }


    @Override
    public int addStudent(Student student) {
       for(Student st : students) {
           if (st.getId() == student.getId()) {
               return -1;
           } else {
               if((st.getName() == student.getName()) && (st.getGpa() == student.getGpa())
                       && (st.getAge() == student.getAge()) && (st.getAddress() == student.getAddress())) {
                   return 0;
               }
           }
       }
       students.add(student);
       count ++;
       return 1;

    }

    @Override
    public boolean editStudent(Student student) {
            for (Student st : students) {
                if (st.getId() == student.getId()) {
                    st.setAddress(student.getAddress());
                    st.setAge(student.getAge());
                    st.setGpa(student.getGpa());
                    st.setName(student.getName());
                    return true;
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
                    return -1;
                } else if (o1.getGpa() == o2.getGpa()) {
                    return 0;
                } else {
                    return 1;
                }
            }



        });

    }
    @Override
    public void display() {
        for (Student student : students) {
            System.out.println("ID: " + student.getId()
                                + " | Name: " + student.getName()
                                +" | Age: " + student.getAge()
                                +" | Address: "
                                +student.getAddress()
                                +" | GPA: "
                                +student.getGpa()
                                +"\n");
        }
    }

}

