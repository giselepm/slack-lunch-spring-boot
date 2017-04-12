package com.github.giselepm.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class MenuController {

    @RequestMapping(value = "/places/menu", method = POST, produces = APPLICATION_JSON_UTF8_VALUE, consumes = APPLICATION_JSON_VALUE)
    public SlackResponse handleRequest(@RequestBody Map request) {

        return new SlackResponse(String.format("@%s these are the commands we have available:\n" +
                "`/add`: add a new place to have lunch\n" +
                "`/show`: shows all places saved to our database\n" +
                "`/random`: picks a random place for you to have lunch\n" +
                "`/menu`: displays this message", request.get("user_name")));
    }

}
