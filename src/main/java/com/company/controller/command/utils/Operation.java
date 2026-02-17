package com.company.controller.command.utils;

public enum Operation {
    LOGIN("/view/login"),
    REGISTRATION("/view/registration"),
    LOGOUT("/view/logout"),

    ADMIN_MENU("/view/admin/mainPageAdmin"),
    ADMIN_PROFILE("/view/admin/profileAdmin"),

    CLIENT_MENU("/view/client/mainPageClient"),
    CLIENT_PROFILE("/view/client/profileClient"),

    SCHEDULE_GENERATOR("/view/scheduleGenerator");

    private final String command;

    public String getCommand() {
        return command;
    }

    Operation(String command) {
        this.command = command;
    }
}
