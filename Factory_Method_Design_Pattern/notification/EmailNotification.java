package notification;
public class EmailNotification implements Inotification{
    public void send(){
        System.out.println("You got an Email Notification");
    }
}