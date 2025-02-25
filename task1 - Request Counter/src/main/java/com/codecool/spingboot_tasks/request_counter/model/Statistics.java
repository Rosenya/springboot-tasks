package com.codecool.spingboot_tasks.request_counter.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class Statistics {
    private String methodName;
    private int usage;

    public Statistics(String methodName, int usage) {
        this.methodName = methodName;
        this.usage = usage;
    }
}
