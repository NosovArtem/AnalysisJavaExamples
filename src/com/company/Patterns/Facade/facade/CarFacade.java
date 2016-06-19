package com.company.Patterns.Facade.facade;

// фасад для работы 
import com.company.Patterns.Facade.parts.Door;
import com.company.Patterns.Facade.parts.Wheel;
import com.company.Patterns.Facade.parts.Zazhiganie;

public class CarFacade {

    private Door door = new Door();
    private Zazhiganie zazhiganie = new Zazhiganie();
    private Wheel wheel = new Wheel();

    public void go(){
        door.open();
        zazhiganie.fire();
        wheel.turn();
    }
    
        
    
}
