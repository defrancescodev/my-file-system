package interfaces;

import structure.FileSystemSimulator;

public interface FileSystemCommand {
    void execute(FileSystemSimulator simulator);

    String toLogString();
}
