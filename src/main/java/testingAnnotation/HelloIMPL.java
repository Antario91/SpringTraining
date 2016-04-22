package testingAnnotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Admin on 18.04.2016.
 */
@Component("helloIMPL")
@Qualifier("hello") //Qualifier нужен только для Autowired
public class HelloIMPL implements  interfaceOfHello {
    public String say() {
        return "Hello, my little World! (^^,)";
    }
}
