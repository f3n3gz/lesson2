package ru.geekbrains.spring.Classes;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.geekbrains.spring.Annotation.NotWanted;
import ru.geekbrains.spring.Interface.SuperInterface;

@NotWanted
@Component
@Qualifier("implB")
public class InterfaceImplB implements SuperInterface {
}
