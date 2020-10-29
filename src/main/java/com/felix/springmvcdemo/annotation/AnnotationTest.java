package com.felix.springmvcdemo.annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author felix
 * @date 2020-10-15 13:42
 */
public class AnnotationTest {

    public static void main(String[] args) throws Exception {
        // 获取类上的注解
        Class<MyAnnotationTest> clazz = MyAnnotationTest.class;
        MyAnnotation annotationOnClass = clazz.getAnnotation(MyAnnotation.class);
        System.out.println(annotationOnClass.getValue());

        // 获取成员变量上的注解
//        Field name = clazz.getField("name");
//        MyAnnotation annotationOnField = name.getAnnotation(MyAnnotation.class);
//        System.out.println(annotationOnField.getValue());

        // 获取hello方法上的注解
        Method getString = clazz.getMethod("getString", (Class<?>[]) null);
        MyAnnotation annotationOnMethod = getString.getAnnotation(MyAnnotation.class);
        System.out.println(annotationOnMethod.getValue());

        // 获取defaultMethod方法上的注解
//        Method defaultMethod = clazz.getMethod("defaultMethod", (Class<?>[]) null);
//        MyAnnotation annotationOnDefaultMethod = defaultMethod.getAnnotation(MyAnnotation.class);
//        System.out.println(annotationOnDefaultMethod.getValue());

        int[] list= new int[]{1, 2, 3, 4};
        List arrayList=Arrays.asList(list);

        long b=Arrays.stream(list).filter(a->a>2).count();
        System.out.println(b);


    }
}
