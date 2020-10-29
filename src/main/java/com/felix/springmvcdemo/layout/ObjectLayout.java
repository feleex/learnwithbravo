package com.felix.springmvcdemo.layout;

//import org.openjdk.jol;
import org.openjdk.jol.info.ClassLayout;

/**
 * @author felix
 * @date 2020-10-28 23:45
 */
public class ObjectLayout {
    public static void main(String[] args) {
        Object o=new Object();
        System.out.println("ddd");
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
//        ClassLayout.parseInstance(o).toPrintable();
    }
}
