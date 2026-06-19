public abstract class FileSystemComponent {
    private String name;
    private Directory parent;

    public FileSystemComponent(String name) {
        this.name = name;
    }

    public abstract long getSize();

    public abstract boolean isDirectory();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Directory getParent() {
        return parent;
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }
}
