package com.company.Patterns.State.state;

public class FireState implements TransformerState{

    @Override
    public void action() {
        System.out.println("fire!!!");
    }

}
