package com.atguigu.jdbctempalte;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class TestJdbcTemplate {
    ApplicationContext ac=new ClassPathXmlApplicationContext("jdbc.xml");
    JdbcTemplate jdbcTemplate = ac.getBean("jdbcTemplate", JdbcTemplate.class);
    @Test
    public void test() {
        //jdbcTemplate.update("insert into emp values(null,'张三',23,'男')");
        /*String sql = "insert into emp values(null,?,?,?)";
        jdbcTemplate.update(sql, "李四", 24, "女");//单个增删改*/
        String eids="3,4,5";
        String sql="delete from emp where eid in("+eids+")";
        jdbcTemplate.update(sql);
        String sqls="select * from emp where ename like '%?%'";
    }
        @Test
        public void testBatchUpdate(){
           String sql= "insert into emp values(null,?,?,?)";
            List<Object[]> list=new ArrayList<>();
            list.add(new Object[] {"a1",1,"男"});
            list.add(new Object[] {"a2",1,"男"});
            list.add(new Object[] {"a3",1,"男"});
            jdbcTemplate.batchUpdate(sql,list);//批量增删改

    }
}
