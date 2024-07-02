package com.example.first;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:custom.properties")
public class MyFirstService {

    private final MyFirstClass myFirstClass;
    @Value("Hello i am learing Spring boot ")
    private String customProperty;
    @Value("${my.prop}")
    private String customPropertyFromAnotherFile;

    @Value("123")
    private int customPropertyInt;
    @Value("${my.custom.property  1}")
    private String customString;
    @Value("${my.custom.property.int}")
    private int customInteger;

    public MyFirstService(
            @Qualifier("mySecondClass") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String getCustomString() {
        return customString;
    }

    public int getCustomInteger() {
        return customInteger;
    }

    public String getCustomPropertyFromAnotherFile() {
        return customPropertyFromAnotherFile;
    }

    public String tellAStory() {
        return "the dependency saying" + myFirstClass.sayHello();
    }

}
