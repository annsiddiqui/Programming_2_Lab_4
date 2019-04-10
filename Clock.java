public class Clock
{
    int hour;
    int min;
    int sec;

    public Clock() {
        this.hour = 12;
        this.min = 0;
        this.sec = 0;
    }

    public Clock(int hr, int min, int sec) {
        this.hour = hr;
        this.min = min;
        this.sec = sec;
    }

    public Clock(Clock other) {
        this.hour = other.getHour();
        this.min = other.getMin();
        this.sec = other.getSec();
    }

    public void setClock(int hr, int min, int sec) {
        this.hour = hr;
        this.min = min;
        this.sec = sec;
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return this.min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {

        return this.sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public void addTime(int hrs, int mins, int secs) {
        this.hour = this.hour + hrs;
        this.min = this.min + mins;
        this.sec = this.sec + secs;

    }

    public void timeDiff(Clock other) {
        int hourDifference = Math.abs(this.hour - other.hour);
        int minDifference = Math.abs(this.min - other.min);
        int secDifference = Math.abs(this.sec - other.sec);
        System.out.print("Hour difference: " + hourDifference + " Min difference: " + minDifference + " Sec Difference: " + secDifference);

    }

    public int convert() {
        int hourConversion = this.hour * 3600;
        int minConversion = this.min * 60;
        int secConversion = this.sec * 1;
        return hourConversion + minConversion + secConversion; 
    }

    public Clock convertSec(int secs) {
        Clock other = new Clock ();
        int carryOn = 0;
        other.min = secs / 60;
        if (other.min > 60) {
            carryOn = other.min / 60;
        }
        other.hour = carryOn;
        other.sec = secs % other.min;
        other.showTime();
        return other;
    }

    public int compareClock (Clock other2) {
        if (this.hour > other2.hour) {
            return 1;
        } else {
            if (other2.hour > this.hour){  
                return -1;
            } else{ 
                if ((this.min >  other.min) && 
                (this.hour == other2.hour || 
                    (this.hour == 0 && other2.hour == 0))) {
                    return 1;
                }else {
                    return -1;
                }
                else { if (((this.hour == other2.hour) || 
                        (this.hour == 0 && other2.hour == 0))
                    && (this.min == 0 && other2.min == 0) || 
                    (this.min == other2.min) && this.sec > other2.sec) {
                        return 1;
                    }else{
                        return -1;
                    }
                }
            }
        }
    }

    public void showTime() {
        int carry = 0;
        if  (this.hour > 24) {
            this.hour = 1;
            if (this.sec >= 60) {
                this.sec = this.sec % 60;
                carry = 1;
                this.min +=carry;
            }
            if (this.min >= 60) {
                carry = 1;
                this.min = this.min %60;
                this.hour +=carry;
            }
            System.out.print(showTimeHelp());
        }
        System.out.print(showTimeHelp());
    }

    private String showTimeHelp() {
        String hours = " ";
        String mins = " ";
        String secs = " ";
        if (this.hour < 10) {
            hours = Integer.toString(this.hour);
            hours = "0" + hours;
        } else { 
            hours = Integer.toString(this.hour);
            hours = hours;
        }
        if (this.min < 10) {
            mins = Integer.toString(this.min);
            mins = "0" + mins;
        } else {
            mins = Integer.toString(this.min);
            mins = mins;
        }
        if (this.sec < 10) {
            secs = Integer.toString(this.sec);
            secs = "0" + secs;
        } else {
            secs = Integer.toString(this.sec);
            secs = secs;
        }

        return hours + ":" + mins + ":" + secs + "\n";
    }
}

