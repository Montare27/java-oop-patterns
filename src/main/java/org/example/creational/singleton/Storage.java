package org.example.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class Storage {

    private static Storage uniqueStorage = null;

    private Map<String, String> files;

    private Storage() {
        this.files = new HashMap<>();
    }

    public static Storage getInstance() {
        if (uniqueStorage == null)
            uniqueStorage = new Storage();
        return uniqueStorage;
    }

    public void saveFile(String name, String content) {
        this.files.put(name, content);
    }

    public String loadFile(String name) {
        return this.files.get(name);
    }
}
