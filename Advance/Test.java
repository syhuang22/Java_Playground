package Advance;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
}

class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        assert result == 5 : "Addition failed";
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        assert result == 2 : "Subtraction failed";
    }

    // 假设Calculator是一个简单的计算器类，包含add和subtract方法
    private static class Calculator {
        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }
    }
}


public class UnitTest {
    public static void runTests(Class<?> testClass) {
        Method[] methods = testClass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                try {
                    method.setAccessible(true);
                    method.invoke(testClass.getDeclaredConstructor().newInstance());
                    System.out.println(method.getName() + " passed.");
                } catch (Exception e) {
                    System.out.println(method.getName() + " failed: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        runTests(CalculatorTest.class);
    }
}
