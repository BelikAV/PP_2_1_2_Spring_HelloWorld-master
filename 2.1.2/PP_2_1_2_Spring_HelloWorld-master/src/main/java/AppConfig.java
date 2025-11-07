import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//

@Configuration
public class AppConfig {

    //метод создаёт bean и добавляет его в контекст, но это только в классах, где есть аннотация @Configuration
    // Bean будет такого типа, как тип возвращаемого значения

    @Bean(name = "helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name = "cat")
    @Scope(scopeName = "prototype")
    public Cat getCat() {
        return new Cat();
    }

}