package com.users;

import com.partys.Party;

public class Matvey extends Party {

    public Matvey (String name, int age, String gender, String profession)  {
        super(name, age, gender, profession);
        System.out.println("User 1: ");
        setValues(name, age, gender, profession);
        System.out.println(getValues());
    }

}