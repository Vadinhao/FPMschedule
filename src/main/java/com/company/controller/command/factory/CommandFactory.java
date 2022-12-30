package com.company.controller.command.factory;

import com.company.controller.command.*;
import com.company.controller.command.utils.Operation;
import com.company.model.exception.NotFoundOperationException;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    private static final Logger logger = Logger.getLogger(CommandFactory.class);
    private static final Map<String, Command> allKnownCommandsMap = new HashMap<>();

    static {
        allKnownCommandsMap.put(Operation.LOGIN.getCommand(), new LoginCommand());
        allKnownCommandsMap.put(Operation.LOGOUT.getCommand(), new LogoutCommand());
        allKnownCommandsMap.put(Operation.REGISTRATION.getCommand(), new RegistrationCommand());
        allKnownCommandsMap.put(Operation.SCHEDULE_GENERATOR.getCommand(), new ScheduleGeneratorCommand());
        allKnownCommandsMap.put(Operation.ADMIN_MENU.getCommand(), new AdminMenuCommand());
        allKnownCommandsMap.put(Operation.ADMIN_PROFILE.getCommand(), new AdminProfileCommand());
        allKnownCommandsMap.put(Operation.CLIENT_MENU.getCommand(), new ClientMenuCommand());
        allKnownCommandsMap.put(Operation.CLIENT_PROFILE.getCommand(), new ClientProfileCommand());
    }

    private CommandFactory() {
    }


    public static Command getCommand(String url) throws NotFoundOperationException {
        Command command = allKnownCommandsMap.get(url);
        logger.info(url);
        if (command == null) {
            throw new NotFoundOperationException();
        }

        return command;
    }
}
