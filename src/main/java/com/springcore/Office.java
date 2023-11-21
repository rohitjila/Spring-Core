package com.springcore;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
public class Office {

    private List employees;
    private Set employeesId;
    private Map employeesDesignationAndName;
    private Properties props;
}
