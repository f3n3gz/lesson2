package ru.geekbrains.spring.Config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(SecondAppConfig.class)
public class AppConfig {
}
