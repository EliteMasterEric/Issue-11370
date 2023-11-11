package test;

import java.lang.reflect.Field;

import test.CoolClass;

public class TestClass {
    public static void main(String[] args) {
        // processClass(CoolClass.class);
    }

    public static void processClass(java.lang.Class<?> clazz) {
        for (Field field : clazz.getFields()) {
            System.out.println("Field: " + field.getName());
            if (field.isAnnotationPresent(CoolClass.Comment.class)) {
                System.out.println("  Comment: true (" + field.getAnnotation(CoolClass.Comment.class).category() + ")");
            } else {
                System.out.println("  Comment: false");
            }
            if (field.isAnnotationPresent(CoolClass.Entry.class)) {
                System.out.println("  Entry: true (" + field.getAnnotation(CoolClass.Entry.class).name() + "), (" + field.getAnnotation(CoolClass.Entry.class).category() + ")");
            } else {
                System.out.println("  Entry: false");
            }
        }
    }
}

