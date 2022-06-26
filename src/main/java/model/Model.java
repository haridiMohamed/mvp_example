package model;

import app.AppClass;

public class Model {
    private int count = 0;

    public void addOneToCount() {
        count = AppClass.getInstance().addOneToCount();
    }
    public void minusOneToCount() {
        count = AppClass.getInstance().minusOneToCount();
    }

    public int getCount() {
        return count;
    }
}
