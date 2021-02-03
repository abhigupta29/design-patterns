package creational.singleton;

public class SingletonThreadSafe {

    private static SingletonThreadSafe instance;
    public int value;

    private SingletonThreadSafe(int value) {
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static SingletonThreadSafe getInstance(int value) {

        SingletonThreadSafe result = instance;
        if(result != null) {
            return result;
        }
        synchronized (SingletonThreadSafe.class) {
            if(instance == null) {
                instance = new SingletonThreadSafe(value);
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            SingletonThreadSafe x = SingletonThreadSafe.getInstance(3);
            System.out.println(x.value);
        });

        Thread t2 = new Thread(() -> {
            SingletonThreadSafe x = SingletonThreadSafe.getInstance(5);
            System.out.println(x.value);
        });

        t1.start();
        t2.start();
    }
}
