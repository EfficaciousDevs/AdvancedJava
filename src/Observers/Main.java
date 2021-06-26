package Observers;

public class Main {
    public static void main(String[] args) {
        MessageSubscriberOne s1 = new MessageSubscriberOne();
        MessageSubscriberTwo s2 = new MessageSubscriberTwo();
        MessageSubscriberThree s3 = new MessageSubscriberThree();
        MessagePublisher p = new MessagePublisher();

        p.attach(s1);
        p.attach(s2);
        p.notifyUpdate(new Message("First Message"));

        p.dettach(s1);
        p.attach(s3);
        p.notifyUpdate(new Message("Second Message"));

        p.dettach(s3);
        p.notifyUpdate(new Message("Third Message"));
    }
}
