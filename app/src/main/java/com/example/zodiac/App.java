package com.example.zodiac;
import android.app.Application;
public class App extends Application {
    private Storage storage;
    private static  App instance;

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        storage = new Storage();
    }

    public Storage getStorage() {
        return storage;
    }
}
