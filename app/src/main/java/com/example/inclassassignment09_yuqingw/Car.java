package com.example.inclassassignment09_yuqingw;

public class Car {

    private String make;
    private String model;
    private int year;
    private boolean hybrid;

    public Car(){
    }

    public Car(String make,String model,int year,boolean hybrid){
        this.make = make;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }

    @Override
    public String toString(){
        return "Car{"+
                "make='"+make+'\''+
                ",model='"+model+'\''+
                ",year="+year+
                ",hybrid="+hybrid+
                '}';
    }

    public String getMake(){
        return make;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }
    public boolean getHybrid(){
        return hybrid;
    }
    public void setHybrid(boolean hybrid){
        this.hybrid = hybrid;
    }
}
