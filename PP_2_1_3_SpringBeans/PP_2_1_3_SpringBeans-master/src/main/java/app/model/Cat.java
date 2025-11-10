package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    @Override
    public String toString() {
        return "Im a Cat";
    }

}


//Создайте бин Dog, унаследуйте его от Animal. Создайте на основе этого класса компонент.