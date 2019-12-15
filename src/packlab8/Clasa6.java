package packlab8;

public class Clasa6 {
    public void f() throws NotWorkingDayException{
        try{
            g();
        }
        catch (MyException e){
            NotWorkingDayException n = new NotWorkingDayException("!");
            throw n;
        }
    }
    public void g() throws MyException{
        MyException e = new MyException("hopa-tropa-penelopa");
        throw e;
    }

}
