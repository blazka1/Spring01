package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("Dog")
    private Animal animal;

    @Autowired
    @Qualifier("Timer")
    private Timer timer;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(this.timer.getTime());
        System.out.println("________________________");
    }


    public Timer getTimer() {
        return timer;
    }
}
