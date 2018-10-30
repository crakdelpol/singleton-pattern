//read more about syncronized method https://docs.oracle.com/javase/tutorial/essential/concurrency/sync.html
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton (){ }

    public static synchronized ThreadSafeSingleton getInstance(){

        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;

    }
}
