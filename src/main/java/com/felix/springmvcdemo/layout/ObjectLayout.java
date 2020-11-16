package com.felix.springmvcdemo.layout;

//import org.openjdk.jol;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author felix
 * @date 2020-10-28 23:45
 */
public class ObjectLayout {
    public static void main(String[] args) throws ClassNotFoundException {
        Object o=new Object();
        System.out.println("ddd");
//        Class clazz=ObjectLayout.class.getClassLoader().loadClass("org.openjdk.jol.info.ClassLayout");
        System.out.println("clazz");
        String ousting= ClassLayout.parseInstance(o).toPrintable();
        System.out.println(ousting);
//        ClassLayout.parseInstance(o).toPrintable();
    }
}
