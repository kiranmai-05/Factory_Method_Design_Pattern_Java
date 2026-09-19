package notification;
public class SmsFactory extends NotificationFactory{
    @Override
    public Inotification createNotification(){
        return new SmsNotification();
    }
}