package com.company.Patterns.State.context;

import com.company.Patterns.State.state.TransformerState;

public class TransformerContext implements TransformerState{
    
    private TransformerState state;

    public TransformerState getState() {
        return state;
    }

    public void setState(TransformerState state) {
        this.state = state;
    }   

    @Override
    public void action() {
        this.state.action();
    }
   
    
}
