package edu.seepure.javaee.spring.di.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by xiaoqiang on 2017/8/15.
 */
public class Department {

    private String name;
    private int id;
    private List<String> nickNames;
    private Set<String> employeeIds;
    private Map<String, Employee> employeeMap;
    private Properties properties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getNickNames() {
        return nickNames;
    }

    public void setNickNames(List<String> nickNames) {
        this.nickNames = nickNames;
    }

    public Set<String> getEmployeeIds() {
        return employeeIds;
    }

    public void setEmployeeIds(Set<String> employeeIds) {
        this.employeeIds = employeeIds;
    }

    public Map<String, Employee> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<String, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Department{");
        sb.append("name='").append(name).append('\'');
        sb.append(", id=").append(id);
        sb.append(", nickNames=").append(nickNames);
        sb.append(", employeeIds=").append(employeeIds);
        sb.append(", employeeMap=").append(employeeMap);
        sb.append(", properties=").append(properties);
        sb.append('}');
        return sb.toString();
    }
}
