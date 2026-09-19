package notification;
public class EmailFactory extends NotificationFactory{
    @Override
    public Inotification createNotification(){
        return new EmailNotification();
    }
}