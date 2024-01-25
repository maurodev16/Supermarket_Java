package Controller;

import Database.DatabaseSettings;
import Model.UserModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserController {
    public void insertUser(UserModel userModel) {
        try (Connection connection = DatabaseSettings.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO user (username, email, password, createdAt, updatedAt) VALUES (?, ?, ?, ?, ?)");
            statement.setString(1, userModel.getUsername());
            statement.setString(2, userModel.getEmail());
            statement.setString(3, userModel.getPassword());
            statement.setString(4, userModel.getCreatedAt().toString());
            statement.setString(5, userModel.getCreatedAt().toString());

            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error to add the user: " + e.getMessage());
        }
    }

}
