package notification;
public class SmsNotification implements Inotification{
    public void send(){
        System.out.println("You got a SMS notification");
    }
}