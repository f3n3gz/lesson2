package ru.geekbrains.spring.Config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.geekbrains.spring.Classes.TestClass;

@Configuration
@ComponentScan("ru.geekbrains.spring")
public class SecondAppConfig {

    @Bean(name = "superDuper")
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public TestClass testClass() {
        return new TestClass();
    }
}
