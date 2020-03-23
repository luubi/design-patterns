package com.vlt.factory;

public class FactoryMethod {

    public static void main(String[] args) {
        Database db = getDatabase(1);
        System.out.println(db.getUserName(1));
        db = getDatabase(2);
        System.out.println(db.getUserName(1));
    }

    private static Database getDatabase(int type) {
        if (type == 1) {
            return new MySqlDatabase();
        }
        else {
            return new OracleDatabase();
        }
    }
}
