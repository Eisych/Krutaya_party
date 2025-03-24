package com.users;

import com.partys.Party;

public class Nikita extends Party {

    public Nikita (String name, int age, String gender, String profession)  {
        super(name, age, gender, profession);
        System.out.println("User 2: ");
        setValues(name, age, gender, profession);
        System.out.println(getValues());
    }

}