package com.atguigu.spring.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect//标注当前类为切面
public class MyloggerAspect {
    /*
    * @将方法指定为前置通知
    * 必须设置value,其值为切入点表达式
    * */
    //@Before(value = "execution(public int com.atguigu.spring.aop.MathImpl.add(int,int))")
    @Before(value="execution(* com.atguigu.spring.aop.*.*(..))")
    public void beforeMethod(JoinPoint joinPoint){
        Object[] args=joinPoint.getArgs();//获取方法的参数
        String methodName= joinPoint.getSignature().getName();//获取方法名
        System.out.println("method:"+methodName+",arguments:"+ Arrays.toString(args));
    }
}
