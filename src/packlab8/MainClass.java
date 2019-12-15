package packlab8;

public class MainClass {
    public static void main (String[] args){
        //WorkCalendar defaultCalendar = new WorkCalendar();
        //defaultCalendar.printCalendar();

        Day[] days = new Day[] { new Day("Friday", true),
                new Day("Saturday", false),
                new Day("Sunday", false),
                new Day("Monday", true),
                new Day("Tuesday", false),
                new Day("Wednesday", true),
                new Day("Thursday", false)
        };
        /*
        WorkCalendar exCalendar = new WorkCalendar(days);
        Worker worker = new Worker("Kevin", exCalendar);
        exCalendar.printCalendar();
        System.out.println();
        exCalendar.setDay("Monday",false);
        exCalendar.printCalendar();

        try {
            worker.work("Sunday");
        } catch (NotWorkingDayException e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }

        try {
            worker.work("Wednesday");
        } catch (NotWorkingDayException e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }
        try{
            Object o = null;
            Object q = new Object();
            o.equals(q);
        }
        catch (Exception e){
            System.out.println("Exception intercepted !");
        }

        try{
            for (int i = 0; i <= days.length; i++){
                System.out.println(days[i]);
            }
        }
        //catch (Exception e){ // ? care i dif intre linia 52 si 53
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of index !");
        }
        */

        Exception e = new Exception("!!!!!");
        try{
            throw  e;
        }
        catch (Exception ex) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("here!");
        }


    }
}
