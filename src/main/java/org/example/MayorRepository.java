package org.example;

import javax.swing.text.html.HTMLDocument;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MayorRepository {
    private final String CREATE_TABLE = "create table if not exists mayor(name varchar(250), lastName varchar(250), age integer, children integer, illness varchar(250))";
    private final String SAVE_USER = "insert into mayor(name,age,illness,lastName,children)values (?,?,?,?,?)";

    public void CREATE_TABLE() {
        try (Connection connection = DdConnection.getConnection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(CREATE_TABLE);
            System.out.println("create!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void SAVE_USER(Mayor mayor) {
        try (Connection connection = DdConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SAVE_USER)) {
            preparedStatement.setString(1, mayor.getName());
            preparedStatement.setString(3, mayor.getIllness());
            preparedStatement.setString(4,mayor.getLastName());
            preparedStatement.setInt(2, mayor.getAge());
            preparedStatement.setInt(5, mayor.getChildren());
            preparedStatement.executeUpdate();
            System.out.println("succesfully created !");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}