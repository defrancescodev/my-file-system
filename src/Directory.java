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

    }

    public void removeChild(FileSystemComponent fileSystemComponent) {
        if (fileSystemComponent == null) return;
        children.remove(fileSystemComponent);

    }

    public void printChildren() {
        for (int i = 0; i < children.size(); i++) {
            System.out.println(children.get(i));
        }

    }

    @Override
    public long getSize() {
        return 0;
    }

    @Override
    public boolean isDirectory() {
        return true;
    }
}
