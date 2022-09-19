package io.codelex.classesandobjects.practice.Exercise7;


public class Dog {

    private String name;
    private String sex;

    private Dog father;
    private Dog mother;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Dog getFather() {
        return father;
    }

    public void setFather(Dog father) {
        this.father = father;
    }

    public Dog getMother() {
        return mother;
    }

    public void setMother(Dog mother) {
        this.mother = mother;
    }

    String fathersName() {
        Dog father = getFather();
        if (father == null) {
            return "Unknown";
        } else {
            return father.name;
        }
    }

    boolean hasSameMotherAs(Dog otherDog) {
        return this.getMother() == otherDog.getMother();
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + name + '\'' + ", sex='" + sex + '\'' + '}';
    }
}
