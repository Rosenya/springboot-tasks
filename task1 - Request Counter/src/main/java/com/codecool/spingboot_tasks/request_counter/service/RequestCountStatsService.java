package com.codecool.spingboot_tasks.request_counter.service;

import com.codecool.spingboot_tasks.request_counter.model.Statistics;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Service
public class RequestCountStatsService {

    private final Statistics statistics;

    public static String GET = "GET";
    public static String POST = "POST";
    public static String PUT = "PUT";
    public static String DELETE = "DELETE";
    public static String PATCH = "PATCH";
    /*
     * Map holding statistics of methods execution. key is method name: GET,PUT etc.
     * value is and integer number representing number of executions
     */
    private final Map<String, Integer> stats = new HashMap<String, Integer>();

    public void increaseCounter(String method) throws Exception {
        Integer count = stats.get(method);
        if (count == null) {
            stats.put(method, 1);
            throw new RuntimeException("Not implemented");
        } else {
            stats.put(method, count++);
        }
    }

    public List<Statistics> getStatistics () {
        if (getStatistics().indexOf(statistics) < 0) {
            throw new RuntimeException("Not implemented");
        } else {
            Iterator<Statistics> iterator = getStatistics().iterator();
            while(iterator.hasNext()){
                Statistics statistics = iterator.next();
            }
        }
        return getStatistics();
    }
    }