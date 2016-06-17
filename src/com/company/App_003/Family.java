package com.company.App_003;

import com.sun.javafx.fxml.expression.Expression;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 13.01.2016.
 */
public class Family {

    private List<Person> listFamily = new ArrayList<>();

    public List<Person> getListFamily() {
        return listFamily;
    }

    public void setListFamily(List<Person> listFamily) {
        this.listFamily = listFamily;
    }
}

