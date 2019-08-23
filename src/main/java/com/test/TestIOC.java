package com.test;

import com.bean.Toursinfo;
import com.service.ITousService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by pc on 2019/7/13.
 */
public class TestIOC {
    /*
    类的注解 4个
    Component 通用

    web层  Controller
    service层   service
    dao 层   Repository


      属性 的注解
      @AutoWired  // 自动注入


    */




    //2.
    @Autowired //会把内存中的  通过注解 @service 实例化 service对象  赋值 给下面 的属性
    ITousService service ;
@Test
public  void test2(){

}



    @Test//使用通用工厂类来实例化  xml配置的bean  对象

    public  void testFactory(){
        ApplicationContext context= new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        Toursinfo tours = (Toursinfo) context.getBean("tours");
        System.out.println(tours);

    }
    @Test
    public void test1(){
        //1.
        ApplicationContext context= new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        Toursinfo t = (Toursinfo) context.getBean("tours");
        service =(ITousService) context.getBean("service");
        service =(ITousService) context.getBean("service");
      /*  Toursinfo t = new Toursinfo();
        t.setIntroduce("光谷 课工场");*/
        this.service.add(t);

    }
}
