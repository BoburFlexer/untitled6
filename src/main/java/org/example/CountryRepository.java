package org.example;

import java.sql.*;

public class CountryRepository {
    private final String CREATE_TABLE = "create table if not exists country(id serial primary key, name varchar(250), population bigint, capital varchar(250), money integer)";
    private final String FIND_BY_ID = "select * from country where id = ?";
    private final String SAVE_USER = "insert into country(name,population,capital,money)values (?,?,?,?)";

    public void CREATE_TABLE() {
        try (Connection connection = DdConnection.getConnection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(CREATE_TABLE);
            System.out.println("create!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public Country findById(Long id) {
        Country country = null;
        try (Connection connection = DdConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID)) {
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                country = new Country();
                country.setId(resultSet.getLong("id"));
                country.setCapital(resultSet.getString("capital"));
                country.setMoney(resultSet.getInt("money"));
                country.setPopulation(resultSet.getLong("population"));
                country.setName(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return country;
    }

    public void saveUser(Country country) {
        try (Connection connection = DdConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SAVE_USER)) {
            preparedStatement.setString(1, country.getName());
            preparedStatement.setString(3, country.getCapital());
            preparedStatement.setInt(4,country.getMoney());
            preparedStatement.setLong(2,country.getPopulation());
            preparedStatement.executeUpdate();
            System.out.println("saved!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
