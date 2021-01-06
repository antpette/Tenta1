package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class NotificationIterator implements Iterator {

    int pos = 0;
    ArrayList<Notification> notificationList ;

    public NotificationIterator(ArrayList<Notification> notificationList){
        this.notificationList = notificationList;
    }

    @Override
    public boolean hasNext() {
        if(pos>= notificationList.size() || notificationList.get(pos).equals(null))
            return false;
        return true;
    }

    @Override
    public Object next() {
        Notification notification = notificationList.get(pos);
        pos++;
        return notification;
    }
}
