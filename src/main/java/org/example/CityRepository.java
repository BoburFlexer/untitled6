package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CityRepository {
    private final String CREATE_TABLE = "create table if not exists city(id serial primary key, name varchar(250), population bigint, nameOfmayor varchar(250), schools integer)";
    private final String SAVE_USER = "insert into city(name,population,nameOfMayor,schools)values (?,?,?,?)";
    public void CREATE_TABLE() {
        try (Connection connection = DdConnection.getConnection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(CREATE_TABLE);
            System.out.println("create!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void saveUser(City city) {
        try (Connection connection = DdConnection.getConnection();
             PreparedStatement preparedStatement =  connection.prepareStatement(SAVE_USER)) {
            preparedStatement.setString(1,city.getName());
            preparedStatement.setString(3, city.getNameOfMayor());
            preparedStatement.setLong(2,city.getPopulation());
            preparedStatement.setInt(4,city.getSchools());
            preparedStatement.executeUpdate();
            System.out.println("saved!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}