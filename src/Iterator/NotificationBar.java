package Iterator;

import java.util.Iterator;

public class NotificationBar {
    Collection notificationCollection;
    Iterator iterator;
    public NotificationBar(NotificationCollection notificationCollection){
        this.notificationCollection = notificationCollection;
    }

    public void printNotification(){
        iterator = notificationCollection.createIterator();
        System.out.println("------- Notification Bar-------");
        while(iterator.hasNext()){
            Notification n = (Notification)iterator.next();
            System.out.println(n.getNotification());
        }
    }

    public static void main(String[] args) {
        NotificationCollection nc = new NotificationCollection();
        NotificationBar nb = new NotificationBar(nc);
        nb.printNotification();
    }
}
