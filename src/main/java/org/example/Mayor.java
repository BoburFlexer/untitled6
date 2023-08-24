package org.example;

public class Mayor {
    String name;
    String lastName;
    int age;
    int children;
    String illness;

    public Mayor(String name, String lastName, int age, int children, String illness) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.children = children;
        this.illness = illness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    @Override
    public String toString() {
        return "Mayor{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", children=" + children +
                ", illness='" + illness + '\'' +
                '}';
    }
}
