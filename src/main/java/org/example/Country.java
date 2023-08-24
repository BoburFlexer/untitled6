package org.example;

public class Country {
    private Long id;
    private String name;
    private Long population;
    private String capital;
    private int money;

    public Country(String name, Long population, String capital, int money) {
        this.name = name;
        this.population = population;
        this.capital = capital;
        this.money = money;
    }

    public Country() {

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

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
