package com.github.giselepm.controller;

public class SlackResponse {
    private final String response_type = "in_channel";
    private final String text;

    public SlackResponse(final String text) {
        this.text = text;
    }

    public String getResponse_type() {
        return response_type;
    }

    public String getText() {
        return text;
    }
}
