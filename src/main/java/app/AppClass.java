package app;

import service.Service;

public class AppClass {
    private static final AppClass instance = new AppClass();
    public static AppClass getInstance(){
        return instance;
    }
    public int addOneToCount() {
        return Service.getInstance().addOneToCount();
    }
    public int minusOneToCount() {
        return Service.getInstance().minusOneToCount();
    }
}
