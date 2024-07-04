package org.example.structural.adapter.adaptee;

public class Database {

    public String processQuery(String query) {
        return "Content of query " + query;
    }
}
