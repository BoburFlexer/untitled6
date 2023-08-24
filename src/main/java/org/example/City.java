package org.example;

public class City {
    Long id;
    String name;
    Long population;
    String nameOfMayor;
    int schools;

    public City(String name, Long population, String nameOfMayor, int schools) {
        this.name = name;
        this.population = population;
        this.nameOfMayor = nameOfMayor;
        this.schools = schools;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public String getNameOfMayor() {
        return nameOfMayor;
    }

    public void setNameOfMayor(String nameOfMayor) {
        this.nameOfMayor = nameOfMayor;
    }

    public int getSchools() {
        return schools;
    }

    public void setSchools(int schools) {
        this.schools = schools;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", nameOfMayor='" + nameOfMayor + '\'' +
                ", schools=" + schools +
                '}';
    }
}
