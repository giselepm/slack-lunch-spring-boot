package com.github.giselepm.service;

import org.springframework.stereotype.Component;

@Component
public class MenuService {

    public String getText(String userName) {
        return String.format("@%s these are the commands we have available:\n" +
                "`/add`: add a new place to have lunch\n" +
                "`/show`: shows all places saved to our database\n" +
                "`/random`: picks a random place for you to have lunch\n" +
                "`/menu`: displays this message", userName);
    }
}
