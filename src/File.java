public class File extends FileSystemComponent{
    private String content;

    public File(String name) {
        super(name);
    }

    @Override
    public boolean isDirectory() {
        return false;
    }

    @Override
    public long getSize() {
        if (content == null) {
            return 0;
        }
        return content.length();
    }
}
