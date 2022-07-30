package com.company;

import java.util.Arrays;

public class Family  implements  Payable{

    private Person[] family;
    private String familyName;
    private String adders;
    private int people;

    public Family(Person[] family, String familyName, String adders, int people) {
        this.family = family;
        this.familyName = familyName;
        this.adders = adders;
        this.people = people;
    }

    @Override
    public String toString() {
        return "Family{" +
                "family=" + Arrays.toString(family) +
                ", familyName='" + familyName + '\'' +
                ", adders='" + adders + '\'' +
                ", people=" + people +
                '}';
    }

    @Override
    public void rent() {

    }

    @Override
    public void taxes() {

    }
}
