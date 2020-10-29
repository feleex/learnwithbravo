package com.felix.springmvcdemo.annotation;

/**
 * @author felix
 * @date 2020-10-15 10:26
 */

@MyAnnotation
public class MyAnnotationTest {
    @MyAnnotation(getValue = "hello world")
    public static String getString(){
        return "";
    }
    @MyAnnotation()
    public  int getInt(){
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(getString());
        System.out.println(new MyAnnotationTest().getInt());
    }
}
