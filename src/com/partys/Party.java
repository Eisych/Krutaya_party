package com.partys;

public class Party {

    private String name;
    private int age;
    private String gender;
    private String profession;

    public Party (String name, int age, String gender, String profession) {
        setValues(name, age, gender, profession);
    }

    public void setValues (String name, int age, String gender, String profession) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.profession = profession;
    }

    public String getValues() {
    String info = "Имя: " + name + ". Возраст: " + age + ". Пол: " + gender + ". Профессия: " + profession;
    return info; }

}
