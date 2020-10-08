package com.atguigu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    private MathImpl mathImpl;

    public ProxyUtil(MathImpl mathImpl) {
        this.mathImpl = mathImpl;
    }
     public Object getProxy(){
        ClassLoader loader=this.getClass().getClassLoader();
        Class[] interfaces=mathImpl.getClass().getInterfaces();
        return Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("前");
                Object result = method.invoke(mathImpl,args);//动态代理对象实现功能
                System.out.println(result);
                System.out.println("后");
                return result;
            }
        });
    }
}
