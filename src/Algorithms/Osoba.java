package Algorithms;

import Queues.Person;

public class Osoba  implements Comparable<Osoba>{

    private String name;
    private String surname;
    private int age;

    public Osoba(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Osoba o) {
        if (age > o.getAge()){
            return 1;
        } else if (age < o.getAge()) {
            return -1;
        } else return 0;

    }
}
