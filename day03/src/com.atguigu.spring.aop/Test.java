package com.atgui.spring.aop;

public class Test {
    public static void main(String[] args) {
        MathI math=new MathImpl();
        System.out.println(math.add(1,2));
    }
}
