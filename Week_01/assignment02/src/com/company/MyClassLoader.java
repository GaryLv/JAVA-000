package com.company;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] bytes = new byte[0];
        try {
            bytes = MyClassLoader.class.getClassLoader().getResourceAsStream("Hello.xlass").readAllBytes();

        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] decodeBytes = new byte[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            decodeBytes[i] = (byte) (255 - bytes[i]);
        }
        return defineClass(name, decodeBytes, 0, decodeBytes.length);
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> clazz = new MyClassLoader().findClass("Hello");
        Method method = clazz.getMethod("hello");
        Object instance = clazz.newInstance();
        method.invoke(instance);
        // print Hello, classLoader!
    }
}
