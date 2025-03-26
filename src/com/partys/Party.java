package com.partys;

public class Party {

    private Human matvey = new Human("Matvey", 23, "male", "broker");
    private Human nikita = new Human("Nikita", 38, "male", "Java-backend developer");
    private Human katya = new Human("Katya", 23, "female", "A17");

    @Override
    public String toString() {
        return
                "matvey " + matvey +
                "\nnikita = " + nikita +
                "\nkatya = " + katya;
    }
}
