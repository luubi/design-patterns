package com.vlt.factory.connection;

import com.vlt.factory.Connection;

public class OracleConnection implements Connection {

    public String getUserNameById(int userId) {
        System.out.printf("get username by id %d from oracle", userId);
        return "Name of " + userId + " from oracle";
    }
}
