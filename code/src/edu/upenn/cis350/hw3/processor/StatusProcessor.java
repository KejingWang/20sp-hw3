package edu.upenn.cis350.hw3.processor;

import java.util.HashMap;
import java.util.Map;

import edu.upenn.cis350.hw3.data.Person;
import edu.upenn.cis350.hw3.datamanagement.DataSource;


public class StatusProcessor {
    // DO NOT CHANGE THE VISIBILITY OF THESE FIELDS!
    protected DataSource dataSource;
    protected Map<String, Person> map = new HashMap<>();
    
    public StatusProcessor(DataSource ds) {
        dataSource = ds;
    }
    
    /* IMPLEMENT THIS METHOD! */
    public Person[] get(String[] ids) {
        // change accordingly
        return dataSource.get(ids);
    }
}
