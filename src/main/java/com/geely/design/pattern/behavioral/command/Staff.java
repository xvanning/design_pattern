package com.geely.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-07 13:02
 */
public class Staff {
    private List<Command> list = new ArrayList<Command>();

    public void addCommand(Command command) {
        list.add(command);
    }

    public void executeCommands() {
        for (Command command : list) {
            command.excute();
        }
        list.clear();
    }
}