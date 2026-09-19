package notification;
public class Client{
    public static void main(String args[]){
        NotificationFactory factory=new EmailFactory();
        Inotification notify=factory.createNotification();
        notify.send();
    }
}