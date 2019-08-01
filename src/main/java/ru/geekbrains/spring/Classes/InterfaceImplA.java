package ru.geekbrains.spring.Classes;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.geekbrains.spring.Annotation.Wanted;
import ru.geekbrains.spring.Interface.SuperInterface;

@Wanted
@Component
@Qualifier("implA")
public class InterfaceImplA implements SuperInterface {
}
