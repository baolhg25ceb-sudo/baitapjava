public class Date {

    private int day;
    private int month;
    private int year;


    public Date(int day, int month, int year) {
        if (day < 0 || day > 31) //neu nho hon 0 hoac lon hon 23 thi khong hop le
            throw new IllegalArgumentException();
        if (month < 0 || month > 12)
            throw new IllegalArgumentException();
        if (year < 0 || year > 9999)

        this.day = day;
        this.month = month;
        this.year = year;
    }

    int getDay() {
        return day;
    }

    int getMonth() {
        return month;
    }

    int getYear() {
        return year;
    }

    void setDay(int day) {
        this.day= day;
    }
    void setMonth(int month){
        this.month= month;
    }
    void setYear(int year){
        this.year= year;

    }
    void setDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public String toString( ){
        return this.day + "/" + this.month +"/"+ this.year+".";
    }
}