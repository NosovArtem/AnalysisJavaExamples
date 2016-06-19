package com.company.Patterns.Strategy.start;

import com.company.Patterns.Strategy.auth.UserChecker;
import java.io.File;
import com.company.Patterns.Strategy.strategy.DBAuth;
import com.company.Patterns.Strategy.strategy.FileAuth;


public class Main {

    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();
        
        userChecker.check(new DBAuth("jdbc://etc"));
        
        userChecker.check(new FileAuth(new File("c:\\file.txt")));
        
    }
}
