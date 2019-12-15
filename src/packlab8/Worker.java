package packlab8;

public class Worker {
    private String name;
    private WorkCalendar calendar;

    //private static final WorkCalendar week = new WorkCalendar();

    public Worker(String name) {
        this.name = name;
    }

    public Worker(String name, WorkCalendar calendar) {
        this.name = name;
        this.calendar = calendar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkCalendar getCalendar() {
        return calendar;
    }

    public void setCalendar(WorkCalendar calendar) {
        this.calendar = calendar;
    }

    public void work (String day) throws NotWorkingDayException {
        if (calendar.isWorkingDay(day) == true){
            System.out.println("Another day at work...");
        }
        else{
            throw new NotWorkingDayException("This is not a working day for me");
        }
    }
}
