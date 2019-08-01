package ru.geekbrains.spring.Classes;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.geekbrains.spring.Interface.OmegaInterface;
import ru.geekbrains.spring.Interface.SuperInterface;

@Getter
@Setter
@Component
public class TestClass {

    private String name = "java";

    @Autowired
    @Qualifier("implA")
    private SuperInterface superInterfaceA;

    @Autowired
    @Qualifier("implB")
    private SuperInterface superInterfaceB;

//    primary > name convention
//    @Autowired
//    private SuperInterface interfaceImplC;

    @Autowired
    private OmegaInterface interfaceImplC;

    @Autowired(required = false)
    private SuperInterface superInterfacePrimary;

    @Autowired
    ClassA classA;

    @Autowired
    ClassB classB;

    @Autowired(required = false)
    OmegaInterface omegaInterface;
}
