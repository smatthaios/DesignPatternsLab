package gr.exercise.exercises.singleton;

public class Singleton {

    private static Singleton INSTANCE = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }

        return INSTANCE;
    }


    public String getDescription() {
        return "Singleton description";
    }
}