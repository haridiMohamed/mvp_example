package service;

public class Service {
    private static final Service instance = new Service();
    public static Service getInstance(){
        return instance;
    }
    private int count = 0;
    public int addOneToCount() {
        return count++;
    }
    public int minusOneToCount() {return count --;}

}
