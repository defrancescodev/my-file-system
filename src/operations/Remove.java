package operations;

import interfaces.FileSystemCommand;
import structure.Directory;
import structure.FileSystemComponent;
import structure.FileSystemSimulator;

public class Remove implements FileSystemCommand {
    private String targetName;

    public Remove(String targetName) {
        this.targetName = targetName;
    }

    @Override
    public void execute(FileSystemSimulator simulator) {
        Directory currentDirectory = simulator.getCurrentDirectory();
        FileSystemComponent elementToRemove = null;

        for (FileSystemComponent child : currentDirectory.getChildren()) {
            if (child.getName().equals(this.targetName)) {
                elementToRemove = child;
                break;
            }
        }

        if (elementToRemove != null) {
            currentDirectory.removeChild(elementToRemove);
        }

    }

    @Override
    public String toLogString() {
        return "";
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }
}
