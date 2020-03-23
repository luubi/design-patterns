package com.vlt.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton() {}

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton singleton1 = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
            "vlt.singleton"));
        out.writeObject(singleton1);
        out.close();

        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
            "vlt.singleton"));
        SerializedSingleton singleton2 = (SerializedSingleton) in.readObject();
        in.close();

        if (singleton1.equals(singleton2)) {
            System.out.println("2 object là 1");
        }
        else {
            System.out.println("2 object khác nhau");
        }
    }

    //Method này đảm bảo việc deserialize sẽ không tạo 1 object khác
    protected Object readResolve() {
        return getInstance();
    }

    private static class SingletonHelper {

        private static final SerializedSingleton instance = new SerializedSingleton();
    }
}
