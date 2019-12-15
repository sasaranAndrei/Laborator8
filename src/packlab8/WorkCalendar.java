package packlab8;

public class WorkCalendar {
    private Day[] days;

    public WorkCalendar() {
        this.days = new Day[7];
        days[0] = new Day("Monday",true);
        days[1] = new Day("Tuesday",true);
        days[2] = new Day("Wednesday",true);
        days[3] = new Day("Thursday",true);
        days[4] = new Day("Friday",true);
        days[5] = new Day("Saturday",false);
        days[6] = new Day("Sunday",false);
    }

    public WorkCalendar(Day[] days) {
        this.days = days;
    }

    public Day[] getDays() {
        return days;
    }

    public void setDay (String dayName, Boolean dayNameWork){
        for (int i =  0; i < days.length; i++){
            if (days[i].getName() == dayName){
                days[i].setWorkDay(dayNameWork);
            }
        }
    }

    public Boolean isWorkingDay (String dayName) {
        for (int i = 0; i < days.length; i++) {
            if (days[i].getName() == dayName) {
                return days[i].isWorkingDay();
            }
        }
        return false;
    }

    public void setDays(Day[] days) {
        this.days = days;
    }

    public void printCalendar (){
        for (int i = 0; i < this.days.length; i++){

            System.out.print(days[i].getName());

            if (days[i].isWorkingDay() == true){
                System.out.println(" work :(");
            }
            else {
                System.out.println(" not work :)");
            }
        }
    }
}
