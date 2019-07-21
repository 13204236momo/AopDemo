package com.example.aopdemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect //定义切片类
public class ClickBehaviorAspect {

    private final String TAG = "AOPDEMO";

    //1.应用中用到了哪些注解，放入当前的切入点进行处理（找到需要处理的切入点）
    // execution, 以方法执行时作为切点，触发Aspect类
    // @:应为ClickBehavior是一个接口
    // * *(..))":可以处理ClickBehavior这个类的所有方法
    // method() : 方法名可随意
    @Pointcut("execution(@com.example.aopdemo.annotation.ClickBehavior * *(..))")
    public void method() {
    }

    //2.对这些切入点如何处理
    @Around("method()")
    public Object joinPoint(ProceedingJoinPoint joinPoint) throws Throwable{
        //

        //获取方法所属类名

        //获取方法名

        //获取方法的注解值（需要统计的用户行为）
    }
}
