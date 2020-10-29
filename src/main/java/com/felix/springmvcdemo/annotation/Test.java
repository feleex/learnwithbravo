package com.felix.springmvcdemo.annotation;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author felix
 * @date 2020-10-15 14:51
 */
public class Test {
    public static void main(String[] args) {
        new B();
    }
}

class A<T>{
    public A(){
        // this是谁？A还是B？
        Class clazz = this.getClass();
        System.out.println(clazz.getName());
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);

        // 本质是ParameterizedTypeImpl，可以向下强转
        ParameterizedType parameterizedTypeSuperclass = (ParameterizedType) genericSuperclass;
        // 强转后可用的方法变多了，比如getActualTypeArguments()可以获取Class A<String>的泛型的实际类型参数
        Type[] actualTypeArguments = parameterizedTypeSuperclass.getActualTypeArguments();

        // 由于A类只有一个泛型，这里可以直接通过actualTypeArguments[0]得到子类传递的实际类型参数
        Class actualTypeArgument = (Class) actualTypeArguments[0];
        System.out.println(actualTypeArgument);
        System.out.println(clazz.getName());
    }
}

class B extends A<String>{
}

class C extends A<Integer>{
}


