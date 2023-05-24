package ru.itsjava.annotations.junit;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import ru.itsjava.annotations.junit.annotatoins.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class MyJUnit {
    private final Object objTestClass;
    private int passedTests = 0;
    private int failedTests = 0;
    private List<Method> beforeAllMethods = new ArrayList<>();
    private List<Method> beforeMethods = new ArrayList<>();
    private List<Method> testMethods = new ArrayList<>();
    private List<Method> afterMethods = new ArrayList<>();
    private List<Method> afterAllMethods = new ArrayList<>();

    @SneakyThrows
    public void start() {
        fillAllMethodsGroup();

        for (Method beforeAll : beforeAllMethods) {
            displayName(beforeAll);
            beforeAll.invoke(objTestClass);
        }
        for (Method method : testMethods) {
            try {
                for (Method before : beforeMethods) {
                    displayName(before);
                    before.invoke(objTestClass);
                }
                method.invoke(objTestClass);
                System.out.println(method.getName() + "PASSED!");
                passedTests++;
                for (Method after : afterMethods) {
                    displayName(after);
                    after.invoke(objTestClass);
                }

            } catch (InvocationTargetException exception) {
                System.out.println(method.getName() + " FAILED! ");
                failedTests++;
            }
        }
        for (Method afterAll : afterAllMethods) {
            displayName(afterAll);
            afterAll.invoke(objTestClass);
        }
        printResults();
    }

    private void fillAllMethodsGroup() {
        for (Method method : objTestClass.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(BeforeAll.class)) {
                beforeAllMethods.add(method);
            }
            if (method.isAnnotationPresent(Before.class)) {
                beforeMethods.add(method);
            }
            if (method.isAnnotationPresent(Test.class)) {
                testMethods.add(method);
            }
            if (method.isAnnotationPresent(After.class)) {
                afterMethods.add(method);
            } else if (method.isAnnotationPresent(AfterAll.class)) {
                afterAllMethods.add(method);
            }
        }
    }

    public void displayName(Method method) {
        DisplayName displayName = method.getAnnotation(DisplayName.class);
        if (displayName != null) {
            System.out.println(displayName.testMessage());
        }
    }

    public void printResults() {
        System.out.println("=============================================");
        System.out.println("Колличество пройденных тестов: " + passedTests);
        System.out.println("Колличество упавших тестов: " + failedTests);
        System.out.println("=============================================");
    }

}
