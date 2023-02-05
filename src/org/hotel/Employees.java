package org.hotel;

public class Employees extends Person{

    private int dateEmployed;
    private int level;
    private boolean status;

    public boolean getStatus(){
        return status;
    }
    public int getLevel(){
        return level;
    }
    public int getDateEmployed(){
        return dateEmployed;
    }


}
