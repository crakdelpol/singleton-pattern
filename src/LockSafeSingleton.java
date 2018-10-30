// the synchronized block is utilized inside the if condition with an extra check to guarantee that just a single occurrence of singleton class is made
public class LockSafeSingleton {

    private static LockSafeSingleton instance;

    private LockSafeSingleton () {}

    public LockSafeSingleton getInstance(){
        if(instance == null){
            synchronized (LockSafeSingleton.class){
                if (instance == null){
                    return new LockSafeSingleton();
                }
            }
        }
        return instance;
    }
}
