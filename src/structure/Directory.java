package structure;

import java.util.List;

public class Directory extends FileSystemComponent {

    private List<FileSystemComponent> children;

    public Directory(String name, List<FileSystemComponent> children) {
        super(name);
        this.children = children;
    }

    public Directory(String name) {
        super(name);
    }

    public void addChild(FileSystemComponent fileSystemComponent) {
        if (fileSystemComponent == null) return;
        children.add(fileSystemComponent);
        fileSystemComponent.setParent(this);

    }

    public void removeChild(FileSystemComponent fileSystemComponent) {
        if (fileSystemComponent == null) return;
        children.remove(fileSystemComponent);
        fileSystemComponent.setParent(null);

    }

    @Override
    public long getSize() {
        long sum = 0;
        for (FileSystemComponent node : children) {
            sum += node.getSize();
        }

        return sum;
    }

    @Override
    public boolean isDirectory() {
        return true;
    }

    public List<FileSystemComponent> getChildren() {
        return children;
    }

    public void setChildren(List<FileSystemComponent> children) {
        this.children = children;
    }
}
