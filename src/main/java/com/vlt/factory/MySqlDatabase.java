package com.vlt.factory;

import com.vlt.factory.connection.MySqlConnection;

public class MySqlDatabase extends Database {

    public Connection getConnection() {
        return new MySqlConnection();
    }
}
