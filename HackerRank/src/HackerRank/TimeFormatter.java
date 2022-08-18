package HackerRank;

public class TimeFormatter {
    public static void main(String[] args) {

        String time = "06:05:45AM";
        String hour = time.substring(0, 2);
        String minute = time.substring(3, 5);
        String second = time.substring(6, 8);
        String meridian = time.substring(8, 10);

        if(Integer.parseInt(hour)>= 12){
            hour = "00";
        }
        System.out.println(meridian);
        time = hour +":" +minute+":" +second;
        System.out.println(time);

    }
}
