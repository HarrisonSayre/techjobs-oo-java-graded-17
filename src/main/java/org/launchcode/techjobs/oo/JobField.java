package org.launchcode.techjobs.oo;

public abstract class JobField {

    String value;
    private int id;
    private static int nextId = 1;

    public JobField(){
        id = nextId;
        nextId++;
    }
    public  JobField(String value){
        this();
        this.value = value;
    }

    public String toString() {
        return value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

}
