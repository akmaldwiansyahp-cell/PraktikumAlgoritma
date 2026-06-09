package Jobsheet15;

public class Customer {
    public int id;
    public String name;

    Customer(){

    }

    Customer(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return " ID: " + this.id + " Nama: " + this.name;
    }
}
