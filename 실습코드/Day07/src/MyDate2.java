public class MyDate2 {
    private int year;
    private int month;
    private int day;

    // Year setter
    public void setYear(int year) {
        this.year = year;
    }

    // Month setter
    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("유효하지 않은 날짜입니다");
        }
    }

    // Day setter
    public void setDay(int day) {
        if (month == 2) {
            if (day < 1 || day > 28) {
                System.out.println("오류입니다.");
            } else {
                this.day = day;
            }
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}