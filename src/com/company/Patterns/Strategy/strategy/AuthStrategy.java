package com.company.Patterns.Strategy.strategy;

public interface AuthStrategy {
    boolean checkLogin(String name, String password);
}
