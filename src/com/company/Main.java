package com.company;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Sylvester Stallone", 76);
        Person person2 = new Person("Angelina Jolie", 47);
        Person person3 = new Person("Brad Pitt", 58);
        Person person4 = new Person("Jim Carrey", 60);
        Person person5 = new Person("Jake Gyllenhaal", 41);
        Person person6 = new Person("Jackie Chan", 68);
        Person person7 = new Person("Scarlett Johansson", 37);


        Family family = new Apartment(new Person[]{person, person2, person3},
                "Bekmamatov family", "1571 S Paul Le Comte Ct", 3);
        System.out.println(family); family.taxes();
        System.out.println("-------------");
        Family family2 = new Hostel(new Person[]{person4, person5},
                "Moldoshev family", "г.Москва, Шоссе энтузивстов, д.130, строение11", 2);
        System.out.println(family2);family2.rent();
        System.out.println("-------------");

        Family family3 = new Hoteel(new Person[]{person6, person7},
                "Argenov family", "ул.Майдан ,г.Айран пока дойдешь с ума сойдешь", 2);
        System.out.println(family3);family3.rent();




    }
}