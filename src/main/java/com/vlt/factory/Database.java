package com.vlt.factory;

public abstract class Database {

    public abstract Connection getConnection();

    public String getUserName(int userId) {
        Connection conn = getConnection();
        return conn.getUserNameById(userId);
    }
}
