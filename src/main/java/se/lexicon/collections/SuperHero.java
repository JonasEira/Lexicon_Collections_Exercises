package se.lexicon.collections;

import java.util.Objects;

public class SuperHero implements Comparable {
    private int age;
    private String name;
    private int id;

    public SuperHero(int id, String name, int age) {
        this.setId(id);
        this.setName(name);
        this.setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperHero superHero = (SuperHero) o;
        return age == superHero.age && id == superHero.id && Objects.equals(name, superHero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, id);
    }

    @Override
    public int compareTo(Object o) {
        if(((SuperHero)o).getAge() < this.getAge()){
            return 1;
        } else {
            return -1;
        }
    }
}
