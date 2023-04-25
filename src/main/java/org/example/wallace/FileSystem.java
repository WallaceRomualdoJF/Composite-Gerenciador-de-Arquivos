package org.example.wallace;

public class FileSystem {
    private Directory root;

    public FileSystem() {
        root = new Directory("root");
    }

    public void addComponent(FileSystemComponent component) {
        root.addComponent(component);
    }

    public void removeComponent(FileSystemComponent component) {
        root.removeComponent(component);
    }

    public int getSize() {
        return root.getSize();
    }
}
