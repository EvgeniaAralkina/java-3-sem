package pr21;

import java.util.Objects;

public class Student implements Student_0{
    int id;
    String name;
    int math;
    int prog;
    int phys;
    String sum;
    Student(int id, String name, int math, int prog, int phys){
        this.id = id;
        this.math = math;
        this.name = name;
        this.phys = phys;
        this.prog = prog;
        sum = Integer.toString(Math.round((math+prog+phys)/3));
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public int getPhys() {
        return phys;
    }

    public void setPhys(int phys) {
        this.phys = phys;
    }

    public int getProg() {
        return prog;
    }

    public void setProg(int prog) {
        this.prog = prog;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                math == student.math &&
                prog == student.prog &&
                phys == student.phys &&
                Objects.equals(name, student.name) &&
                Objects.equals(sum, student.sum);
    }

    @Override
    public String toString() {
        return "id=" + id +":"+
                "  name=" + name  +
                "  math=" + math +
                "  prog=" + prog +
                "  phys=" + phys+
                "  final score="+sum;
    }
}
