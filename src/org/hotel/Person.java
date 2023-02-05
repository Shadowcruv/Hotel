package org.hotel;

public class Person {

    private String HotelName;
    protected String name;
    protected String idNumber;

    public String getName(){
        return name;
    }
    public String getIdNumber(Person  person){
        person.HotelName = "CruvDow Hotel";
        System.out.println(HotelName);
        return name;
    }
}
