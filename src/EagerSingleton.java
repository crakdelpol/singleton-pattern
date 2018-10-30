////Eager singleton  makes the occurrence even before it’s being utilized and that isn’t the best practice to utilize.
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }

}
