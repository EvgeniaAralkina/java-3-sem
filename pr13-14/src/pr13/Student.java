package pr13;

public class Student {
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
    public String toString() {
        return "id=" + id +":\n"+
                "\t\tname=" + name  +
                "\n\t\tmath=" + math +
                "\n\t\tprog=" + prog +
                "\n\t\tphys=" + phys+
                "\n\t\tfinal score="+sum;
    }
}
