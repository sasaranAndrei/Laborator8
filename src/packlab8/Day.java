package packlab8;

public class Day {
    private String name;
    private Boolean workingDay;

    public Day(String name, Boolean workingDay) {
        this.name = name;
        this.workingDay = workingDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getWorkDay() {
        return workingDay;
    }

    public void setWorkDay(Boolean workDay) {
        this.workingDay = workDay;
    }

    public String toString (){
        return this.name;
    }

    public Boolean isWorkingDay (){
        return this.workingDay;
    }
}
