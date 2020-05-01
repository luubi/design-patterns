package com.vlt.proxy;

public class ProxyDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("voclaptrinh.jpg");

        //Ảnh sẽ được load từ ổ cứng cho lần đâu truy cập
        image.display();
        System.out.println();

        //Ở lần truy cập thứ 2, ảnh sẽ không phải load lên từ ổ cứng nữa
        image.display();
    }
}
