package structure;

import interfaces.FileSystemCommand;

public class FileSystemSimulator {
    private Directory root;
    private Directory currentDirectory;

    public FileSystemSimulator() {
        this.root = new Directory("/");
        this.currentDirectory = root;
    }

    public Directory getRoot() {
        return root;
    }

    public void processCommand(FileSystemCommand fileSystemCommand) {
        if (fileSystemCommand == null) return;
        fileSystemCommand.execute(this);
    }

    public void setRoot(Directory root) {
        this.root = root;
    }

    public Directory getCurrentDirectory() {
        return currentDirectory;
    }

    public void setCurrentDirectory(Directory currentDirectory) {
        this.currentDirectory = currentDirectory;
    }
}
