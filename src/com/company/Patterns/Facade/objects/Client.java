package com.company.Patterns.Facade.objects;

import com.company.Patterns.Facade.facade.CarFacade;
import com.company.Patterns.Facade.parts.Door;
import com.company.Patterns.Facade.parts.Wheel;
import com.company.Patterns.Facade.parts.Zazhiganie;

public class Client {

    public static void main(String[] args) {
        // вызов без фасада
        Door door = new Door();
        door.open();

        Zazhiganie zazhiganie = new Zazhiganie();
        zazhiganie.fire();
        
        Wheel wheel = new Wheel();
        wheel.turn();
        

        // вызов с фасадом
        CarFacade carFacade = new CarFacade();
        carFacade.go();



    }
}
