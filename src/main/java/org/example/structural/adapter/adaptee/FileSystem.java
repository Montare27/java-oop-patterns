package org.example.structural.adapter.adaptee;

public class FileSystem {

    public String getFile(String fileName) {
        return "Content of file " + fileName;
    }
}
