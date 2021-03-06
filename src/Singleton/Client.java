package Singleton;

public class Client {
    public static void main(String[] args) {
        Factory factory = new MercedesFactory();
        System.out.println(factory.makeHeadLight());
        System.out.println(factory.makeTire());
        Factory audiFactory = new AudiFactory();
        System.out.println(audiFactory.makeHeadLight());
        System.out.println(audiFactory.makeTire());
    }
}
