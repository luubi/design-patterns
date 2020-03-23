package com.vlt.factory.connection;

import com.vlt.factory.Connection;

public class MySqlConnection implements Connection {

    public String getUserNameById(int userId) {
        System.out.printf("get username by id %d from mysql", userId);
        return "Name of " + userId + " from mysql";
    }
}
