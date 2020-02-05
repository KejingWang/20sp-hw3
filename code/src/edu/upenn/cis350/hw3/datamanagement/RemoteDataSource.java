package edu.upenn.cis350.hw3.datamanagement;

import java.net.*;

import edu.upenn.cis350.hw3.data.Person;

public class RemoteDataSource implements DataSource {
    private String host;
    private int port;
    
    public RemoteDataSource() {
        // use Node Express defaults
        host = "localhost";
        port = 3000;
    }
    
    public RemoteDataSource(String host, int port) {
        this.host = host;
        this.port = port;
    }

    /* IMPLEMENT THIS METHOD! */
    public Person[] get(String[] ids) {
        // change accordingly
        return null;
    }

}
