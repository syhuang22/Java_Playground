package Advance;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 定义自定义注解
@Retention(RetentionPolicy.RUNTIME) // 注解在运行时可见
@Target(ElementType.METHOD) // 注解只能用于方法
@interface Loggable {
    // 这里可以定义注解的属性，例如日志级别等
    // 例如：String level() default "INFO";
}

public class MyService {
    
    @Loggable
    public void doSomething() {
        // ... 方法实现 ...
    }
    
    public void doSomethingElse() {
        // 这个方法没有使用@Loggable注解
    }
}
