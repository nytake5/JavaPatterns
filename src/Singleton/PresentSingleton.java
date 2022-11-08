package Singleton;

public class PresentSingleton {
    public static void main(String[] args) throws InterruptedException {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getCreationTime());
        singleton = Singleton.getInstance();
        Thread.sleep(1000);
        System.out.println(singleton.getCreationTime());
    }
}


