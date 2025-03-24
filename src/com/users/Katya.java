package com.users;

import com.partys.Party;

public class Katya extends Party {

    public Katya (String name, int age, String gender, String profession)  {
        super(name, age, gender, profession);
        System.out.println("User 3: ");
        setValues(name, age, gender, profession);
        System.out.println(getValues());
    }

}