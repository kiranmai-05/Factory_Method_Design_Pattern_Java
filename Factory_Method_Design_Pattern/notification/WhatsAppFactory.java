package notification;
public class WhatsAppFactory extends NotificationFactory{
    @Override
    public  Inotification createNotification(){
        return new WhatsAppNotification();
    }
}