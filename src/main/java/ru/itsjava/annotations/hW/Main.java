package ru.itsjava.annotations.hW;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Class<?> mathStudent = Class.forName("ru.itsjava.annotations.hW.MathStudent");
        MathStudent studentMathPavel = (MathStudent) mathStudent.getConstructor(String.class, String.class, int.class)
                .newInstance("Pavel", "Nacharkin", 3);

        System.out.println(studentMathPavel);

        Field name = mathStudent.getDeclaredField("name");
        name.setAccessible(true);
        name.set(studentMathPavel, "Ivan");

        System.out.println(studentMathPavel);


        Class<?> biologyStudent = Class.forName("ru.itsjava.annotations.hW.BiologyStudent");
        BiologyStudent studentBiologyAlex = (BiologyStudent) biologyStudent.getConstructor(String.class, String.class, int.class)
                .newInstance("Alex", "Smirnov", 2);

        System.out.println();

        Field mathStudentName = mathStudent.getDeclaredField("name");
        mathStudentName.setAccessible(true);

        Field biologyStudentName = biologyStudent.getDeclaredField("name");
        biologyStudentName.setAccessible(true);

        MyAnnotationHW mathDepName = (MyAnnotationHW) mathStudent.getAnnotations()[0];
        MyAnnotationHW biologyDepName = (MyAnnotationHW) biologyStudent.getAnnotations()[0];

        System.out.println(mathStudentName.get(studentMathPavel) + ": " + mathDepName.department());
        System.out.println(biologyStudentName.get(studentBiologyAlex) + ": " + biologyDepName.department());

        System.out.println();
        System.out.println(studentMathPavel + ": " + mathDepName.department());
        System.out.println(studentBiologyAlex + ": " + biologyDepName.department());


    }
}

