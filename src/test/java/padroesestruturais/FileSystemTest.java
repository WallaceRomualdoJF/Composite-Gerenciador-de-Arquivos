package padroesestruturais;

import org.example.wallace.Directory;
import org.example.wallace.File;
import org.example.wallace.FileSystem;
import org.example.wallace.FileSystemComponent;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileSystemTest {
    @Test
    public void testFileSystem() {
        FileSystem fileSystem = new FileSystem();

        // Adiciona arquivos
        FileSystemComponent file1 = new File("file1", 10);
        FileSystemComponent file2 = new File("file2", 20);
        fileSystem.addComponent(file1);
        fileSystem.addComponent(file2);

        // Adiciona diretórios e arquivos
        FileSystemComponent dir1 = new Directory("dir1");
        FileSystemComponent file3 = new File("file3", 30);
        ((Directory) dir1).addComponent(file3);
        fileSystem.addComponent(dir1);

        // Remove arquivo
        fileSystem.removeComponent(file2);

        // Verifica tamanho
        assertEquals(40, fileSystem.getSize());
    }
}

