package ru.geekbrains.spring.Classes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import ru.geekbrains.spring.Interface.SuperInterface;

@Primary
@Component
public class InterfaceImplPrimary implements SuperInterface {
}
