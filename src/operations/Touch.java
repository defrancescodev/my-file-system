package operations;

import interfaces.FileSystemCommand;
import structure.Directory;
import structure.File;
import structure.FileSystemSimulator;

public class Touch implements FileSystemCommand {
    private String name;
    private String path;

    public Touch(String name) {
        this.name = name;
    }

    @Override
    public void execute(FileSystemSimulator simulator) {
        Directory currentDirectory = simulator.getCurrentDirectory();
        currentDirectory.addChild(new File(this.name));
    }

    @Override
    public String toLogString() {
        return "TOUCH;" + path + ";" + name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
