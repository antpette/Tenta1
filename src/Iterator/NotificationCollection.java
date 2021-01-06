package Iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class NotificationCollection implements Collection {

    ArrayList<Notification> notificationList ;

    public NotificationCollection(){
        notificationList = new ArrayList<>();

        notificationList.add(addItem("Anton är grym"));
        notificationList.add(addItem("Anton får 5a i allt"));
        notificationList.add(addItem("Fanny är elak mot Anton"));
    }

    private Notification addItem(String str) {
        Notification n = new Notification(str);
        return n;
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }
}
