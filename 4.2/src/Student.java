public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double free){
        super(name, address);
        this.program=program;
        this.year=year;
        this.fee=free;
    }
    public String getProgram(){
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFree() {
        return fee;
    }

    public void setFree(double free) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[Person[name=" + this.getName() + ",address=" + this.getAddress() + "],program=" + this.program + ",year=" + this.year + ",fee=" + this.fee + "]";
    }
}
