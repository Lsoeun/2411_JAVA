import java.util.Objects;

public class Student2 {
    int studentId;
    String studentName;

    public Student2(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString(){
        return studentId + "," + studentName;
    }


    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student2 student2)) return false;

        return studentId == student2.studentId && Objects.equals(studentName, student2.studentName);
    }

    @Override
    public int hashCode() {
        int result = studentId;
        result = 31 * result + Objects.hashCode(studentName);
        return result;
    }
}
