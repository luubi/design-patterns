package com.vlt.factory;

import com.vlt.factory.connection.OracleConnection;

public class OracleDatabase extends Database {

    public Connection getConnection() {
        return new OracleConnection();
    }
}
