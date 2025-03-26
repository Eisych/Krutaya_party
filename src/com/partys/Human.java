package com.partys;

public class Human {
    private String name;
    private int age;
    private String gender;
    private String profession;

    public Human (String name, int age, String gender, String profession) {
        setValues(name, age, gender, profession);
    }

    protected void setValues (String name, int age, String gender, String profession) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return
                "name = " + name +
                ", age = " + age +
                ", gender = " + gender +
                ", profession = " + profession;
    }
}
