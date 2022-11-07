package connect4.modelViewController.composite.utils;

import java.util.ArrayList;

public abstract class Menu {

    private static final String OPTION = "----- Choose one option -----";

    private ArrayList<Command> commands;

    public Menu() {
        this.commands = new ArrayList<Command>();
    }

    public void execute() {
        this.getActiveCommands().get(getCommandSelected()).execute();
    }

    private int getCommandSelected() {
        ArrayList<Command> activeCommands = this.getActiveCommands();
        boolean error;
        int option;
        do {
            error = false;
            Console.getInstance().writeln();
            Console.getInstance().writeln(Menu.OPTION);
            for (int i = 0; i < activeCommands.size(); i++) {
                Console.getInstance().writeln((i + 1) + ") " + activeCommands.get(i).getTitle());
            }
            option = Console.getInstance().readInt("") - 1;
            if (!new ClosedInterval(0, activeCommands.size() - 1).isIncluded(option)) {
                error = true;
            }
        } while (error);
        return option;
    }

    private ArrayList<Command> getActiveCommands() {
        ArrayList<Command> commands = new ArrayList<Command>();
        for (int i = 0; i < this.commands.size(); i++) {
            if (this.commands.get(i).isActive()) {
                commands.add(this.commands.get(i));
            }
        }

        return commands;
    }

    protected void addCommand(Command command) {
        this.commands.add(command);
    }

}