package com.atguigu.proxy;

public class Test {
    public static void main(String[] args) {
       /* MathI math=new MathImpl();
        int result = math.div(1, 1);
        System.out.println(result);*/
        ProxyUtil proxy=new ProxyUtil(new MathImpl());
        MathI math=(MathI)proxy.getProxy();
        int i=math.div(4,2);
        System.out.println(i);
    }
}
