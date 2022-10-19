public class MySchedule {
    public  String mySchedule(int Day) {
        String myday = "";
        switch (Day) {
            case 1:
                myday = "Monday";
                break;
            case 2:
                myday = "Tuesday";
                break;
            case 3:
                myday = "Wednesday";
                break;
            case 4:
                myday = "Thursday";
                break;
            case 5:
                myday = "Friday";
                break;
            case 6:
                myday = "Saturday";
                break;
            case 7:
                myday = "Sunday";
            default:
                break;
    
            }

            return myday;
    }
    
}
