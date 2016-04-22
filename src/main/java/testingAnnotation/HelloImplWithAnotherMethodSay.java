package testingAnnotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Admin on 19.04.2016.
 */
@Component("HelloImplWithAnotherMethodSay")
@Qualifier("helloImplWithAnotherMethodSay") //Qualifier нужен только для Autowired
public class helloImplWithAnotherMethodSay implements interfaceOfHello {
    public String say() {
        return "Hello, my little World! (^^,)_ComponentAnnotation";
    }
}
