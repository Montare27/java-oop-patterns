package org.example.structural.adapter.adapter;

import org.example.structural.adapter.adaptee.Database;
import org.example.structural.adapter.taget.Document;

public class DatabaseAdapter implements DocumentAdapter {

    private Database database;

    public DatabaseAdapter() {
        this.database = new Database();
    }

    @Override
    public Document getDocument(String name) {
        String query = "query_of_document_" + name;
        String data = this.database.processQuery(query);
        return new Document(name, data);
    }
}
