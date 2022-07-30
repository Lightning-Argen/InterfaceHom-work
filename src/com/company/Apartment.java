package com.company;

public class Apartment extends Family {


    public Apartment(Person[] family, String familyName, String adders, int people) {
        super(family, familyName, adders, people);
    }

    @Override
    public void rent() {

    }

    @Override
    public void taxes() {
        System.out.println("taxes is"+3622+"ruble a mont");
    }
}
