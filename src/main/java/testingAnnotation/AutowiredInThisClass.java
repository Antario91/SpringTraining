package testingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Admin on 21.04.2016.
 */
@Component("auto")
public class AutowiredInThisClass {
    @Autowired
    @Qualifier("hello")
    public interfaceOfHello h1;

//    @Autowired
//    @Qualifier("helloImplWithAnotherMethodSay")
//    public interfaceOfHello h2;
}
