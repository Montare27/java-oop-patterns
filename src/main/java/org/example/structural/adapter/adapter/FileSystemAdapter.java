package org.example.structural.adapter.adapter;

import org.example.structural.adapter.taget.Document;
import org.example.structural.adapter.adaptee.FileSystem;

public class FileSystemAdapter implements DocumentAdapter {

    private FileSystem fileSystem;

    public FileSystemAdapter() {
        this.fileSystem = new FileSystem();
    }

    @Override
    public Document getDocument(String name) {
        String fileName = "file_name_of_document_" + name;
        String data = this.fileSystem.getFile(fileName);
        return new Document(name, data);
    }
}
