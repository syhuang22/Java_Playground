package Advance;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Retention(RetentionPolicy.RUNTIME) // 注解在运行时可见
@Target(ElementType.METHOD) // 注解只能用于方法
@interface Execute {
    // 可以添加一些属性，例如执行顺序、执行条件等
}


public class AnnotationExecutor {

    public static void executeMethodsWithAnnotation(Class<?> clazz) {
        List<Method> methodsWithAnnotation = new ArrayList<>();

        // 获取类中的所有方法
        for (Method method : clazz.getDeclaredMethods()) {
            // 检查方法是否带有@Execute注解
            if (method.isAnnotationPresent(Execute.class)) {
                methodsWithAnnotation.add(method);
            }
        }

        // 执行带有@Execute注解的方法
        for (Method method : methodsWithAnnotation) {
            try {
                // 假设这些方法都是无参数的，且都是public的
                method.invoke(clazz.getDeclaredConstructor().newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // 执行带有@Execute注解的类的方法
        executeMethodsWithAnnotation(MyService.class);
    }
}

class MyService {

    @Execute
    public void methodToExecute1() {
        System.out.println("Executing methodToExecute1");
    }

    @Execute
    public void methodToExecute2() {
        System.out.println("Executing methodToExecute2");
    }

    // 这个方法没有@Execute注解，所以不会被执行
    public void anotherMethod() {
        System.out.println("This method is not annotated and will not be executed.");
    }
}
