
/**
 * Write a description of class ClockClient here.
 *
 * @author Qurrat-al-Ain Siddiqui
 * @version Feb 6, 2018
 */
public class ClockClient
{
    public static void main() {
        
        Clock time1= new Clock();
        Clock time2 = new Clock(8, 15, 30);
        Clock time3 = new Clock(time2);
        time1.compareClock(time3);
        time2.compareClock(time1);
        time1.showTime();
        time2.showTime();
        time3.showTime();
        time1.setClock(22,55,32);
        time1.showTime();
        time1.addTime(3,0,0);
        time2.addTime(55,88,23);
        time3.addTime(44,98,82);
        time1.showTime();
        time2.showTime();
        time3.showTime();
        time3.timeDiff(time2);
        System.out.print("\n");
        System.out.println(time1.convert());
        System.out.println(time2.convert());
        System.out.println(time3.convert());
        time1.convertSec(5555555);
        time3.convertSec(534);
       
    }
}

