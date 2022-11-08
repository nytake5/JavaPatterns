package Singleton;

import java.time.LocalTime;

public final class Singleton {
    private static Singleton _instance = null;
    private static LocalTime _timeOfCreation = null;

    private Singleton() {
        _timeOfCreation = LocalTime.now();
    }

    public static synchronized Singleton getInstance() {
        if (_instance == null)
            _instance = new Singleton();
        return _instance;
    }

    public LocalTime getCreationTime() {
        return _timeOfCreation;
    }
}
