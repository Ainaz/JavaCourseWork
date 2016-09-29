package ru.itis;

/**
 * Created by KFU-user on 29.09.2016.
 */
abstract class Transport {
    private int wheelCount;

    public Transport(int wheelCount){
        this.wheelCount = wheelCount;
    }

    public abstract void go();

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public String toString(){
        return  wheelCount + "";
    }
}
