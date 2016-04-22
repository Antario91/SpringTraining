package testingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Admin on 18.04.2016.
 */
public class mainAnnotationClass {
    public static void main(String[] args) {
        ApplicationContext context1 = new AnnotationConfigApplicationContext(configClass.class);
//        ApplicationContext context2 = new AnnotationConfigApplicationContext(AutowiredInThisClass.class);

//        interfaceOfHello HelloObj = (interfaceOfHello)context1.getBean("HelloImplWithAnotherMethodSay");
//        System.out.println(HelloObj.say());
        AutowiredInThisClass autoc = (AutowiredInThisClass)context1.getBean("auto");
        System.out.println(autoc.h1.say());

        System.out.println();

        interfaceOfHello hello1 = (interfaceOfHello) context1.getBean("helloIMPL");

        System.out.println(hello1.say());
//
//        autoc.h1.say();
//
//        System.out.println();

//        autoc.h2.say();

//        System.out.println();
//
//        String [] namesOfBeans = context1.getBeanDefinitionNames();
//        for (String str: namesOfBeans) {
//            System.out.println(str);
//        }
//        System.out.println("Spring is done");
    }
}
