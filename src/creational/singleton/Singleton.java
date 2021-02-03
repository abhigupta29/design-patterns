package creational.singleton;

public class Singleton {

    private static Singleton instance;
    public int value;

    private Singleton(int value) {
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(int value) {
        if(instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton x = Singleton.getInstance(2);
        System.out.println(x.value);
    }
}
