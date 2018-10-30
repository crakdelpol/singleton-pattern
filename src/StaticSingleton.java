//Static Bloc singleton makes the occurrence even before it’s being utilized and that isn’t the best practice to utilize.
public class StaticSingleton {
    private static StaticSingleton instance;

    private StaticSingleton (){}

    static {
        try {
            instance = new StaticSingleton();
        }catch (Exception e){
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public StaticSingleton getInstance(){
        return instance;
    }
}
