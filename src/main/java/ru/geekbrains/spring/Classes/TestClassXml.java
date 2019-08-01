package ru.geekbrains.spring.Classes;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.geekbrains.spring.Interface.OmegaInterface;
import ru.geekbrains.spring.Interface.SuperInterface;

import javax.annotation.Resource;

@Getter
@Setter
public class TestClassXml {

    private String name="java";

    @Autowired
    @Resource(name = "implXmlA")
    private SuperInterface superInterfaceA;

    @Autowired
    @Qualifier("xmlB")
    private SuperInterface superInterfaceB;

    @Autowired(required = false)
    private SuperInterface superInterfacePrimary;

    @Autowired
    ClassA classA;

    @Autowired
    ClassB classB;

    @Autowired(required = false)
    OmegaInterface omegaInterface;
}
