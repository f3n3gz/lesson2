package ru.geekbrains.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.geekbrains.spring.Annotation.Wanted;
import ru.geekbrains.spring.Classes.TestClass;
import ru.geekbrains.spring.Classes.TestClassXml;

@ComponentScan("ru.geekbrains.spring")
public class App {
    public static void main(String[] args) {
        // Java Annotation
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.scan("ru.geekbrains.spring");
        context.refresh();


        TestClass testClass=context.getBean("testClass",TestClass.class);

        TestClass superDuper=context.getBean("superDuper",TestClass.class);


        System.out.println(testClass.getName());

        System.out.println(testClass);
        System.out.println(superDuper);

        System.out.println(testClass.getClassB().getClassA());
        System.out.println(testClass.getClassA().getClassB());

        System.out.println(testClass.getClassA());
        System.out.println(testClass.getClassB());

        System.out.println(testClass.getOmegaInterface());

        System.out.println(testClass.getSuperInterfaceA().getClass().getSimpleName());
        System.out.println(testClass.getSuperInterfaceB().getClass().getSimpleName());
        System.out.println(testClass.getInterfaceImplC().getClass().getSimpleName());
        System.out.println(testClass.getSuperInterfacePrimary().getClass().getSimpleName());


        System.out.println("Wanted: "+ testClass.getSuperInterfaceWanted());
        System.out.println("Not Wanted: "+ testClass.getSuperInterfaceNotWanted());

        // XML
        final ApplicationContext contextXml=new ClassPathXmlApplicationContext("appConfig.xml");

        TestClassXml testClassXml=contextXml.getBean("testClass",TestClassXml.class);
        System.out.println(testClassXml.getName());

        System.out.println(testClassXml.getSuperInterfaceA());
        System.out.println(contextXml.getBean("implXmlA"));
        System.out.println(testClassXml.getSuperInterfaceB());
        System.out.println(contextXml.getBean("implXmlB"));
        System.out.println(testClassXml.getSuperInterfacePrimary());
        System.out.println(contextXml.getBean("interfaceImplPrimary"));

    }
}
