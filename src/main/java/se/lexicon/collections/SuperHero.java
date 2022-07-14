package se.lexicon.collections;

public class SuperHero {
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
}
