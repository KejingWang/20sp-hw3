package edu.upenn.cis350.hw3.data;

import java.util.Date;

public class Person {
    private String id;
    private String status;
    private long lastUpdated;
    
    public Person(String id, String status, long date) {
        this.id = id;
        this.status = status;
        this.lastUpdated = date;
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public long getLastUpdated() {
        return lastUpdated;
    }
    
    public String toString() {
        return "Person ID " + id + " reported as " + status + " as of " + (new Date(lastUpdated));
    }
}
