<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
                           http://www.springframework.org/schema/beans/spring-beans.xsd
                           http://www.springframework.org/schema/context
                            http://www.springframework.org/schema/context/spring-context-4.3.xsd">
        <!--
         <context:component-scan>：扫描组件，对设置的包下面的类进行扫描，会将加上注解的类作为spring的组件进行加载
         组件：指spring的组件进行加载：会自动在spring的配置文件中生成相对应的bean，这些bean的id会以类的首字母小写为值
        -->
    <context:component-scan base-package="com.atguigu.ioc.usermod" use-default-filters="false">
           <!-- <context:include-filter type="annotation" expression="org.springframework.stereotype.Controller"/>-->
            <context:include-filter type="assignable" expression="com.atguigu.ioc.usermod.service.UserServiceImpl"/>
    </context:component-scan>
    <!--<bean id="userController" class="com.atguigu.ioc.usermod.controller.UserController"></bean>
    <bean id="userService"  class="com.atguigu.ioc.usermod.service.UserServiceImpl"></bean>
    <bean id="userDaoImpl" class="com.atguigu.ioc.usermod.dao.UserDaoImpl"></bean>-->

</beans>
