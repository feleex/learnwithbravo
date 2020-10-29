package com.felix.springmvcdemo.annotation;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author felix
 * @date 2020-10-15 16:36
 */
@Data
@AllArgsConstructor
public class Person {
    private String name;
    private Integer age;
}
