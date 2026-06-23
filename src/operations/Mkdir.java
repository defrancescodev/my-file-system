package operations;

import interfaces.FileSystemCommand;
import structure.Directory;
import structure.FileSystemSimulator;

public class Mkdir implements FileSystemCommand{
    private String name;
    private String path;


    public Mkdir(String name, String path) {
        this.name = name;
        this.path = path;

    }

    @Override
    public void execute(FileSystemSimulator simulator) {
        Directory currentDirectory = simulator.getCurrentDirectory();
        currentDirectory.addChild(new Directory(this.name));
    }

    @Override
    public String toLogString() {
        return "MKDIR;" + path + ";" + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
